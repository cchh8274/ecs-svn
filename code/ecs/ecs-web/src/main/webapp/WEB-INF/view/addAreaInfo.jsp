<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="addAreaInfo">
      	<table>
      		<tr>
      			<td>区域名称:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="areaName" value="${aif.areaName}" id="univerName" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td> 状态:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="status" value="${aif.status}"  style="width:180px">
      			</td>
      		</tr>
      		<tr>
      			<td> 页面启用状态:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="pageStatus" value="${aif.pageStatus}"  style="width:180px">
      			</td>
      		</tr>
      		<tr>
      			<td>启用等级:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="enableLevl" value="${aif.enableLevl}" style="width:180px"> 
      			</td>
      		</tr>
      	</table>
     </form>
   
</body>
</html>