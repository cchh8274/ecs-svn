<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<div id="adduser_adduser" data-options="iconCls:'icon-save',resizable:true,modal:true,closed:true">
	</div> 
	
		
	<script type="text/javascript">
	//修改密码
	$(function(){
		fenPaiUser();
	})
	function fenPaiUser(){

		    	//增加---------------------------------------------
		    			$('#adduser_adduser').dialog({    
		    			    title: '分配用户',    
		    			    width: 500,    
		    			    height: 500,    
		    			    closed: false,    
		    			    cache: false,    
		    			    modal: true,
		    			    //拿新增页面
					    href:"<%=request.getContextPath()%>/login/fenPaiUseraform.do",
		    				onClose: function(){
		    					/* $('#adduser_adduser').html(""); */
		    				},
		    				buttons:[{
		    					text:'保存',
		    					iconCls:'submit',
		    					
		    					handler:function(){
		    				 var adminName =  $("#adminName").textbox('getValue');
		    				 var adminPassword =  $("#adminPassword").textbox('getValue');
		    				 var qxadminPassword =  $("#qxadminPassword").textbox('getValue');
		    				 if(adminName == null || adminName == ""){
		    						alert("账号不能为空");
		    						return false;
		    					}else if(adminPassword == null || adminPassword == ""){
		    						alert("密码不能为空");
		    						return false;
		    					}else if(qxadminPassword == null || qxadminPassword != adminPassword){
		    						alert("两次密码不一致");
		    						return false;
		    					}
		    						$.ajax({ 
		    			     			type:"post",
		    							url:'<%=request.getContextPath()%>/login/logUseradd.do',
		    			     			data:$("#formuser").serialize(),
		    			     			dataType:"text",
		    			     			success: function(data){
		    			     				alert(data);
		    			     				if(data=="zhanghao"){
		    			     					alert("用户已存在");
		    			     					return false;
		    			     				}
		    					     		  $('#adduser_adduser').dialog("close");
		    			   						location.href='http://localhost:8080/ecs-web/login.jsp';
		    			   					  
		    			     			}
		    			     		})
		    					 
		    					}
		    				},{
		    					text:'取消',
		    					iconCls:'icon-cancel',
		    					handler:function(){
		    						$('#adduser_adduser').dialog("close");
		    					}
		    				}]
		    			});   
		    		}  
	function selectzhnaghao(){
		alert(111111);
	}
	</script>
	
</body>
</html>