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
            } else {

            }
        },
        error: function () {
            alert("对不起内部服务器错误");
        }
    });

}