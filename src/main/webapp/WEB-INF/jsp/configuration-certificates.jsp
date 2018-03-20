
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="listTop.jsp"/>

<div class="col-md-9 col-sm-12" style="height: 80%;width: 70%;margin-left: 15%;margin-top: 5%;">
    <div>
        <div class="container">
            <!-- 按钮：用于打开模态框 -->
            <button type="button" data-toggle="modal" data-target="#myModal" >
                添加证件类型
            </button>

            <!-- 模态框 -->
            <div class="modal fade" id="myModal">
                <div class="modal-dialog">
                    <div class="modal-content">


                        <div class="modal-header">
                            <h4 class="modal-title">您正在进行添加操作</h4>
                        </div>
                        <form action="/insertcertificates" method="post" >
                            <!-- 模态框主体 -->
                            <div class="modal-body">
                                证件类型：<input id="certificates_type" name="certificates_type" onblur="certificatesselect()" type="text"><br/>
                                <p></p>
                                是否启用：<select id="certificates_enable" name="certificates_enable">
                                <option value="0">启用</option>
                                <option value="1">不启用</option>

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


        <form action="/Financeselect">
            <table class="table table-striped table-advance table-hover">

                <tr >
                    <td>序号<td/>
                    <td>配置类型<td/>
                    <td>是否启用<td/>
                    <td>操作<td/>
                <tr/>
                <c:forEach items="${certificates}" var="c">

                <tr id="coifn">
                    <td>${c.certificates_id}<td/>
                    <td>${c.certificates_type}<td/>
                    <td>
                        <c:if test="${c.certificates_enable==0}"><span style="color:Green">启用</span></c:if>
                        <c:if test="${c.certificates_enable==1}"><span style="color: red">不启用</span></c:if>
                    <td/>
                    <td><a id="finanId" name="finanId" onclick="selectficates(${c.certificates_id})"  class="btn btn-default"  data-toggle="modal" data-target="#Myomoal">修改</a><a class="btn btn-default" id="configId" onclick="javascript:return deletecerti();" href="/deletecertificates?certificates_id=${c.certificates_id}" name="configId"> 删除</a><td/>
                <tr/>
                </c:forEach>

                <table/>

        </form>
    </div>

    <div class="containert">


        <div class="modal fade" id="Myomoal">
            <div class="modal-dialog">
                <div class="modal-content">


                    <div class="modal-header">
                        <h4 class="modal-title">您正在进行修改操作</h4>
                    </div>
                    <form action="/updatecertificates" method="post" >
                        <!-- 模态框主体 -->
                        <div class="modal-body">
                            <input type="hidden" id="certificates_id" name="certificates_id">
                            证件类型：<input id="certificatestype" name="certificates_type" type="text"><br/>
                            <p></p>
                            是否启用：<select id="certificatesenable" name="certificates_enable">
                            <option value="0">启用</option>
                            <option value="1">不启用</option>

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



    <script src="js/jquery-1.12.4.js"></script>
    <script src="js/configuration.js"></script>
    <jsp:include page="listBottom.jsp"/>


