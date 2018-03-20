<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="listTop.jsp"%>


<div class="col-md-9 col-sm-12" style="height: 80%;width: 70%;margin-left: 15%;margin-top: 5%;">
    <div>
        <tr>
            <td></td>
            <td></td>
            <td>
                <form action="ALLContact" method="post">
                    关键字 <input type="text" name="contact_name"/>
                    客户 <input type="text" name="enterprise_name"/>
                    <input type="submit" value="提交"/>
                </form>
            </td>
        </tr>
        <table class="table table-advance table-hover">
            <h4></h4>
            <hr>
            <thead>
            <tr>
                <td>序号</td>
                <td>门户名称</td>
                <td>客户名称</td>
                <td>法人代表</td>
                <td>代理商</td>
                <td>注册日期</td>
                <td>类型</td>
                <td>状态</td>
                <td>操作</td>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${ContactList}" var="c">
                <tr>
                    <td>
                            ${c.id}
                    </td>
                    <td>
                            ${c.contact_name}
                    </td>
                    <td>
                            ${c.enterprise_id.enterprise_name}
                    </td>
                    <td>
                            ${c.enterprise_id.gateway_id.gateway_representative}
                    </td>
                    <td>
                            ${c.contact_name}
                    </td>
                    <td>
                        <fmt:formatDate value="${c.enterprise_id.gateway_id.gateway_date}" pattern="yyyy-MM-dd"/>
                    </td>
                    <td>
                        <c:if test="${c.enterprise_id.enterprise_type=='个人'}">
                            个人
                        </c:if>
                        <c:if test="${c.enterprise_id.enterprise_type=='企业'}">
                            企业
                        </c:if>
                    </td>
                    <td>
                        <c:if test="${c.enterprise_id.enterprise_state==1}">
                            启用
                        </c:if>
                        <c:if test="${c.enterprise_id.enterprise_state==0}">
                            未启用
                        </c:if>
                    </td>
                    <td>
                        <a href="#">查看</a>|<a href="#">修改</a>
                    </td>
                </tr>
            </c:forEach>

            </tbody>
        </table>
    </div><!-- /col-md-12 -->
</div>

<%@include file="listBottom.jsp"%>