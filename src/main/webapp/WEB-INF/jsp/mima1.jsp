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
        <form method="post" class="form-login" action="/rpassword"  >
            <h2 class="form-login-heading">找回密码--------第二步</h2>
            <div class="login-wrap">
                <input type="hidden" name="uid" value="${mimao.userId}">
                请选择密保问题:
                <select name="wenti">
                    <option value="1">${mimao.wenTi_one}</option>
                    <option value="2">${mimao.wenTi_two}</option>
                    <option value="3">${mimao.wenTi_there}</option>
                </select><br>
                   答案 :<input style="margin-left: 65px" name="daan" type="text" value=""><br/>
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
