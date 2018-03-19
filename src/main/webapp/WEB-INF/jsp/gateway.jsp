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
                    <form action="/UpdateGateway" method="post">
                        <p>基本信息</p>
                        <input type="hidden" name="contact.id" value="${gateway.contact_id.id}"/>
                        <input type="hidden" name="enterprise.id" value="${gateway.contact_id.enterprise_id.id}"/>
                        <input type="hidden" name="gateway.id" value="${gateway.contact_id.enterprise_id.gateway_id.id}"/>
                        企业名字 <input type="text" name="enterprise.enterprise_name" value="${gateway.contact_id.enterprise_id.enterprise_name}"> 企业类型<select name="enterprise.enterprise_type">
                        <option value="个人" <c:if test="${gateway.contact_id.enterprise_id.enterprise_type}==个人">selected="selected"</c:if>>个人</option>
                        <option value="组织" <c:if test="${gateway.contact_id.enterprise_id.enterprise_type}==组织">selected="selected"</c:if>>组织</option>
                    </select><br/>
                        企业主页 <input type="text" name="enterprise.enterprise_home" value="${gateway.contact_id.enterprise_id.enterprise_home}"> 状态 <select name="enterprise.enterprise_state">
                        <option value="0" <c:if test="${gateway.contact_id.enterprise_id.enterprise_state==0}">selected="selected"</c:if>>禁用</option>
                        <option value="1" <c:if test="${gateway.contact_id.enterprise_id.enterprise_state==1}">selected="selected"</c:if>>启用</option></select><br/>
                        <p>门户信息</p>
                        法人代表 <input type="text" name="gateway.gateway_representative" value="${gateway.contact_id.enterprise_id.gateway_id.gateway_representative}"> 注册时间(已注册成功时间为准)<br/>
                        证件类型<select name="gateway.gateway_type">
                        <option value="国内身份证"<c:if test="${gateway.contact_id.enterprise_id.gateway_id.gateway_type=='国内身份证'}">selected="selected"</c:if>>国内身份证</option>
                        <option value="国外身份证"<c:if test="${gateway.contact_id.enterprise_id.gateway_id.gateway_type=='国外身份证'}">selected="selected"</c:if>>国外身份证</option>
                        <option value="其他证件"<c:if test="${gateway.contact_id.enterprise_id.gateway_id.gateway_type=='其他证件'}">selected="selected"</c:if>>其他证件</option></select>证件号码<input type="text" name="gateway.gateway_certificates" value="${gateway.contact_id.enterprise_id.gateway_id.gateway_certificates}"><br/>
                        国家<input type="text" name="gateway.gateway_country" value="${gateway.contact_id.enterprise_id.gateway_id.gateway_country}">省/市 <input type="text" name="gateway.gateway_region" value="${gateway.contact_id.enterprise_id.gateway_id.gateway_region}"><br/>
                        公司传真<input type="text" name="gateway.gateway_fax" value="${gateway.contact_id.enterprise_id.gateway_id.gateway_fax}">市/县 <input type="text" name="gateway.gateway_city" value="${gateway.contact_id.enterprise_id.gateway_id.gateway_city}"><br/>
                        公司电话<input type="text" name="gateway.gateway_phone" value="${gateway.contact_id.enterprise_id.gateway_id.gateway_phone}">区/街 <input type="text" name="gateway.gateway_area" value="${gateway.contact_id.enterprise_id.gateway_id.gateway_area}"><br/>
                        公司地址 <input type="text" name="gateway.gateway_address" value="${gateway.contact_id.enterprise_id.gateway_id.gateway_address}"><br/>
                        备注 <input type="text" name="gateway.gateway_remarks" value="${gateway.contact_id.enterprise_id.gateway_id.gateway_remarks}">
                        <a href="#" id="ass">添加一个联系人</a>
                        <table class="table" border="1">
                            <thead>
                            <tr>
                                <td>姓名</td>
                                <td>电话</td>
                                <td>传真</td>
                                <td>手机</td>
                                <td>邮箱</td>
                                <td>职位</td>
                                <td>操作</td>
                            </tr>
                            </thead>
                            <tbody>

                            <tr>
                                <td><input name="contact.contact_name" value="${c.contact_name}"></td>
                                <td><input name="contact.contact_phone" value="${c.contact_phone}"></td>
                                <td><input name="contact.contact_fax" value="${c.contact_fax}"></td>
                                <td><input name="contact.contact_mobile" value="${c.contact_mobile}"></td>
                                <td><input name="contact.contact_email" value="${c.contact_email}"></td>
                                <td><input name="contact.contact_post" value="${c.contact_post}"></td>
                                <td><a href="#" id="del">删除</a></td>
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