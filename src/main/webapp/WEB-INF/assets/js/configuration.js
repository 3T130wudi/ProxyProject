
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
            alert("455555");
        }
    });



}


