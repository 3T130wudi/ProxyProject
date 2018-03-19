
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


function updatefance(id) {
    $.ajax({
        type: "POST",
        url: "/updatafinance?finance_id="+id,
        dataType: "json",
        success: function (date) {
            if (date>0) {
                alert("修改成功");


            }
        },

        error: function () {
            alert("455555");
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
            alert("455555");
        }
    });
}

function selectone(id) {
    $.ajax({
        type: "POST",
        url: "/selectOne",
        data: {fid: id},
        dataType: "json",
        success: function (date) {
            if (date!=null) {
                $("#uid").val(date.id);
                $("#uroleId").val(date.roleId);
                $("#uname").val(date.name);
                $("#utype").val(date.type);
                $("#upassword").val(date.password);
                $("#userId").val(date.userId)
            }
        },

        error: function () {
            alert("455555");
        }
    });
}

