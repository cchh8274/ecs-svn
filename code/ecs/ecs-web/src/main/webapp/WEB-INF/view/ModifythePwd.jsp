<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<jsp:include page="/js/jsAll.jsp"></jsp:include>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/zTree/js/jquery.ztree.all.min.js"></script>
</head>
<body>
	<form id="form1" style="width:45%;margin:0 auto">
		<table >	
			<tr>
				<td>
				账号:
				</td>
				<td>
				<input class="easyui-textbox" name="adminName" id="adminName" style="border:1px solid gray">
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
				新密码:
				</td>
				<td>
				<input class="easyui-textbox" type="text" name="xadminPassword" id="xadminPassword" style="border:1px solid gray">
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
		
	<%-- <script type="text/javascript">
		$("#btn").click(function(){
			var adminName =$("#adminName").val();
			var adminPassword =$("#adminPassword").val();
			var xadminPassword =$("#xadminPassword").val();
			var qxadminPassword =$("#qxadminPassword").val();
			if(adminName == null || adminName == ""){
				alert("账号不能为空");
				return false;
			}else if(adminPassword == null || adminPassword == ""){
				alert("密码不能为空");
				return false;
			}else if(xadminPassword == null || xadminPassword == ""){
				alert("新密码不能为空");
				return false;
			}else if(qxadminPassword == null || qxadminPassword != xadminPassword){
				alert("两次密码不一致");
				return false;
			}
				
				$.ajax({
					url:'<%=request.getContextPath()%>/login/logUser.do',
                   type:"get",
   				    data:$("#form1").serialize(),
                  dataType:"text",
                   success:function(data){ 
                	   console.log(data)
                	   if(data=='zhanghao'){
   						alert("账号错误");
   						return false;
   					}else if(data=='mima'){
   						alert("密码错误");
   						return false;
   					  } else if(data=='cishu'){
   						alert("您三次错误联系管理员");
   						return false;
   					  }else if(data=='update'){
   						location.href='http://localhost:8080/ecs-web/login.jsp';
   					  } 
                  }
                   
               })	
		})
		
	</script> --%>
</body>
</html>
