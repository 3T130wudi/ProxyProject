
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="listTop.jsp"%>

<div class="col-md-9 col-sm-12" style="height: 80%;width: 70%;margin-left: 15%;margin-top: 5%;">

    <nav class="navbar navbar-default" role="navigation">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse"
                        data-target="#example-navbar-collapse">
                    <span class="sr-only">切换导航</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">角色权限配置</a>
            </div>
            <div class="collapse navbar-collapse" id="example-navbar-collapse">
                <ul class="nav navbar-nav">
                    <li><a href="/showRoleone" target="iframe1">系统管理员</a></li>
                    <li><a href="/showRoletwo" target="iframe1">代理商</a></li>
                    <li><a href="/showRolethere" target="iframe1">财务</a></li>
                    <li><a href="/showRolefour" target="iframe1">客服</a></li>
                    <li><a href="/showRolefive" target="iframe1">市场</a></li>
                    <li><a href="/showRolesix" target="iframe1">大区经理</a></li>
                    <li><a href="/showRoleseven" target="iframe1">渠道经理</a></li>
                </ul>
            </div>
        </div>
    </nav>
    <div>
        <iframe name="iframe1" src="" width="800px" height="1000px" />
    </div>
</div>
<%@include file="listBottom.jsp"%>
