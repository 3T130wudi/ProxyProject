
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="listTop.jsp"%>
<div class="col-md-9 col-sm-12" style="height: 80%;width: 70%;margin-left: 15%;margin-top: 5%;">
    <div>
        <table class="table table-striped table-advance table-hover">
            <h4></h4>
            <thead>
            <tr>
                <table class="table table-advance table-hover">
                    <thead>
                    <tr>
                        <td>编号</td>
                        <td>操作人</td>
                        <td>操作说明</td>
                        <td>操作时间</td>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${pagerizhi.datas}" var="pr">
                        <tr>
                            <td>${pr.id}</td>
                            <td>${pr.username}</td>
                            <td>${pr.shuomin}</td>
                            <td>
                                <fmt:formatDate value="${pr.datetime}" pattern="yyyy-MM-dd"/>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
                <div style="margin-left: 185px">
                    <a class="btn btn-default" href="/showRizhi?pageNo=1">首页</a>
                    <a class="btn btn-default" href="/showRizhi?pageNo=${pagerizhi.pageNo-1}">上一页</a>
                    <c:if test="${pagerizhi.pageNo<pagerizhi.totalPage}">
                        <a class="btn btn-default" href="/showRizhi?pageNo=${pagerizhi.pageNo+1}">下一页</a>
                    </c:if>
                    <a class="btn btn-default" href="/showRizhi?pageNo=${userList.totalPage}">尾页</a>
                </div>
            </tr>
            </thead>
        </table>
    </div><!-- /col-md-12 -->
</div>
<%@include file="listBottom.jsp"%>


