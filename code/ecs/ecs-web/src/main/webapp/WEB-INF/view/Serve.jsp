<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%String path = request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.2.1/jquery-3.2.1.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/easyui/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/easyui/themes/default/easyui.css">   
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/js/easyui/themes/icon.css">
</head>
<style>
        .sender{
            clear:both;
        }
        .sender div:nth-of-type(1){
            float: left;
        }
        .sender div:nth-of-type(2){
            background-color: aquamarine;
            float: left;
            margin: 0 20px 10px 15px;
            padding: 10px 10px 10px 0px;
            border-radius:7px;
        }

        .receiver div:first-child img,
        .sender div:first-child img{
            width:50px;
            height: 50px;
        }

        .receiver{
            clear:both;
        }
        .receiver div:nth-child(1){
            float: right;
        }
        .receiver div:nth-of-type(2){
            float:right;
            background-color: gold;
            margin: 0 10px 10px 20px;
            padding: 10px 0px 10px 10px;
            border-radius:7px;
        }

        .left_triangle{
            height:0px;  
            width:0px;  
            border-width:8px;  
            border-style:solid;  
            border-color:transparent aquamarine transparent transparent;  
            position: relative;
            left:-16px;
            top:3px;
        }

        .right_triangle{
            height:0px;  
            width:0px;  
            border-width:8px;  
            border-style:solid;  
            border-color:transparent transparent transparent gold;  
            position: relative;
            right:-16px;
            top:3px;
        }

  </style>
<body>
    <div  class="easyui-layout" style="width:600px;height:400px;" data-options="fit:true">
        <div data-options="region:'west',title:'消息列表',split:true" style="width:200px;" class="newList">
        	<table id="dg"></table> 
        </div>
        <div data-options="region:'center',title:'消息会话 '" style="padding:5px;background:#eee;">
       	<div  class="easyui-layout" style="width:600px;height:400px;" data-options="fit:true">
	        <div data-options="region:'north',title:'消息页',split:true" style="height:450px;">
	            <div id="message"></div>
	        </div>
	        <div id="div1" data-options="region:'center',title:'消息输入'" style="padding:5px;background:">
	     		<form method="post" id="msgForm">
	     			<input name="message" id='msg' class="easyui-textbox" data-options="iconCls:'icon-search'" style="height:135px;width:850px"> 
	     			<input type="button" value="发送" id="msgButton" style="height:50px;width: 80px;margin-top:30px">
	     		</form>
	     	</div>
    </div>
        </div>
    </div>
</body>
<script>
	
//五分钟刷新一次会话列表页
var Interval1 = setInterval(function(){
	$('#dg').datagrid('reload');
	clearInterval(Interval1);
	},300*1000); 

//会话列表页
$('#dg').datagrid({    
		    url:'<%=path%>/servre/querySurface.do',    
		    columns:[[    
		        {field:'id',title:'我的会话列表 ',width:'105%',checkbox:true},
		        {field:'openId',title:'我的会话列表 ',width:'105%',hidden:true},
		        {field:'sessionId',title:'会话列表 ',width:'105%',align: 'center',halign:'center',formatter:function(value,row,index){
		        	/* var str=index+'-'+row.sessionId;
		        		\''+row.sessionId+'\'
		        	*/
		        	var mess=null;
		        	if(row.status == '010'){
		        		mess='已接待';
		        	}
					if(row.status == '020'){
						mess='未接待';
		        	}
		        	return '<a onclick="masg()" href="javascript:void(0)"   >会话('+row.openId+')('+mess+')</a>';
		        }} 
		    ]],
		    fit:true,
		    striped:true,
		    ctrlSelect:true,
		}); 
	
//消息页
function masg(){
	//id区的是会话的主键id
	var id = $('#dg').datagrid('getSelected').sessionId;
	/* var arr=id.split('-');
	$('#dg').datagrid("highlightRow",arr[0]);
	$('#dg').datagrid("checkRow",arr[0]); */
	//消息框
	$.ajax({
		type:"get",
		url:"<%=path%>/servre/queryMassage.do?id="+id,
		success:function(data){
			//data = eval("("+data+")");
			var message = "";
			for(var i=0;i<data.length;i++){
				if(data[i].stateZt == "010"){
					message+="<div class='sender'><div><img src=''></div><div>"
	                    +"<div class='left_triangle'></div><span id='Left'>"+data[i].message+"</span></div></div>";
				}else if(data[i].stateZt == "020"){
					message+="<div class='receiver'><div><img src='img/WallpaperStudio10-1758.jpg'></div>"
                    +"<div><div class='right_triangle'></div><span id='Right'>"+data[i].message+"</span></div></div>";
				}
			}
			$("#message").html(message);
		}
	})
	var Interval2 =  setInterval(function(){
		masg(id);
		clearInterval(Interval2);
		}, 15000); 
	}
	
//输入框
$('#msgButton').click(function(){
	var idd = $('#dg').datagrid('getSelections')[0].sessionId;
	var opid = $('#dg').datagrid('getSelections')[0].openId;
	var tex=$('#msg').textbox('getValue');
	tex = $.trim(tex);//自动删除空格
	if(tex == ''){
		$.messager.alert('警告','不能输入空的消息',"error"); 
		return ;
	}
	 $.ajax({
            type: "post",
            data: $('#msgForm').serialize(),
            url: "<%=request.getContextPath()%>/servre/addMassage.do?id="+idd+"&opid="+opid,
            success: function () {
            	//刷新消息框内容 
            	$('#msgForm').form('clear');//清空消息输入框内容  
            },
        });
})

</script>
</html>
