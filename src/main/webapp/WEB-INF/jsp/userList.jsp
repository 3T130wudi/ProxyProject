
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="listTop.jsp"%>
<div class="col-md-9 col-sm-12" style="height: 80%;width: 70%;margin-left: 15%;margin-top: 5%;">
    <div>
        <table class="table table-striped table-advance table-hover">
            <h4></h4>
            <thead>
            <tr>
                <div class="container">
                    <!-- 模态框 -->
                    <div class="modal fade" id="myModal">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h4 class="modal-title">添加角色信息</h4>
                                </div>
                                <form action="/addUser" method="post" >
                                    <!-- 模态框主体 -->
                                    <div class="modal-body">
                                        登陆账号：<input name="userId" type="text" value=""><br/>
                                        <p></p>
                                        用户名称：<input name="name" type="text" value=""><br/>
                                        <p></p>
                                        登陆密码：<input type="password" name="password"><br/>
                                        <p></p>
                                        角色：
                                        <select name="roleId">
                                            <c:forEach items="${roleList}" var="rl">
                                                <option value="${rl.id}">${rl.name}</option>
                                            </c:forEach>
                                        </select>
                                        <p></p>
                                        是否启用：<select name="type">
                                        <option value="启用">启用</option>
                                        <option value="未启用">未启用</option>
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

                <div class="container">
                    <!-- 模态框 -->
                    <div class="modal fade" id="myModa2">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h4 class="modal-title">修改角色信息</h4>
                                </div>
                                <form action="/updateUser" method="post" >
                                    <!-- 模态框主体 -->
                                    <input id="uid" type="hidden" name="id" value="8">
                                    <div class="modal-body">
                                        登陆账号：<input id="userId" name="userId" type="text" value=""><br/>
                                        <p></p>
                                        用户名称：<input id="uname" name="name" type="text"><br/>
                                        <p></p>
                                        登陆密码：<input id="upassword"  type="password" name="password" ><br/>
                                        <p></p>
                                        角色：
                                        <select id="uroleId" name="roleId">
                                            <c:forEach items="${roleList}" var="rl">
                                                <option value="${rl.id}">${rl.name}</option>
                                            </c:forEach>
                                        </select>
                                        <p></p>
                                        是否启用：<select id="utype" name="type">
                                        <option value="启用">启用</option>
                                        <option value="未启用">未启用</option>
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

                <div class="container">
                    <form action="/showUserList" method="post">
                        <div style="height: 50px; margin-top: 3%;margin-left:10%">
                        用户名称：
                        <input name="name" type="text"/>
                        角色：
                        <select name="roleId">
                            <option value="0">-请选择-</option>
                            <c:forEach items="${roleList}" var="rl">
                                <option value="${rl.id}">${rl.name}</option>
                            </c:forEach>
                        </select>
                        是否启用
                         <select name="type">
                             <option value="启用" >启用</option>
                             <option value="未启用">未启用</option>
                         </select>
                        <input type="submit" value="查询"/><br>
                        </div>
                    </form>
                    <!-- 模态框 -->
                </div>
                <!-- 按钮：用于打开模态框 -->
                <button  class="btn btn-primary" type="button" data-toggle="modal" data-target="#myModal" >
                    新增
                </button>
                <table class="table table-advance table-hover">
                    <thead>
                    <tr>
                        <td>登陆账号</td>
                        <td>用户名称</td>
                        <td>角色</td>
                        <td>创建时间</td>
                        <td>是否启用</td>
                        <td>操作</td>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${userList.datas}" var="ul">
                        <tr>
                            <td>${ul.userId}</td>
                            <td>${ul.name}</td>
                            <td>${ul.role.name}</td>
                            <td>
                                <fmt:formatDate value="${ul.fristDate}" pattern="yyyy-MM-dd"/>
                            </td>
                            <td>${ul.type}</td>
                            <td>
                                <a onclick="selectone(${ul.id})"  class="btn btn-primary" type="button" data-toggle="modal" data-target="#myModa2" >
                                    修改
                                </a>
                                <a href="/deleteUser?id=${ul.id}" class="btn btn-primary">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
                <div style="margin-left: 185px">
                <a class="btn btn-default" href="/showUserList?pageNo=1">首页</a>
                <a class="btn btn-default" href="/showUserList?pageNo=${userList.pageNo-1}">上一页</a>
                <c:if test="${userList.pageNo<userList.totalPage}">
                <a class="btn btn-default" href="/showUserList?pageNo=${userList.pageNo+1}">下一页</a>
                </c:if>
                <a class="btn btn-default" href="/showUserList?pageNo=${userList.totalPage}">尾页</a>
                </div>
            </tr>
            </thead>
        </table>
    </div><!-- /col-md-12 -->
</div>
<%@include file="listBottom.jsp"%>


