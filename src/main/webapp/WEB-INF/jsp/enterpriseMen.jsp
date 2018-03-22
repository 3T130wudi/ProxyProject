<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="listTop.jsp"%>

<div class="col-md-9 col-sm-12" style="height: 80%;width: 70%;margin-left: 15%;margin-top: 5%;">
    <div>
        <table class="table table-striped table-advance table-hover">
            <thead>
            <tr>
                <td>序号</td>
                <td>门户名称</td>
                <td>客户名称</td>
                <td>法人代表</td>
                <td>代理商</td>
                <td>注册时间</td>
                <td>类型</td>
                <td>状态</td>
                <td>操作</td>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${enterpris.datas}" var="g">
                <tr>
                    <td>
                            ${g.id}
                    </td
                        <td></td>
                    <td>
                            ${g.contact_id.enterprise_id.enterprise_names}
                    </td>
                    <td>
                            ${g.contact_id.enterprise_id.enterprise_name}
                    </td>
                    <td>
                            ${g.contact_id.contact_name}
                    </td>
                    <td>
                            ${g.contact_id.enterprise_id.gateway_id.gateway_representative}
                    </td>
                    <td>
                        <fmt:formatDate value="${g.contact_id.enterprise_id.gateway_id.gateway_date}" pattern="yyyy-MM-dd"/>

                    </td>
                    <td>
                            ${g.contact_id.enterprise_id.enterprise_type}
                    </td>
                    <td>
                        <c:if test="${g.contact_id.enterprise_id.enterprise_state==0}">
                            已停用
                        </c:if>
                        <c:if test="${g.contact_id.enterprise_id.enterprise_state==1}">
                            以起用
                        </c:if>
                    </td>
                    <td>
                        <a href="enterList?id=${g.id}&model=0" class="btn btn-primary">查看</a>
                        <%--<a href="enterList2?id=${g.id}&model=0" class="btn btn-primary">修改</a>--%>
                    </td>
                </tr>
            </c:forEach>
            </tbody>

        </table>
        <div style="float:right;text-align:right;">

            <td>
                <form action="enterpriseMenList" method="post">
                    <input name="name" type="text"/>
                    <input type="submit" value="查询">
                    <a id="Excel" class="btn btn-primary">导出Excel</a>
                </form>
            </td>
        </div>
    </div><!-- /col-md-12 -->
    <div style="margin-left: 185px">
        <a class="btn btn-default" href="/enterpriseMenList?pageNo=1">首页</a>
        <a class="btn btn-default" href="/enterpriseMenList?pageNo=${enterpris.pageNo-1}">上一页</a>
        <c:if test="${enterpris.pageNo<enterpris.totalPage}">
            <a class="btn btn-default  " href="/enterpriseMenList?pageNo=${enterpris.pageNo+1}">下一页</a>&nbsp;&nbsp;
        </c:if>

        <a class="btn btn-default" href="/enterpriseMenList?pageNo=${enterpris.totalPage}">尾页</a>
    </div>
</div>
<script type="text/javascript">
    // 使用outerHTML属性获取整个table元素的HTML代码（包括<table>标签），然后包装成一个完整的HTML文档，设置charset为urf-8以防止中文乱码
    var html = "<html><head><meta charset='utf-8' /></head><body>" + document.getElementsByTagName("table")[0].outerHTML + "</body></html>";
    // 实例化一个Blob对象，其构造函数的第一个参数是包含文件内容的数组，第二个参数是包含文件类型属性的对象
    var blob = new Blob([html], { type: "application/vnd.ms-excel" });
    var a = document.getElementById("Excel");
    // 利用URL.createObjectURL()方法为a元素生成blob URL
    a.href = URL.createObjectURL(blob);
    // 设置文件名，目前只有Chrome和FireFox支持此属性
    a.download = "数据.xls";
</script>
<%@include file="listBottom.jsp"%>
