<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
application.setAttribute("basePath", basePath);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%-- <jsp:include page="js/jsAll.jsp"></jsp:include>
 --%>
 <script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.2.1/jquery-3.2.1.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/easyui/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/easyui/themes/default/easyui.css">   
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/easyui/themes/icon.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/js/zTree/css/zTreeStyle/zTreeStyle.css" type="text/css">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/zTree/js/jquery.ztree.all.min.js"></script>
</head>
<body>
<div id="cc" class="easyui-layout" style="width:600px;height:500px;"data-options="fit:true">     
    <div data-options="region:'west',title:'操作菜单',split:true" style="width:200px;">
    <a id="btn6" href="javascript:logout()" class="easyui-linkbutton" data-options="iconCls:'icon-no'" style="position:fixed;top:3px;right:15px">注销登陆</a> 
    <a id="btn7" href="javascript:ModifyThePWD()" class="easyui-linkbutton"  style="position:fixed;top:3px;right:110px">修改密码</a> 
    	<!-- 菜单树  -->
			<!-- <ul id="menuTree5" class="ztree" style="width:260px; overflow:auto;"></ul> -->
			<ul id="tt"></ul>
    </div>   
    <div data-options="region:'center',title:'',border:true">
        <div id="tools" class="easyui-tabs" data-options="fit:true"  style="width:100%;height:100%;overflow:hidden">
			<div title="首页" style="padding:1px ;" >
			    	 	
			
			</div>
		</div>
     </div> 
     </div> 
     <div id="adduser_xiugaimm" data-options="iconCls:'icon-save',resizable:true,modal:true,closed:true">
	</div> 
</body> 

<script type="text/javascript">

$("#tt").tree({
    url:"login/getTree.do",
    onClick:function(node){
        if(!$("#tools").tabs('exists',node.text)){
            $("#tools").tabs('add',{
                title:node.text,
                content:createFrame(node.url),
                closable:true
            })
        }else{
            $("#tools").tabs('select',node.text)
        }
    }
})
 function createFrame(url){
        return '<iframe scrolling="auto" frameborder="0"  src="'+ url + '" style="width:100%;height:100%;"></iframe>';
    }

//选项卡判断
function addTabs(node){
	//exists方法 判断该选项卡是否存在
	var isFlag = $('#tools').tabs('exists',node.name);
	
	if(isFlag){
		// select方法 选中该tab选项卡
		$('#tools').tabs('select',node.name);
	}else{
		$('#tools').tabs('add',{    
		    title:node.name,    
		    href:'<%=request.getContextPath()%>'+node.menuUrl,    
		    closable:true,
		    tools:[{    
		        iconCls:'icon-mini-refresh',    
		        handler:function(){ //handler 处理者    
		        	refreshTab();
		        }    
		    } ]    
		});
	}
	
}

//刷新当前标签Tabs/选项卡
function refreshTab() {
	//获取被选中的选项卡
  	var currentTab = $('#tools').tabs('getSelected');
	//获取呗选中的 选项卡内容
  	var v_content = currentTab.panel("options").content;
	//update更新tab方法
  	$('#tools').tabs('update', {
  		tab: currentTab,
  		options: {
  			content: v_content 
  		}
  	});
}

//销毁session，注销登陆----李叫兽
 function  logout(){
	 $.ajax({                   
		 	url:'<%=request.getContextPath()%>/login/cancellations.do',
		 	type:'get',
		 	async:false,
		 	dataType:'json',
		 	success:function(data){
		 		 location.href = "login.jsp";
		 			}
		 		});
	
} 




	
	function toggleFullScreen() {
		
		if (!document.fullscreenElement && // alternative standard method
			!document.mozFullScreenElement && !document.webkitFullscreenElement) {// current working methods
			if (document.documentElement.requestFullscreen) {
				document.documentElement.requestFullscreen();
			} else if (document.documentElement.mozRequestFullScreen) {
				document.documentElement.mozRequestFullScreen();
			} else if (document.documentElement.webkitRequestFullscreen) {
				document.documentElement.webkitRequestFullscreen(Element.ALLOW_KEYBOARD_INPUT);
			}
		} else {
			if (document.cancelFullScreen) {
				document.cancelFullScreen();
			} else if (document.mozCancelFullScreen) {
				document.mozCancelFullScreen();
			} else if (document.webkitCancelFullScreen) {
				document.webkitCancelFullScreen();
			}
		}
	}
	//修改密码
	function ModifyThePWD(){

		    	//增加---------------------------------------------
		    			$('#adduser_xiugaimm').dialog({    
		    			    title: '修改密码',    
		    			    width: 500,    
		    			    height: 500,    
		    			    closed: false,    
		    			    cache: false,    
		    			    modal: true,
		    			    //拿新增页面
					    href:"<%=request.getContextPath()%>/login/ModifythePWD.do",
		    				onClose: function(){
		    					/* $('#adduser_xiugaimm').html(""); */
		    				},
		    				buttons:[{
		    					text:'保存',
		    					iconCls:'submit',
		    					
		    					handler:function(){
		    				var adminName =  $("#adminName").textbox('getValue');
		    				 var adminPassword =  $("#adminPassword").textbox('getValue');
		    				 var xadminPassword =  $("#xadminPassword").textbox('getValue');
		    				 var qxadminPassword =  $("#qxadminPassword").textbox('getValue');
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
	    			     			type:"post",
	    							url:'<%=request.getContextPath()%>/login/logUser.do',
	    			     			data:$("#form1").serialize(),
	    			     			dataType:"text",
	    			     			success: function(data){
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
	    					     		  $('#adduser_xiugaimm').dialog("close");
	    			   						location.href='http://localhost:8080/ecs-web/login.jsp';
	    			   					  } 
	    			     			}
	    			     		})
	    					 
	    					}
	    				},{
	    					text:'取消',
	    					iconCls:'icon-cancel',
	    					handler:function(){
	    						$('#adduser_xiugaimm').dialog("close");
	    					}
	    				}]
	    			});   
	    		}  
		    		
</script>
</html>
