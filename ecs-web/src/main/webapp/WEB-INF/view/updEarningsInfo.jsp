<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="EIUpdateForm">
      	<table>
      		<tr>
      			<td>
      				<input type="hidden" name="id" value="${teif.id}" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>openid:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="openid" value="${teif.openid}" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>微信用户:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="wxUserName" value="${teif.wxUserName}"  style="width:180px">
      			</td>
      		</tr>
      		<tr>
      			<td>机器ID:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="manicheId" value="${teif.manicheId}" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>大学名称:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="unversityName" value="${teif.unversityName}" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>大学ID:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="unversityId" value="${teif.unversityId}" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>机器名称:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="manicheName" value="${teif.manicheName}" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>收益单价:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="price" value="${teif.price}" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>收益咖啡机数量:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="coffeeNumber" value="${teif.coffeeNumber}" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>当月收益总金额:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="tolalMoney" value="${teif.tolalMoney}" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>收益时间:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="earingMonth" value="${teif.earingMonth}" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>收益开始时间:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="earningStartTime" value="${teif.earningStartTime}" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>是否下发收益:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="isEaningStatus" value="${teif.isEaningStatus}" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>收益下发时间:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="earningSendTime" value="${teif.earningSendTime}" style="width:180px"> 
      			</td>
      		</tr>
      	</table>
     </form>
</body>
</html>