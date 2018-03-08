

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Title</title>
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

<div>
    <h3 style="margin-left: 300px">功能列表</h3>
    <hr/>
    <form action="/" method="post">
    <button type="submit" class="btn btn-secondary" >保存</button>
    <button type="button" class="btn btn-secondary" >取消</button>
    <input name="roleId" type="hidden"  value="${authorityList.roleId}">
    <table class="table table-advance table-hover">
    <thead>
    <tr>
        <td><input type="checkbox" onclick="swapCheck()" />全选</td>
        <td>功能名称</td>
        <td>创建时间</td>
        <td>是否启用</td>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>
            <c:if test="${authorityList.type !=0}">
                <input name="agwnt_1" value="${authorityList.agwnt_1}" checked="checked" type="checkbox" />
            </c:if>
            <c:if test="${authorityList.type ==0}">
                <input name="agwnt_1" value="${authorityList.agwnt_1}" type="checkbox" />
            </c:if>
        </td>
        <td>
            ${authorityList.agwnt_1}
        </td>
        <td>
            <fmt:formatDate value="${authorityList.dateTime}" pattern="yyyy-MM-dd"/>
        </td>
        <td>
            <c:if test="${authorityList.type ==1}" >
                启用
            </c:if>
            <c:if test="${authorityList.type ==0}" >
                不启用
            </c:if>
        </td>
    </tr>
    <tr>
        <td>
            <c:if test="${authorityList.type !=0}">
                <input name="agwnt_2" value="${authorityList.agwnt_2}" checked="checked" type="checkbox" />
            </c:if>
            <c:if test="${authorityList.type ==0}">
                <input name="agwnt_2" value="${authorityList.agwnt_2}"  type="checkbox" />
            </c:if>
        </td>
        <td>
            ${authorityList.agwnt_2}
        </td>
        <td>
            <fmt:formatDate value="${authorityList.dateTime}" pattern="yyyy-MM-dd"/>
        </td>
        <td>
            <c:if test="${authorityList.type ==1}" >
                启用
            </c:if>
            <c:if test="${authorityList.type ==0}" >
                不启用
            </c:if>
        </td>
    </tr>
    <tr>
        <td>
            <c:if test="${authorityList.type !=0}">
                <input name="agwnt_3" value="${authorityList.agwnt_3}" checked="checked" type="checkbox" />
            </c:if>
            <c:if test="${authorityList.type ==0}">
                <input name="agwnt_3" value="${authorityList.agwnt_3}"  type="checkbox" />
            </c:if>
        </td>
        <td>
            ${authorityList.agwnt_3}
        </td>
        <td>
            <fmt:formatDate value="${authorityList.dateTime}" pattern="yyyy-MM-dd"/>
        </td>
        <td>
            <c:if test="${authorityList.type ==1}" >
                启用
            </c:if>
            <c:if test="${authorityList.type ==0}" >
                不启用
            </c:if>
        </td>
    </tr>
    <tr>
        <td>
            <c:if test="${authorityList.type !=0}">
                <input name="agwnt_4" value="${authorityList.agwnt_4}" checked="checked" type="checkbox" />
            </c:if>
            <c:if test="${authorityList.type ==0}">
                <input name="agwnt_4" value="${authorityList.agwnt_4}" type="checkbox" />
            </c:if>
        </td>
        <td>
            ${authorityList.agwnt_4}
        </td>
        <td>
            <fmt:formatDate value="${authorityList.dateTime}" pattern="yyyy-MM-dd"/>
        </td>
        <td>
            <c:if test="${authorityList.type ==1}" >
                启用
            </c:if>
            <c:if test="${authorityList.type ==0}" >
                不启用
            </c:if>
        </td>
    </tr>
    <tr>
        <td>
            <c:if test="${authorityList.type !=0}">
                <input name="agwnt_5" value="${authorityList.agwnt_5}" checked="checked" type="checkbox" />
            </c:if>
            <c:if test="${authorityList.type ==0}">
                <input name="agwnt_5" value="${authorityList.agwnt_5}"  type="checkbox" />
            </c:if>
        </td>
        <td>
            ${authorityList.agwnt_5}
        </td>
        <td>
            <fmt:formatDate value="${authorityList.dateTime}" pattern="yyyy-MM-dd"/>
        </td>
        <td>
            <c:if test="${authorityList.type ==1}" >
                启用
            </c:if>
            <c:if test="${authorityList.type ==0}" >
                不启用
            </c:if>
        </td>
    </tr>
    <tr>
        <td>
            <c:if test="${authorityList.type !=0}">
                <input name="gateway_1" value="${authorityList.gateway_1}" checked="checked" type="checkbox" />
            </c:if>
            <c:if test="${authorityList.type ==0}">
                <input name="gateway_1" value="${authorityList.gateway_1}"  type="checkbox" />
            </c:if>
        </td>
        <td>
            ${authorityList.gateway_1}
        </td>
        <td>
            <fmt:formatDate value="${authorityList.dateTime}" pattern="yyyy-MM-dd"/>
        </td>
        <td>
            <c:if test="${authorityList.type ==1}" >
                启用
            </c:if>
            <c:if test="${authorityList.type ==0}" >
                不启用
            </c:if>
        </td>
    </tr>
    </tbody>
</table>
    </form>
</div>

<script src="js/jquery-1.12.4.js"></script>
<script src="js/bootstrap.min.js"></script>
<script class="include" type="text/javascript" src="js/jquery.dcjqaccordion.2.7.js"></script>
<script src="js/jquery.scrollTo.min.js"></script>
<script src="js/jquery.nicescroll.js" type="text/javascript"></script>
<!--common script for all pages-->
<script src="js/common-scripts.js"></script>

<script>
    //custom select box
    $(function(){
        $('select.styled').customSelect();
    });

</script>
<script type="text/javascript">
    //checkbox 全选/取消全选
    var isCheckAll = false;
    function swapCheck() {
        if (isCheckAll) {
            $("input[type='checkbox']").each(function() {
                this.checked = false;
            });
            isCheckAll = false;
        } else {
            $("input[type='checkbox']").each(function() {
                this.checked = true;
            });
            isCheckAll = true;
        }
    }
</script>

</body>
</html>
