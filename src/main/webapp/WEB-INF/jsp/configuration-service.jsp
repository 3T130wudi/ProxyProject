
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="listTop.jsp"/>


<div class="col-md-9 col-sm-12" style="height: 80%;width: 70%;margin-left: 15%;margin-top: 5%;">
    <div class="container">
        <!-- 按钮：用于打开模态框 -->
        <button type="button" data-toggle="modal" data-target="#myModal" >
            添加服务类型
        </button>

        <!-- 模态框 -->
        <div class="modal fade" id="myModal">
            <div class="modal-dialog">
                <div class="modal-content">


                    <div class="modal-header">
                        <h4 class="modal-title">您正在进行添加操作</h4>
                    </div>
                    <form action="/insertselect" id="regisetForm" method="post" >
                        <!-- 模态框主体 -->
                        <div class="modal-body">
                            配置类型：<input id="service_type" onblur="
                            $.ajax({
                            type: 'POST',
                            url: '/selectname?service_type='+$('#service_type').val(),
                            dataType: 'json',
                            success: function (date) {
                            var name= $('#service_type').val();
                            if(name!=''&& name!=null){
                            if (date==true) {

                            alert('不能添加重复的配置类型');

                            }
                            }
                            },
                            error: function () {

                            }
                            });" name="service_type" type="text">&nbsp<span id="ser"></span><br/>
                            <p></p>
                            配置数值：<input id="service_tow" name="service_tow" type="text"><br/>
                            <p></p>
                            是否启用：<select name="service_enable">
                            <option value="0">启用</option>
                            <option value="1">不启用</option>

                        </select>
                        </div>

                        <!-- 模态框底部 -->
                        <div class="modal-footer">
                            <button type="submit" id="queding"  class="btn btn-secondary" >确定</button>
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </div>

<form action="/selectService">
    <table class="table table-striped table-advance table-hover">

        <tr >
            <td>序号<td/>
            <td>配置类型<td/>
            <td>配置数值<td/>
            <td>是否启用<td/>
            <td>操作<td/>
        <tr/>
        <c:forEach items="${service}" var="s">

        <tr id="coifn">
            <td>${s.service_id}<td/>
            <td>${s.service_type}<td/>
            <td>${s.service_tow}<td/>
            <td>
                <c:if test="${s.service_enable==0}">启用</c:if>
                <c:if test="${s.service_enable==1}">不启用</c:if>
            <td/>
            <td><a id="sid" name="sid"   data-toggle="modal" data-target="#Myomoal">修改</a><td/>
        <tr/>

        </c:forEach>

        <table/>
</form>

</div>

<script src="js/jquery-1.12.4.js"></script>
<script src="js/configuration.js"></script>


<jsp:include page="listBottom.jsp"/>