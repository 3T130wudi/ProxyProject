<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <meta charset="utf-8">
    <title>首页</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="font-awesome/css/font-awesome.css" rel="stylesheet" />
    <!-- Custom styles for this template -->
    <link href="css/style.css" rel="stylesheet">
    <link href="css/style-responsive.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.js"></script>
    <![endif]-->
</head>

<body>

<header class="header black-bg" style="background-color: #424A5D;border: #424A5D">
    <div class="sidebar-toggle-box">
        <div class="fa fa-bars tooltips" data-placement="right"></div>
    </div>
    <!--logo start-->
    <a class="logo"><b>欢迎您:${user.role.name} ${user.name}</b></a>
    <a href="/showUserList"/>
    <!--logo end-->
    <div class="nav notify-row" id="top_menu">
        <!--  notification start -->
        <ul class="nav top-menu">
            <li id="header_inbox_bar" class="dropdown">
                <div id="time" style="padding-top: 14px;">
                    <script>
                        document.getElementById('time').innerHTML=new Date().toLocaleString();
                        setInterval("document.getElementById('time').innerHTML=new Date().toLocaleString();",1000);
                    </script>
                </div>
            </li>
            <!-- inbox dropdown end -->
        </ul>
        <!--  notification end -->
    </div>
    <div class="top-menu">
        <ul class="nav pull-right top-menu">
            <li><a class="logout" href="/romoveSession">退出</a></li>
        </ul>
    </div>
</header>

<section>
    <div class="row">

        <div  id="sidebar"  class="nav-collapse col-md-3">
            <!-- sidebar menu start-->
            <ul class="sidebar-menu" id="nav-accordion">

                <!--显示代理商管理-->
                <c:if test="${user.role.authorityList.authority_agwnt != null}">
                    <li class="sub-menu">
                        <a href="javascript:;" >
                            <span>${user.role.authorityList.authority_agwnt}</span>
                        </a>
                        <ul class="sub">
                            <li><a  href="keyword">${user.role.authorityList.agwnt_1}${id}</a></li>
                            <li><a  href="GatewayList">${user.role.authorityList.agwnt_2}</a></li>
                            <li><a  href="FinancialStatementsList">${user.role.authorityList.agwnt_3}</a></li>
                            <li><a  href="keywordList">${user.role.authorityList.agwnt_4}</a></li>
                        </ul>
                    </li>
                </c:if>
                <!--显示门户管理-->
                <c:if test="${user.role.authorityList.authority_gateway != null}">
                    <li class="sub-menu">
                        <a href="javascript:;" >

                            <span>${user.role.authorityList.authority_gateway}</span>
                        </a>
                        <ul class="sub">
                            <li><a  href="enterpriseMenList">${user.role.authorityList.gateway_1}</a></li>
                        </ul>
                    </li>
                </c:if>

                <!--显示报表管理-->
                <c:if test="${user.role.authorityList.authority_report != null}">
                    <li class="sub-menu">
                        <a href="javascript:;" >
                            <span>${user.role.authorityList.authority_report}</span>
                        </a>
                        <ul class="sub">
                            <li><a  href="FinancialStatementsList">${user.role.authorityList.report_1}</a></li>
                        </ul>
                    </li>
                </c:if>

                <!--显示系统管理-->
                <c:if test="${user.role.authorityList.authority_system != null}">
                    <li class="sub-menu">
                        <a href="javascript:;" >

                            <span>${user.role.authorityList.authority_system}</span>
                        </a>
                        <ul class="sub">
                            <li><a  href="/selectList">${user.role.authorityList.system_2}</a></li>
                            <li><a  href="/showSystem">${user.role.authorityList.system_3}</a></li>
                            <li><a  href="/showUserList">${user.role.authorityList.system_4}</a></li>
                            <li><a  href="/showRizhi">日志管理</a></li>
                        </ul>
                    </li>
                </c:if>

                <!--显示系统配置管理-->
                <c:if test="${user.role.authorityList.authority_configuration != null}">
                    <li class="sub-menu">
                        <a href="javascript:;" >
                            <span>${user.role.authorityList.authority_configuration}</span>
                        </a>
                        <ul class="sub">
                            <li><a  href="/queryfinance">${user.role.authorityList.configuration_1}</a></li>
                            <li><a  href="/selectService">${user.role.authorityList.configuration_2}</a></li>
                            <li><a  href="/selectlife">${user.role.authorityList.configuration_3}</a></li>
                            <li><a  href="/selectapplication">${user.role.authorityList.configuration_4}</a></li>
                            <li><a  href="/selectcurrency">${user.role.authorityList.configuration_5}</a></li>
                            <li><a  href="/selectcertificates">${user.role.authorityList.configuration_6}</a></li>
                            <li><a  href="/selectDiscount">${user.role.authorityList.configuration_7}</a></li>
                        </ul>
                    </li>
                </c:if>
            </ul>
            <!-- sidebar menu end-->
        </div>
    </div>
</section>