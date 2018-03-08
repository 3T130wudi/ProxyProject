<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html lang="en">
  <head>
	  <meta charset="utf-8">
	  <meta name="viewport" content="width=device-width, initial-scale=1.0">
	  <meta name="description" content="">
	  <meta name="author" content="Dashboard">
	  <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

	  <title>登录</title>


    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link href="css/style.css" rel="stylesheet">
    <link href="css/style-responsive.css" rel="stylesheet">
	  <script src="js/html5shiv.js"></script>
      <script src="js/respond.js"></script>

  </head>

  <body>
	  <div id="login-page">
	  	<div class="container">
	  	
		      <form class="form-login" action="/login">
		        <h2 class="form-login-heading">现在登录</h2>
		        <div class="login-wrap">
		            <input name="userId" type="text" class="form-control" placeholder="账号" autofocus>
		            <br>
		            <input name="password" type="password" class="form-control" placeholder="密码">
		            <label class="checkbox">
		                <span class="pull-right">
		                    <a data-toggle="modal" href="login.jsp#myModal">忘记密码?</a>
		
		                </span>
		            </label>
		            <button class="btn btn-theme btn-block" href="basic_table.html" type="submit"><i class="fa fa-lock"></i>登录</button>
		            <hr>
		            <div class="registration">
						还没有帐户？<br/>
		                <a class="" href="#">
						创建一个帐户
		                </a>
		            </div>
		        </div>
			  </form>
			<!-- Modal -->
		          <div aria-hidden="true" aria-labelledby="myModalLabel" role="dialog" tabindex="-1" id="myModal" class="modal fade">
		              <div class="modal-dialog">
		                  <div class="modal-content">
		                      <div class="modal-header">
		                          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                          <h4 class="modal-title">忘记密码？</h4>
		                      </div>
		                      <div class="modal-body">
		                          <p>在下方输入你的电子邮件地址以重设密码.</p>
		                          <input type="text" name="email" placeholder="Email" autocomplete="off" class="form-control placeholder-no-fix">
		
		                      </div>
		                      <div class="modal-footer">
		                          <button data-dismiss="modal" class="btn btn-default" type="button">取消</button>
		                          <button class="btn btn-theme" type="button">递交</button>
		                      </div>
		                  </div>
		              </div>
		          </div>
		          <!-- modal -->

	  	</div>
	  </div>

    <!-- js placed at the end of the document so the pages load faster -->
    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>

    <script type="text/javascript" src="js/jquery.backstretch.min.js"></script>
    <script>
        $.backstretch("assets/img/", {speed: 500});
    </script>

  </body>
</html>
