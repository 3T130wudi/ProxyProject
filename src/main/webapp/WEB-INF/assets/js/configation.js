
$(function () {
    $("#finance_type").blur(function () {
        var name=$("#finance_type").val();
        if(name==""){
            alert("财务类型不能为空！");
            name.focus();
            return false;
        };
    });
});
$(function () {
    $("#customer_type").blur(function () {
        var name=$("#customer_type").val();
        if(name==""){
            alert("客户类型不能为空！");
            name.focus();
            return false;
        };
    });
});
$(function () {
    $("#certificates_type").blur(function () {
        var name=$("#certificates_type").val();
        if(name==""){
            alert("证件类型不能为空！");
            name.focus();
            return false;
        };
    });
});
$(function () {
    $("#servicepe").blur(function () {
        var name=$("#servicepe").val();
        if(name==""){
            alert("配置类型不能为空！");
            name.focus();
            return false;
        };
    });
});

$(function () {
    $("#service_tow").blur(function () {
        var tow=$("#service_tow").val();
        if(tow==""){
            alert("配置数值不能为空！");
            return false;
        }
    });
});

$(function () {
    $("#financetype").blur(function () {
        var finan=$("#financetype").val();
        if(finan==""){
            alert("类型名称不能为空！");
            tow.focus();
            return false;
        }
    });
});


function insertjudgment(){
   var type=$("#finance_type").val();
    $.ajax({
        type: "POST",
        data:{finance_type:type},
        url:"/insertjudgment",
        dataType: "json",
        success: function (date) {
                if (date) {
                    alert("不能添加重复的配置类型");


            }
        },
        error: function () {

        }
    });
};

function del() {
    var msg = "您确定要删除吗？";
    if (confirm(msg)==true){
        return true;
    }else{
        return false;
    }
};

function deletecust() {
    var msg = "您确定要删除吗？";
    if (confirm(msg)==true){
        return true;
    }else{
        return false;
    }
};

function deletecerti() {
    var msg = "您确定要删除吗？";
    if (confirm(msg)==true){
        return true;
    }else{
        return false;
    }
};

function deletedosount() {
    var msg = "您确定要删除吗？";
    if (confirm(msg)==true){

        return true;
    }else{
        return false;
    }

}




function selectcustmer(){
    var type=$("#customer_type").val();
    $.ajax({
        type: "POST",
        data:{customer_type:type},
        url:"/currencyselect",
        dataType: "json",
        success: function (date) {
            if (date) {
                alert("不能添加重复的配置类型");


            }
        },
        error: function () {

        }
    });
};
function customerselect(id) {

    $.ajax({
        type: "POST",
        data:{customer_id:id},
        url:"/customerselect",
        dataType: "json",
        success: function (date) {
            if (date) {

                $("#customer_id").val(date.customer_id);
              $("#customertype").val(date.customer_type);
                $("#customerenable").val(date.customer_enable);


            }
        },
        error: function () {

        }
    });
};
function certificatesselect() {
    var type=$("#certificates_type").val();
    $.ajax({
        type: "POST",
        data:{certificates_type:type},
        url:"/certificatesselect",
        dataType: "json",
        success: function (date) {
            if (date) {
                alert("不能添加重复的配置类型");


            }
        },
        error: function () {

        }
    });

};
function selectficates(id) {
    $.ajax({
        type: "POST",
        data:{certificates_id:id},
        url:"/selectficates",
        dataType: "json",
        success: function (date) {
            if (date) {

                $("#certificates_id").val(date.certificates_id);
                $("#certificatestype").val(date.certificates_type);
                $("#certificatesenable").val(date.certificates_enable);


            }
        },
        error: function () {

        }
    });

};
function discountselect() {
    var type=$("#discount_type").val();
    $.ajax({
        type: "POST",
        data:{discount_type:type},
        url:"/discountselect",
        dataType: "json",
        success: function (date) {
            if (date) {
                alert("不能添加重复的配置类型");


            }
        },
        error: function () {

        }
    });
};


function checkForm(frm) {
    var flag = true;
    $("#frm input[type='text']").each(function(i, obj) {
        if(obj.value == "") {
            alert('输入框不能为空');
            flag = false;
            return false;
        }
    });
    return flag;
};

function checkForm1(frm) {
    var flag = true;
    $("#frm input[type='text']").each(function(i, obj) {
        if(obj.value == "") {
            alert('输入框不能为空');
            flag = false;
            return false;
        }
    });
    return flag;
};
function checkForm2(frm) {
    var flag = true;
    $("#frm input[type='text']").each(function(i, obj) {
        if(obj.value == "") {
            alert('输入框不能为空');
            flag = false;
            return false;
        }
    });
    return flag;
};

function checkForm3(frm) {
    var flag = true;
    $("#frm input[type='text']").each(function(i, obj) {
        if(obj.value == "") {
            alert('用户名不能为空');
            flag = false;
            return false;
        }else if ($("#password").val()==""){
                alert('密码不能为空');
                return false;

        }
    });
    return flag;
};


function aaaa(aa) {
    var flag = true;
    $("#aa input[type='password']").each(function(i, obj) {
        if(obj.value == "") {
            alert('密码不能为空');
            flag = false;
            return false;
        }
    });
    return flag;
};


function servicecheckForm(frm) {
    var flag = true;
    $("#frm input[type='text']").each(function(i, obj) {
        if(obj.value == "") {
            alert('输入框不能为空');
            flag = false;
            return false;
        }
    });
    return flag;
};

function soutselect(id) {
    $.ajax({
        type: "POST",
        data:{discount_id:id},
        url:"/soutselect",
        dataType: "json",
        success: function (date) {
            if (date) {
                $("#discountid").val(date.discount_id);
                $("#discounttype").val(date.discount_type);
                $("#discountnumer").val(date.discount_numer);
                $("#discountactual").val(date.discount_actual);
                $("#discountenable").val(date.discount_enable)
            }
        },
        error: function () {

        }
    });

}

/*function delectfincea() {
if(confirm("您确定要删除该条记录吗?")) {
    alert('删除成功');
    return true;
}else{
    return false;

}
}
*/

