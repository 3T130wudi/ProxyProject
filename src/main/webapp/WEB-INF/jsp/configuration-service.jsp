
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
                    <form action="/insertselect"onsubmit="return servicecheckForm();" id="frm" method="post" >
                        <!-- 模态框主体 -->
                        <div class="modal-body">
                            服务类型：<input id="servicepe" onblur="
                            $.ajax({
                            type: 'POST',
                            data:{service_type:$('#servicepe').val()},
                            url: '/selectname',
                            dataType: 'json',
                            success: function (date) {
                            var name= $('#servicepe').val();
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
        <c:forEach items="${pager.datas}" var="s">

        <tr id="coifn">
            <td>${s.service_id}<td/>
            <td>${s.service_type}<td/>
            <td>${s.service_tow}<td/>
            <td>
                <c:if test="${s.service_enable==0}"><span style="color:Green">启用</span></c:if>
                <c:if test="${s.service_enable==1}"><span style="color: red">不启用</span></c:if>
            <td/>
            <td><a id="sid" name="sid" onclick="
                    $.ajax({
                            type: 'POST',
                            url: '/serviceselect?uid='+${s.service_id},
                            dataType: 'json',
                            success: function (date) {
                                $('#service_id').val(date.service_id);
                                 $('#service_type').val(date.service_type);
                                $('#servicetow').val(date.service_tow);
                                $('#serviceenable').val(date.service_enable);
                            },
                            error: function () {

                            }
                            });"  data-toggle="modal" data-target="#Mymoal" class="btn btn-default">修改</a><td/>
        <tr/>

        </c:forEach>
        <table/>
</form>
    <div style="margin-left: 185px">
        <a class="btn btn-default " href="/selectService?pageNo=1">首页</a>&nbsp;&nbsp;

        <a  class="btn btn-default" href="/selectService?pageNo=${pager.pageNo-1}">上一页</a>&nbsp;&nbsp;

        <a  class="btn btn-default " >第${pager.pageNo}/${pager.totalPage}页</a>&nbsp;&nbsp;

        <c:if test="${pager.pageNo<pager.totalPage}">
            <a class="btn btn-default  " href="/selectService?pageNo=${pager.pageNo+1}">下一页</a>&nbsp;&nbsp;
        </c:if>

        <a class="btn btn-default  " href="/selectService?pageNo=${pager.totalPage}">尾页</a>&nbsp;&nbsp;
    </div>

    <div class="container">
        <!-- 模态框 -->
        <div class="modal fade" id="Mymoal">
            <div class="modal-dialog">
                <div class="modal-content">


                    <div class="modal-header">
                        <h4 class="modal-title">您正在进行修改操作</h4>
                    </div>
                    <form action="/updateservice"  method="post" >
                        <!-- 模态框主体 -->
                        <div class="modal-body">
                            <input type="hidden" id="service_id" name="service_id">
                            服务类型：<input id="service_type" name="service_type" type="text">&nbsp<span id="se"></span><br/>
                            <p></p>
                            配置数值：<input id="servicetow" name="service_tow" type="text"><br/>
                            <p></p>
                            是否启用：<select id="serviceenable" name="service_enable">
                            <option value="0">启用</option>
                            <option value="1">不启用</option>

                        </select>
                        </div>

                        <!-- 模态框底部 -->
                        <div class="modal-footer">
                            <button type="submit"   class="btn btn-secondary" >确定</button>
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </div>
</div>

<script src="js/jquery-1.12.4.js"></script>
<script src="js/configation.js"></script>

<jsp:include page="listBottom.jsp"/>
