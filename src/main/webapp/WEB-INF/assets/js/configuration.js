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

function deleteConfig(id) {
    $.ajax({
        type:"POST",
        url:"/deletefinance",
        data:{id:id},
        dataType:"json",
        success:function (date) {
            if(date){
                alert('删除成功');
                location.reload();
            }else{
                alert('删除失败')
            }
        },
        error:function () {
            alert("对不起内部服务器错误");
        }
    });
}