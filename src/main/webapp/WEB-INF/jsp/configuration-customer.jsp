
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="listTop.jsp"/>

<div class="col-md-9 col-sm-12" style="height: 80%;width: 70%;margin-left: 15%;margin-top: 5%;">
    <div>
        <div class="container">
            <!-- 按钮：用于打开模态框 -->
            <button type="button" data-toggle="modal" data-target="#myModal" >
                添加客户类型
            </button>

            <!-- 模态框 -->
            <div class="modal fade" id="myModal">
                <div class="modal-dialog">
                    <div class="modal-content">


                        <div class="modal-header">
                            <h4 class="modal-title">您正在进行添加操作</h4>
                        </div>
                        <form action="/insertcurrrency" method="post" onsubmit="return checkForm2();" id="frm" >
                            <!-- 模态框主体 -->
                            <div class="modal-body">
                                客户名称：<input id="customer_type" name="customer_type" onblur="selectcustmer()" type="text"><br/>
                                <p></p>
                                是否启用：<select id="customer_enable" name="customer_enable">
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
                <c:forEach items="${currency}" var="c">

                <tr id="coifn">
                    <td>${c.customer_id}<td/>
                    <td>${c.customer_type}<td/>
                    <td>
                        <c:if test="${c.customer_enable==0}">启用</c:if>
                        <c:if test="${c.customer_enable==1}">不启用</c:if>
                    <td/>
                    <td><a id="finanId" name="finanId"  onclick="customerselect(${c.customer_id})"  data-toggle="modal" data-target="#Myomoal">修改|</a><a id="configId" href="/deletecustomer?customer_id=${c.customer_id}" onclick="javascript:return deletecust();"  name="configId"> 删除</a><td/>
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
                    <form action="/updatecustomer" method="post" >
                        <!-- 模态框主体 -->
                        <div class="modal-body">
                            <input type="hidden" id="customer_id" name="customer_id">
                            客户名称：<input id="customertype" name="customer_type" type="text"><br/>
                            <p></p>
                            是否启用：<select id="customerenable" name="customer_enable">
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


