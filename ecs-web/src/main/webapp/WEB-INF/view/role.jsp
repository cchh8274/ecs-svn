<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%String path = request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.2.1/jquery-3.2.1.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/easyui/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/easyui/themes/default/easyui.css">   
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/easyui/themes/icon.css">
</head>
<body>
		
	
	<form id="datat" >
	<input type="hidden" value="${id}" name="id"   id="userid">
	</form>
<script type="text/javascript">
$(function(){
	   var u_id=$("#userid").val();
	 
	   $.ajax({
		   url:"<%=request.getContextPath()%>/login/getrole.do",
		   data:{"id":u_id},
		   type:"post",
		   dataType:"json",
		   success:function(data){
			   
			  var htm="";
			   for (var i = 0; i < data.roles.length; i++) {
				 
				 var count=0;
				 for (var j = 0; j < data.list.length; j++) {
					
					if(data.list[j].roleid==data.roles[i].roleid){
						
						htm+="<input type='checkbox' checked name='roleid' value='"+data.roles[i].id+"'>"+data.roles[i].roleName
						count=1;
						break;
					}
				}
				 if(count!=1){
					 htm+="<input type='checkbox'  name='roleid' value='"+data.roles[i].id+"'>"+data.roles[i].roleName
				 }
			  }
			   
			   $("#datat").append(htm);
			   
		   },error:function(){
			   alert("错误！");
		   }
		   
	   })
})
</script>

</body>

</html>