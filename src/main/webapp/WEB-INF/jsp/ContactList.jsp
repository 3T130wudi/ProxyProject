<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="listTop.jsp"%>


<div class="col-md-9 col-sm-12" style="height: 80%;width: 70%;margin-left: 15%;margin-top: 5%;">
    <div>
        <tr>
            <td></td>
            <td></td>
            <td>
                <form action="ALLContact" method="post">
                    关键字 <input type="text" name="contact_name"/>
                    客户 <input type="text" name="enterprise_name"/>
                    <input type="submit" value="提交"/>
                    <a id="Excel" class="btn btn-primary">导出Excel</a>
                </form>
            </td>
        </tr>
        <table class="table table-advance table-hover">
            <h4></h4>
            <hr>
            <thead>
            <tr>
                <td>序号</td>
                <td>门户名称</td>
                <td>客户名称</td>
                <td>法人代表</td>
                <td>代理商</td>
                <td>注册日期</td>
                <td>类型</td>
                <td>状态</td>
                <td>操作</td>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${ContactList}" var="c">
                <tr>
                    <td>
                            ${c.id}
                    </td>
                    <td>
                            ${c.contact_name}
                    </td>
                    <td>
                            ${c.enterprise_id.enterprise_name}
                    </td>
                    <td>
                            ${c.enterprise_id.gateway_id.gateway_representative}
                    </td>
                    <td>
                            ${c.contact_name}
                    </td>
                    <td>
                        <fmt:formatDate value="${c.enterprise_id.gateway_id.gateway_date}" pattern="yyyy-MM-dd"/>
                    </td>
                    <td>
                        <c:if test="${c.enterprise_id.enterprise_type=='个人'}">
                            个人
                        </c:if>
                        <c:if test="${c.enterprise_id.enterprise_type=='企业'}">
                            企业
                        </c:if>
                    </td>
                    <td>
                        <c:if test="${c.enterprise_id.enterprise_state==1}">
                            启用
                        </c:if>
                        <c:if test="${c.enterprise_id.enterprise_state==0}">
                            未启用
                        </c:if>
                    </td>
                    <td>
                        <a href="/ContactById?id=${c.id}">查看</a>|<a href="/ContactById?id=${c.id}">修改</a>
                    </td>
                </tr>
            </c:forEach>

            </tbody>
        </table>
    </div><!-- /col-md-12 -->
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