function SelectkeywordList(id) {
    $.ajax({
        type:"post",
        url:"/selectKeyword",
        data:{id:id},
        dataType:"json",
        success: function (date){
            if (date != null){
                $("#usename").val(date.user_id.name);
                $("#keyword").val(date.keyword);
            }
        },
        error: function () {
            alert("对不起内部服务器错误");
        }
    })
}