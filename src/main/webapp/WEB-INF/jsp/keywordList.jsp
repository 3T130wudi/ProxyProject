<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="listTop.jsp"/>

<div class="" style="height: 80%;width: 70%;margin-left: 15%;margin-top: 5%;">
    <div>
        <table class="table  table-advance table-hover">
            <h4></h4>

            <thead>
            <tr>
                <td>序号</td>
                <td>关键字</td>
                <td>客户名称</td>
                <td>代理商</td>
                <td>申请年限</td>
                <td>申请日期</td>
                <td>到期日期</td>
                <td>申请到期状态</td>
                <td>审核状态</td>
                <td>使用状态</td>
                <td>APP开通状态</td>
                <td>操作</td>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${keyword}" var="k">
            <tr>

                    <td>
                            ${k.id}
                    </td>
                    <td>
                            ${k.keyword}
                    </td>
                    <td>
                            ${k.user_id.name}
                    </td>
                    <td>
                            ${k.agent_id.user_id.name}
                    </td>
                    <td>
                            ${k.ageLimit}
                    </td>
                    <td>
                            ${k.keywordDate}
                    </td>
                    <td>
                            ${k.keywordsOverdue}
                    </td>
                <td>
                    <c:if test="${k.getApplication() eq 0}">
                        <p>未过期</p>
                    </c:if>
                    <c:if test="${k.getApplication() eq 1}">
                        <p>过期</p>
                    </c:if>
                </td>
                <td>
                    <c:if test="${k.verifier eq 0}">
                        已申请
                    </c:if>
                    <c:if test="${k.verifier eq 1}">
                        申请中
                    </c:if>
                    <c:if test="${k.verifier eq 2}">
                        已通过
                    </c:if>
                </td>
                <td>
                    <c:if test="${k.user_mode eq 0}">
                        未使用
                    </c:if>
                    <c:if test="${k.user_mode eq 1}">
                        已使用
                    </c:if>
                </td>
                <td>
                    <c:if test="${k.APP_id.app_id <0}">
                        未开通
                    </c:if>
                    <c:if test="${k.APP_id.app_id >0}">
                        已开通
                    </c:if>
                </td>
                <td>
                    <c:if test="${k.verifier eq 2 and k.APP_id.app_id < 0 and k.user_mode eq 1}">
                        <a href="#" class="btn btn-primary">开通APP 续费</a>
                    </c:if>
                    <c:if test="${k.APP_id.app_id >0 and k.verifier eq 2}">
                        <a href="#" class="btn btn-primary">续费</a>
                    </c:if>
                    <c:if test="${k.verifier <= 1}">
                        无操作
                    </c:if>
                </td>
            </tr>
            </c:forEach>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <form action="keywordList">
                    <td>
                        <input name="keyword"  type="text"/>
                    </td>
                    <td>
                        <input type="submit" class="btn btn-primary" value="查询">
                    </td>
                </form>
            </tr>
            </tbody>
        </table>
    </div><!-- /col-md-12 -->
</div>

<jsp:include page="listBottom.jsp"/>