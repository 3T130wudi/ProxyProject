
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="listTop.jsp"/>



<div class="col-md-9 col-sm-12" style="height: 80%;width: 70%;margin-left: 15%;margin-top: 5%;">



    <table>

        <tr>
            <td><h3>App URL-填写制作APP的系统UPL地址</h3></td>
        </tr>
        <
        <form action="updateappcation" method="post">
            <input type="hidden" id="application_id" name="application_id" value="${application.application_id}">
        <tr>
            <td>配置名称:<input readonly type="text" id="application_name" name="application_name" value="${application.application_name}"></td><br/>
            <p></p>
            <td>配置数值：<input id="application_numer" name="application_numer" type="text" value="${application.application_numer}"><br/></td>
            <td> <input type="submit" class="btn" id="service" name="service" value="保存" style="font-size: 25px;margin-left: 35px"></td>
        </tr>
        </form>
    </table>

</div>


<script src="js/jquery-1.12.4.js"></script>
<script src="js/configuration.js"></script>
<jsp:include page="listBottom.jsp"/>