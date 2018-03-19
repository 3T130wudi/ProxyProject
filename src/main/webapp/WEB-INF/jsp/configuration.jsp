
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="listTop.jsp"/>

<style>
</style>


<div class="col-md-9 col-sm-12" style="height: 80%;width: 70%;margin-left: 15%;margin-top: 5%;">
    <div>
        <div class="container">
            <!-- 按钮：用于打开模态框 -->
            <button type="button" data-toggle="modal" data-target="#myModal" >
                添加财务类型
            </button>

            <!-- 模态框 -->
            <div class="modal fade" id="myModal">
                <div class="modal-dialog">
                    <div class="modal-content">


                        <div class="modal-header">
                            <h4 class="modal-title">您正在进行添加操作</h4>
                        </div>
                        <form action="/insertfinance" method="post" onsubmit="return caiwuform();" id="frm" >
                            <!-- 模态框主体 -->
                            <div class="modal-body">
                                类型名称：<input id="finance_type" name="finance_type" type="text" onblur="insertjudgment()"><br/>
                                <p></p>
                                是否启用：<select name="finance_enable">
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


        <form action="/Financeselect" method="post">
            <table class="table table-striped table-advance table-hover">

                <tr >
                    <td>序号<td/>
                    <td>配置类型<td/>
                    <td>是否启用<td/>
                    <td>操作<td/>
                <tr/>
                <c:forEach items="${finance}" var="f">

                <tr id="coifn">
                    <td>${f.finance_id}<td/>
                    <td>${f.finance_type}<td/>
                    <td>
                        <c:if test="${f.finance_enable==0}">启用</c:if>
                        <c:if test="${f.finance_enable==1}">不启用</c:if>
                    <td/>
                    <td><a id="finanId" name="finanId" onclick="
                    $.ajax({
                        type: 'POST',
                        url: '/selectfnance?finance_id='+${f.finance_id},
                        dataType: 'json',
                        success: function (date) {
                        if (date!=null) {
                        $('.finance_id').val(date.finance_id);
                        $('#fine').val(date.finance_type);
                        $('#finance_enable').val(date.finance_enable);


                        }
                        },

                        error: function () {
                        alert('455555');
                        }
                        });
                          "  data-toggle="modal" data-target="#Myomoal">修改|</a><a id="configId" href="/deletefinance?configId=${f.finance_id}" onclick="javascript:return del();" name="configId"> 删除</a><td/>
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
                    <form action="updatafinance" method="post" >
                        <!-- 模态框主体 -->
                        <div class="modal-body">

                            <input type="hidden" id="finance_id" name="finance_id" class="finance_id">
                            类型名称：<input id="fine" name="finance_type" type="text"><br/>
                            <p></p>
                            是否启用：<select id="finance_enable" name="finance_enable">
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


