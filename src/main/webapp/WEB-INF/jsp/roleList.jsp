
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="listTop.jsp"%>
<div class="col-md-9 col-sm-12" style="height: 80%;width: 70%;margin-left: 15%;margin-top: 5%;">
    <div>
        <table class="table table-striped table-advance table-hover">
            <h4></h4>
            <thead>
            <tr>
        <div class="container">
            <!-- 按钮：用于打开模态框 -->
            <button  class="btn btn-primary" type="button" data-toggle="modal" data-target="#myModal" >
                添加
            </button>
            <!-- 模态框 -->
            <div class="modal fade" id="myModal">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4 class="modal-title">添加角色信息</h4>
                        </div>
                        <form action="/addRole" method="post" >
                            <!-- 模态框主体 -->
                            <div class="modal-body">
                                名字名称：<input name="name" type="text" value=""><br/>
                                <p></p>
                                是否启用：<select name="type">
                                <option value="启用">启用</option>
                                <option value="不启用">不启用</option>
                            </select>
                            </div>

                            <!-- 模态框底部 -->
                            <div class="modal-footer">
                                <button type="submit" class="btn btn-secondary" >确定</button>
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>

        </div>
        <table class="table table-advance table-hover">
            <thead>
            <tr>
                <td>编号</td>
                <td>角色名称</td>
                <td>创建时间</td>
                <td>是否启用</td>
                <td>操作</td>
            </tr>
            </thead>
            <tbody>

            <c:forEach items="${roleList}" var="r">
                <tr>
                    <td>
                            ${r.id}
                    </td>
                    <td>
                            ${r.name}
                    </td>
                    <td>
                        <fmt:formatDate value="${r.fristDate}" pattern="yyyy-MM-dd"/>
                    </td>
                    <td>
                            ${r.type}
                    </td>
                    <td>

                        <button  class="btn btn-primary" type="button" data-toggle="modal" data-target="#myModal" >
                            修改
                        </button>
                        <a href="/deleteRole?id=${r.id}" class="btn btn-primary">删除</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

            </tr></thead></table>   </div><!-- /col-md-12 -->
</div>
<%@include file="listBottom.jsp"%>


