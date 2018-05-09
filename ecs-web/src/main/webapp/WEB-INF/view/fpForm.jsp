<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.2.1/jquery-3.2.1.js"></script>
</head>
<body>
<form id="formuser" style="width:45%;margin:0 auto">
		<table >	
			<tr>
				<td>
				账号:
				</td>
				<td>
				<input onblur="selectzhnaghao()" class="easyui-textbox" name="adminName" id="adminName" style="border:1px solid gray">
				</td>
			</tr>
			<tr>
				<td>
				密码:
				</td>
				<td>
				<input class="easyui-textbox" type="text" name="adminPassword" id="adminPassword" style="border:1px solid gray">
				</td>
			</tr>
			<tr>
				<td>
				确认密码:
				</td>
				<td>
				<input class="easyui-textbox" name="qxadminPassword" id="qxadminPassword" style="border:1px solid gray">
				</td>
			</tr>
			 <!-- <tr style="text-align:center;">
				<td colspan="2">
				<input type="button" value="登录" id="btn">
				</td>
			</tr> -->
		</table>
	</form>
</body>
</html>