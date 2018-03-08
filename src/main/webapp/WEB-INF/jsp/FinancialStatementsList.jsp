<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="listTop.jsp"/>

<div class="col-md-9 col-sm-12" style="height: 80%;width: 70%;margin-left: 15%;margin-top: 5%;">
    <div>
        <tr>
            <td></td>
            <td></td>
            <td>
                <form action="FinancialStatementsList">
                    操作类型   <select name="approach_id">
                        <option value="-1">全部</option>
                    <c:forEach items="${CapitalSource}" var="c">
                        <option value="${c.id}">${c.approach}</option>
                    </c:forEach>
                </select>
                    操作时间    <input name="apply_date" type="date"/>
                    至 <input name="pass_date" type="date"/>
                    <input type="submit" value="查询">
                </form>
            </td>
        </tr>
        <table class="table table-advance table-hover">
            <h4></h4>
            <hr>
            <thead>
            <tr>
                <td>序号</td>
                <td>账户类型</td>
                <td>财务资金</td>
                <td>账户余额</td>
                <td>备注信息</td>
                <td>明细时间</td>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${FinancialStatements}" var="F">
            <tr>
                    <td>
                            ${F.id}
                    </td>
                <td>
                        ${F.approach_id.approach}
                </td>
                <td>
                        ${F.capital}
                </td>
                <td>
                        ${F.accountBalance}
                </td>
                <td>
                        ${F.remark}
                </td>
                <td>
                        ${F.apply_date}
                </td>
            </tr>
            </c:forEach>

            </tbody>
        </table>
    </div><!-- /col-md-12 -->
</div>

<jsp:include page="listBottom.jsp"/>