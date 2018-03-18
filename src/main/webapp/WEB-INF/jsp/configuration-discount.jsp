
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="listTop.jsp"/>

<div class="col-md-9 col-sm-12" style="height: 80%;width: 70%;margin-left: 15%;margin-top: 5%;">
    <div>
        <div class="container">
            <!-- 按钮：用于打开模态框 -->
            <button type="button" data-toggle="modal" data-target="#myModal" >
                添加优惠类型
            </button>

            <!-- 模态框 -->
            <div class="modal fade" id="myModal">

                <div class="modal-dialog">
                    <div class="modal-content">


                        <div class="modal-header">
                            <h4 class="modal-title">您正在进行添加操作</h4>
                        </div>
                        <form action="/insertdicount" method="post" onsubmit="return checkForm();" id="frm" >
                            <!-- 模态框主体 -->
                            <div class="modal-body">
                               优惠类型：<input id="discount_type" onblur="discountselect()" name="discount_type" type="text"><br/>
                                <p></p>
                                配置数值：<input id="discount_numer"  name="discount_numer" type="text"><br/>
                                <p></p>
                               实际数值：<input id="discount_actual"  name="discount_actual" type="text"><br/>
                                <p></p>
                                是否启用：<select id="discount_enable"  name="discount_enable">
                                <option value="0">启用</option>
                                <option value="1">不启用</option>

                            </select>
                            </div>

                            <!-- 模态框底部 -->
                            <div class="modal-footer">
                                <button type="submit"  class="btn btn-secondary" >确定</button>
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
                    <td>配数值<td/>
                    <td>实际数值<td/>
                    <td>是否启用<td/>
                    <td>操作<td/>
                <tr/>
                <c:forEach items="${discount}" var="d">

                <tr id="coifn">
                    <td>${d.discount_id}<td/>
                    <td>${d.discount_type}<td/>
                    <td>${d.discount_numer}<td/>
                    <td>${d.discount_actual}<td/>
                    <td>
                        <c:if test="${d.discount_enable==0}">启用</c:if>
                        <c:if test="${d.discount_enable==1}">不启用</c:if>
                    <td/>
                    <td><a id="finanId" name="finanId"  onclick="soutselect(${d.discount_id})"  data-toggle="modal" data-target="#Myomoal">修改|</a><a id="configId" onclick="javascript:return deletedosount();" href="/deletedisount?discount_id=${d.discount_id}" name="configId"> 删除</a><td/>
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
                    <form action="/updatedisount" method="post" >
                        <!-- 模态框主体 -->
                        <div class="modal-body">
                            <input type="hidden" id="discountid" name="discount_id">
                            优惠类型：<input id="discounttype" name="discount_type" type="text"><br/>
                            <p></p>
                            配置数值：<input id="discountnumer"  name="discount_numer" type="text"><br/>
                            <p></p>
                            实际数值：<input id="discountactual"  name="discount_actual" type="text"><br/>
                            <p></p>
                            是否启用：<select id="discountenable" name="discount_enable">
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


