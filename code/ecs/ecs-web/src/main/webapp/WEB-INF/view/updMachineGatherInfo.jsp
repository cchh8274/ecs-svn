<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="MGIUpdateForm" method="post">
      	<table>
      		<tr>
      			<td>
      				<input type="hidden" name="id" value="${tmgi.id}" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>openid:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="openid" value="${tmgi.openid}" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>用户名称:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="wxUserName" value="${tmgi.wxUserName}" style="width:180px">
      			</td>
      		</tr>
      		<tr>
      			<td>区域名称:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="areaId" value="${tmgi.areaId}" style="width:180px">
      			</td>
      		</tr>
      		<tr>
      			<td>区域ID:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="areId" value="${tmgi.areId}" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>大学名称:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="unversityName" value="${tmgi.unversityName}" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>大学ID:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="unversityId" value="${tmgi.unversityId}" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>购买金额:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="price" value="${tmgi.price}" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>购买数量:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="number" value="${tmgi.number}" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>购买时间:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="payTime" value="${tmgi.payTime}" style="width:180px"> 
      			</td>
      		</tr>
      	</table>
     </form>
</body>
</html>