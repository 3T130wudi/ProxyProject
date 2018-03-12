
//用户名
$(function () {
  $("#service_type").blur(function () {
      var name=$("#service_type").val();
      if(name==""){
          alert("配置类型不能为空！");

      };

      $("#service_tow").blur(function () {
          var tow=$("#service_tow").val();
          if(tow==""){
              alert("配置数值不能为空！");

          }
      });

  });



});
function selectname() {
    $("#service_type").val();
    $.ajax({
        type: "POST",
        url: "/selectname",
        dataType: "json",
        success: function (date) {
            if (date!=null) {
                alert(date);
                alert(date.service_type);
                $("#service_type").append(date.service_type);


            }
        },

        error: function () {
            alert("对不起内部服务器错误");
        }
    });

}

function selectfanace(id){
    $.ajax({
        type: "POST",
        url: "/selectfnance",
        data: {fid: id},
        dataType: "json",
        success: function (date) {
            if (date!=null) {
                $("#financetype").val(date.finance_type);
                $("#financeenable").val(date.finance_enable);


            }
        },

        error: function () {
            alert("对不起内部服务器错误");
        }
    });



}

// $(function (){
//     $("#configId").on("click",function () {
//         var a=$("#configId").val();
//         $.ajax({
//             type:"POST",
//             url:"/deletefinance?financeId="+a,
//             dataType:"json",
//             success:function (date) {
//                 if(date>0){
//                    alert('删除成功')
//                 }else{
//                     alert('删除失败')
//                 }
//             },
//             error:function () {
//                 alert("对不起内部服务器错误");
//             }
//         });
//     });
// });



/*
function deleteConfig(id) {

    var Name = $("#configId").val();
    var flag = confirm("确定要删除" + Name + "的信息吗?");
    if(flag) {
        $.ajax({
            type: "POST",
            url: "/deletefinance",
            data: {id: id},
            dataType: "json",
            success: function (date) {
                if (date) {

                    window.location.reload();

                } else {
                    alert('删除失败')
                }
            },
            error: function () {
                alert("对不起内部服务器错误");
            }
        });
    }

}
*/
