<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="adddaxunForm1">
      	<table>
      		<tr>
      			<td>
      				<input type="hidden"  name="id" value="${tuif.id}"> 
      			</td>
      		</tr>
      		<tr>
      			<td>大学名称:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="univerName" value="${tuif.univerName}" id="univerName" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>区域名称:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="areaName" value="${tuif.areaName}"  style="width:180px">
      			</td>
      		</tr>
      		<tr>
      			<td>区域ID:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="areaId" value="${tuif.areaId}" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>点的位置:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="backimg" value="${tuif.backimg}" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>创建时间:</td>
      			<td>
      				<input  class="easyui-datetimebox"  type="text" name="createTime" value="${tuif.createTime}" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>创建人:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="createUser" value="${tuif.createUser}" style="width:180px"> 
      			</td>
      		</tr>
      		<%-- <tr>
      			<td>修改时间:</td>
      			<td>
      				<input class="easyui-datetimebox" type="text" name="upTime" value="${tuif.upTime}" style="width:180px"> 
      			</td>
      		</tr> --%>
      		<%-- <tr>
      			<td>修改人:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="upUser" value="${tuif.upUser}" style="width:180px"> 
      			</td>
      		</tr>
      		 --%>
      	</table>
     </form>
   
</body>
</html>