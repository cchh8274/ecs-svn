<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<font color="red" size="5">${role.roleName }</font> 
	</center>
	<input type="hidden" id="rid" value=" ${role.id }"> 
	<div >
    	<ul id="trees"></ul>
  	</div>   
  
<script type="text/javascript">
		var sums=$("#rid").val()
		$(function(){
			$("#trees").tree({
				url:"<%=request.getContextPath()%>/login/queryTrees.do",
				//最父级
				parentField:"pid",
			  	checkbox:true,
    		  	checkOnSelect:false,
    		   	selectOnCheck:false,    
    		   	striped:true,
    		   	ctrlselect:true,
    		   	queryParams:{
    			   id:$("#rid").val(),
    		   }, 
				
			})
		})
		
		
			
			  


</script>
</body>
</html>