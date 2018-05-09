<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
		<title>易创吧</title>
		<meta name="keywords" content="" />
		<meta name="description" content="" />
		<link href="./Css/layout.css" rel="stylesheet" type="text/css">
		<link href="./Css/login.css" rel="stylesheet" type="text/css">
		<script type="text/javascript" src="./jsjs/Js/jquery-1.7.2.min.js"></script>
		<script type="text/javascript" src="./jsjs/Js/js.js"></script>
		
	</head>
	<style>
		.ibar {display: none;}
	</style>
	<body class="login-bg" onkeydown="sendRequest()">
		<div class="main ">
			<!--登录-->
			<div class="login-dom login-max">
				<div class="logo text-center">
					<a href="#">
					<img src="Images/logo.png" width="180px" height="180px">
					</a>
				</div>
				<div class="login container " id="login">
					<p class="text-big text-center logo-color">
						易创吧，梦想的舞台
					</p>
					<p class=" text-center margin-small-top logo-color text-small">
						1 | 3 |2| 4
					</p>
					<form class="login-form" id="form1" >
						<div class="login-box border text-small" id="box">
							<div class="name border-bottom">
								<input type="text" placeholder="账号" id="adminName" name="adminName" >
							</div>
							<div class="pwd">
								<input type="password" placeholder="密码" datatype="*" id="adminPassword" name="adminPassword" nullmsg="请填写帐号密码">
							</div>
						</div>
						<input type="hidden" name="formhash" value="5abb5d21"/>
						<input type="button" id="denglu" onclick="login()" class="btn text-center login-btn" value="立即登录">
					</form>
					<!--  <div class="forget" >
					 	<span onclick="ModifyThePWD()"  class="forget-pwd text-small fl">修改密码</span>
					</div>  -->
				</div>
			</div>

			
		</div>
	</body>
	<script type="text/javascript">
	function sendRequest(){
		 if (event.keyCode==13)  //回车键的键值为13
//	 	   document.getElementByIdx_x("input1").click(); //调用登录按钮的登录事件
			login();
		}
		function popup_msg(msg) {
			$(".popup").html("" + msg + "");
			$(".popupDom").animate({
				"top": "0px"
			}, 400);
			setTimeout(function() {
				$(".popupDom").animate({
					"top": "-40px"
				}, 400);
			}, 2000);
		}

		/*动画（注册）*/
		$(document).ready(function(e) {
		});
		
		function login(){
			var adminName =$("#adminName").val();
			var adminPassword =$("#adminPassword").val();
			if(adminName == null || adminName == ""){
				alert("账号不能为空");
				return false;
			}else if(adminPassword == null || adminPassword == ""){
				alert("密码不能为空");
				return false;
			}else{
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
   					  }else{
                 	   location.href = "index.jsp";
   					  } 
                  },
                   
               })	
		
			}
		}
		<%-- function ModifyThePWD(){
			location.href ="<%=request.getContextPath()%>/login/ModifythePWD.do";   
		 	   
			    } --%>
	</script>

</html>