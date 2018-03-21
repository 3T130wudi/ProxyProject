<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html lang="en">
<head>
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
        <form method="post" class="form-login" action="/selectpass"  >
            <h2 class="form-login-heading">找回密码找回密码--------第1步</h2>
            <div class="login-wrap">
                请输入用户名：<input name="uid" type="text" value=""><br/>
                <hr>
                <button class="btn btn-theme btn-block"  href="basic_table.html" type="submit">下一步</button>
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
