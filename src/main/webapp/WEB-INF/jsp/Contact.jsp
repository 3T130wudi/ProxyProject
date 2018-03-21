<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="listTop.jsp"/>

<div class="col-md-9 col-sm-12" style="margin-left: 17%;width: 80%">
    <div>
        <table class="table table-striped table-advance table-hover">
            <h4></h4>
            <thead>
            <tr>
                <td></td>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>
                    <form action="/updateContact" method="post">
                        <p>基本信息</p>
                        <input type="hidden" name="cid" value="${c.id}"/>
                        <input type="hidden" name="ceid" value="${c.enterprise_id.id}"/>
                        <input type="hidden" name="cegid" value="${c.enterprise_id.gateway_id.id}"/>
                        企业名字 <input type="text" name="enterprise_name" value="${c.enterprise_id.enterprise_name}" readonly="readonly"> 企业类型<select name="enterprise.enterprise_type"  readonly="readonly">
                        <option value="个人" <c:if test="${c.enterprise_id.enterprise_type=='个人'}">selected="selected"</c:if>>个人</option>
                        <option value="组织" <c:if test="${c.enterprise_id.enterprise_type=='组织'}">selected="selected"</c:if>>组织</option>
                    </select><br/>
                        企业主页 <input type="text" name="enterprise_home" value="${c.enterprise_id.enterprise_home}" readonly="readonly"> 状态 <select name="enterprise_state" readonly="readonly">
                        <option value="0" <c:if test="${c.enterprise_id.enterprise_state==0}">selected="selected"</c:if>>禁用</option>
                        <option value="1" <c:if test="${c.enterprise_id.enterprise_state==1}">selected="selected"</c:if>>启用</option></select><br/>
                        <p>门户信息</p>
                        法人代表 <input type="text" name="gateway_representative" value="${c.enterprise_id.gateway_id.gateway_representative}" readonly="readonly"><br/>
                        证件类型<select name="gateway_type" readonly="readonly">
                        <option value="国内身份证"<c:if test="${c.enterprise_id.gateway_id.gateway_type=='国内身份证'}">selected="selected"</c:if>>国内身份证</option>
                        <option value="国外身份证"<c:if test="${c.enterprise_id.gateway_id.gateway_type=='国外身份证'}">selected="selected"</c:if>>国外身份证</option>
                         <option value="其他证件"<c:if test="${c.enterprise_id.gateway_id.gateway_type=='其他证件'}">selected="selected"</c:if>>其他证件</option></select>
                        证件号码<input type="text" name="gateway_certificates" value="${c.enterprise_id.gateway_id.gateway_certificates}" readonly="readonly"/><br/>
                        国家<input type="text" name="gateway_country" value="${c.enterprise_id.gateway_id.gateway_country}" readonly="readonly">省/市 <input type="text" name="gateway_region" value="${c.enterprise_id.gateway_id.gateway_region}" readonly="readonly"><br/>
                        公司传真<input type="text" name="gateway_fax" value="${c.enterprise_id.gateway_id.gateway_fax}" readonly="readonly">市/县 <input type="text" name="gateway_city" value="${c.enterprise_id.gateway_id.gateway_city}" readonly="readonly"><br/>
                        公司电话<input type="text" name="gateway_phone" value="${c.enterprise_id.gateway_id.gateway_phone}" readonly="readonly">区/街 <input type="text" name="gateway_area" value="${c.enterprise_id.gateway_id.gateway_area}" readonly="readonly"><br/>
                        公司地址 <input type="text" name="gateway_address" value="${c.enterprise_id.gateway_id.gateway_address}" readonly="readonly"><br/>
                        备注 <input type="text" name="gateway_remarks" value="${c.enterprise_id.gateway_id.gateway_remarks}">
                        <table class="table" border="1">
                            <thead>
                            <tr>
                                <td>姓名</td>
                                <td>电话</td>
                                <td>传真</td>
                                <td>手机</td>
                                <td>邮箱</td>
                                <td>职位</td>
                            </tr>
                            </thead>
                            <tbody>

                            <tr>
                                <td><input name="contact_name" value="${c.contact_name}" readonly="readonly"/></td>
                                <td><input name="contact_phone" value="${c.contact_phone}" readonly="readonly"/></td>
                                <td><input name="contact_fax" value="${c.contact_fax}" readonly="readonly"/></td>
                                <td><input name="contact_mobile" value="${c.contact_mobile}" readonly="readonly"/></td>
                                <td><input name="contact_email" value="${c.contact_email}" readonly="readonly"/></td>
                                <td><input name="contact_post" value="${c.contact_post}" readonly="readonly"/></td>
                            </tr>
                            </tbody>
                        </table>
                        <input type="submit" value="递交" class="btn btn-primary"/><a class="btn btn-primary" href="javascript:history.go(-1);">返回上一页</a>
                    </form>
                </td>
            </tr>
            </tbody>
        </table>
    </div><!-- /col-md-12 -->
</div>

<jsp:include page="listBottom.jsp"/>