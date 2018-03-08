<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="listTop.jsp"/>

<div class="col-md-9 col-sm-12" style="height: 80%;width: 70%;margin-left: 15%;margin-top: 5%;">
    <div>
        <table class="table table-striped table-advance table-hover">
            <h4></h4>

            <thead>
            <tr>
                <td>序号</td>
                <td>客户名称</td>
                <td>法人代表</td>
                <td>注册时间</td>
                <td>类型</td>
                <td>状态</td>
                <td>操作</td>
            </tr>
            </thead>
            <tbody>
            <a class="btn btn-primary" href="GatewayObject?id=${g.id}&model=1">添加</a>
            <c:forEach items="${gateway}" var="g">
            <tr>

                    <td>
                            ${g.id}
                    </td>
                    <td>
                            ${g.user_id.name}
                    </td>
                    <td>
                            ${g.contact_id.enterprise_id.gateway_id.gateway_representative}
                    </td>
                    <td>
                            ${g.contact_id.enterprise_id.gateway_id.gateway_date}
                    </td>
                    <td>
                            ${g.contact_id.enterprise_id.enterprise_type}
                    </td>
                    <td>
                            <c:if test="${g.contact_id.enterprise_id.enterprise_state==0}">
                                已停用
                            </c:if>
                            <c:if test="${g.contact_id.enterprise_id.enterprise_state==1}">
                                以起用
                            </c:if>
                    </td>
                    <td>
                        <a href="GatewayObject?id=${g.id}&model=0" class="btn btn-primary">查看</a>
                        <a href="GatewayObject?id=${g.id}&model=0" class="btn btn-primary">修改</a>
                        <a href="#" class="btn btn-primary">
                            <c:if test="${g.contact_id.enterprise_id.enterprise_state==0}">
                                已停用
                            </c:if>
                            <c:if test="${g.contact_id.enterprise_id.enterprise_state==1}">
                                以起用
                            </c:if>
                        </a>
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
                    <td>
                        <form action="GatewayList">
                            <input name="name" type="text"/>
                            <input type="submit" value="查询">
                        </form>
                    </td>
                </tr>
            </tbody>
        </table>
    </div><!-- /col-md-12 -->
</div>

<jsp:include page="listBottom.jsp"/>