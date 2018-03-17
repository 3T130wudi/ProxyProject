
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="listTop.jsp"/>
<style>
    h3{
        margin-left: 300px;
    }
    td{
        text-align: center;
       padding-bottom: 50px;
    }
</style>
<div class="col-md-9 col-sm-12" style="height: 80%;width: 70%;margin-left: 15%;margin-top: 5%;">
    <table>

        <tr>
            <td><h3>服务年限管理-填写最大的服务年限</h3></td>
        </tr>
        <form action="updatelife" method="post">
            <input type="hidden" name="life_id" value="${life.life_id}">
            <tr>
            <td>配置名称<input readonly type="text" id="life_name"  name="life_name" value="${life.life_name}"></td>
            <td>配置数值：<input id="life_numer" name="life_numer" type="text" value="${life.life_numer}"></td>
               <td> <input type="submit" class="btn" id="service" name="service" value="保存" style="font-size: 25px;"></td>
        </tr>


        </form>
    </table>



</div>



<script src="js/jquery-1.12.4.js"></script>
<script src="js/configuration.js"></script>
<jsp:include page="listBottom.jsp"/>