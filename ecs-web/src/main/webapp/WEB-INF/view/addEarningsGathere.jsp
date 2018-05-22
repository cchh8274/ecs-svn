<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%String path = request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="EGAddForm" method="post">
      	<table>
      		<tr>
      			<td>收益大学:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="unversityId" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>购买份数总额:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="number"   style="width:180px">
      			</td>
      		</tr>
      		<tr>
      			<td>openid:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="openid" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>大学名称:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="unversityName"  style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>区域名称:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="areaName"  style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>收益区域:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="areaId"  style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>收益类型:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="earningType"  style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>开始收益日期:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="createUser"  style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>投放日期:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="locationTime"  style="width:180px"> 
      			</td>
      		</tr>
      	</table>
     </form>
   
</body>
</html>