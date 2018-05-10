<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form id="addaftaxunForm1">
      	<table>
      		<tr>
      			<td>
      				<input type="hidden"  name="id" value="${taf.id}"> 
      			</td>
      		</tr>
      		<tr>
      			<td>用户名称:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="userName" value="${taf.userName}" id="userName" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>openid:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="openid" value="${taf.openid}"  style="width:180px">
      			</td>
      		</tr>
      		<tr>
      			<td>账户金额:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="accountMoney" value="${taf.accountMoney}" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>是否启用:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="isStart" value="${taf.isStart}" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>账户ID:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="accountId" value="${taf.accountId}" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>是否冻结:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="isFreeze" value="${taf.isFreeze}" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>账户创建时间:</td>
      			<td>
      				<input  class="easyui-datetimebox"  type="text" name="accountTime" value="${taf.accountTime}" style="width:180px"> 
      			</td>
      		</tr>
  
      	</table>
     </form>

</body>
</html>