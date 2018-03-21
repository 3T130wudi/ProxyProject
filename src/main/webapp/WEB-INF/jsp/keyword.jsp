
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="listTop.jsp"/>

<div class="col-md-9 " style="margin-left: 20%; margin-top: 5%;width: 80%">
    <div>
        <form action="/insertKeyword">
        <table>
            <thead>
            <tr>
                <td>关键词申请</td>
            </tr>
            </thead>
            <tbody >
            <tr><td> 客户名称</td><td><input type="text" id="xinming" name="xinming"/></td></tr>
            <tr><td> 关键字</td><td><input type="text" name="keyword"/></td></tr>
            <tr><td> 服务类型 </td><td><select name="service_Type_id">
                        <option value="0">不上传苹果商城</option>
                        <option value="1">上传苹果商城</option>
                    </select></td></tr>
            <tr><td> 年限</td><td><select name="keywordDate">
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                    </select></td></tr>
            <tr>  <td>价格</td><td><input type="text" name="price" onkeyup="value=value.replace(/[^\d]/g,'')"></td></tr>
             <td><input type="submit" value="递交"/></td>
            </tbody>
        </table>
        </form>
    </div><!-- /col-md-12 -->
</div>

<jsp:include page="listBottom.jsp"/>