
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
            tow.focus();
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
        url:"/insertjudgment?finance_type="+type,
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

function selectcustmer() {

    var type=$("#customer_type").val();
    $.ajax({
        type: "POST",
        url:"/currencyselect?customer_type="+type,
        dataType: "json",
        success: function (date) {
            if (date) {
                alert("不能添加重复的配置类型");


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

