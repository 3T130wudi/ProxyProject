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
	  <script src="js/configation.js"></script>

  </head>

  <body>
	  <div id="login-page">
	  	<div class="container">
		      <form method="post" class="form-login" action="/login" onsubmit="return checkForm3();" id="frm" >
		        <h2 class="form-login-heading">现在登录</h2>
		        <div class="login-wrap">
		            <input name="userId"  type="text" class="form-control" placeholder="账号" autofocus>
		            <br>
		            <input id="password" name="password" type="password" class="form-control" placeholder="密码">
		            <label class="checkbox">
		                <span class="pull-right">
		                    <a data-toggle="modal" href="/showpass" >忘记密码?</a>
		                </span>
		            </label>
		            <button id="button1"  class="btn btn-theme btn-block"  href="basic_table.html" type="submit"><i class="fa fa-lock"></i>登录</button>
		            <hr>
		            <div class="registration">
					版权xxxxxxxxx
		                </a>
		            </div>
		        </div>
			  </form>

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
