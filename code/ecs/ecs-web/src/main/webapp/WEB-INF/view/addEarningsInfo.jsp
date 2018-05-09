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
<form id="EIAddForm">
      	<table>
      		<tr>
      			<td>openid:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="openid" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>微信用户:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="wxUserName"   style="width:180px">
      			</td>
      		</tr>
      		<tr>
      			<td>机器ID:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="manicheId" style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>大学名称:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="unversityName"  style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>大学ID:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="unversityId"  style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>机器名称:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="manicheName"  style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>收益单价:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="price"  style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>收益咖啡机数量:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="coffeeNumber"  style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>当月收益总金额:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="tolalMoney"  style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>收益时间:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="earingMonth"  style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>收益开始时间:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="earningStartTime"  style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>是否下发收益:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="isEaningStatus"  style="width:180px"> 
      			</td>
      		</tr>
      		<tr>
      			<td>收益下发时间:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="earningSendTime"  style="width:180px"> 
      			</td>
      		</tr>
      	</table>
     </form>
   
</body>
</html>