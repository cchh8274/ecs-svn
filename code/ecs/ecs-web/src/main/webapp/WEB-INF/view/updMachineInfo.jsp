<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="updMachine" method="post">
      	<table>
      		<tr>
      			<td>
      				<input type="hidden"  name="id" value="${tmif.id}"> 
      			</td>
      		</tr>
      		<tr>
      			<td>机器名称:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="machineName" value="${tmif.machineName}" id="univerName" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>投放位置:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="adress" value="${tmif.adress}"  style="width:180px">
      			</td>
      		</tr>
      		<tr>
      			<td>是否使用:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name=isUse value="${tmif.isUse}" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>单个名额价格:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="price" value="${tmif.price}" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>总名额:</td>
      			<td>
      				<input  class="easyui-textbox"  type="text" name="totalPlaces" value="${tmif.totalPlaces}" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>剩余名额:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="leftPlace" value="${tmif.leftPlace}" style="width:180px"> 
      			</td>
      		</tr>
      		 <tr>
      			<td> 已售名额:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="outSalePlace" value="${tmif.outSalePlace}" style="width:180px"> 
      			</td>
      		</tr> 
      		 <tr>
      			<td> 创建时间:</td>
      			<td>
      				<input class="easyui-datetimebox" type="text" name="createTime" value="${tmif.createTime}" style="width:180px"> 
      			</td>
      		</tr> 
      		 <tr>
      			<td>创建人:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="createUser" value="${tmif.createUser}" style="width:180px"> 
      			</td>
      		</tr>
      		 <%-- <tr>
      			<td>修改时间:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="updateTime" value="${tmif.updateTime}" style="width:180px"> 
      			</td>
      		</tr> --%>
      		 <%-- <tr>
      			<td>修改人:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="updateUser" value="${tmif.updateUser}" style="width:180px"> 
      			</td>
      		</tr> --%>
      		 
      	</table>
     </form>
   
</body>
</html>