<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%String path = request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="<%=path %>/js/jquery-3.2.1/jquery-3.2.1.js"></script>
<script type="text/javascript" src="<%=path %>/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=path %>/js/easyui/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" type="text/css" href="<%=path %>/js/easyui/themes/default/easyui.css">   
<link rel="stylesheet" type="text/css" href="<%=path %>/js/easyui/themes/icon.css">  
<title>Insert title here</title>
</head>
<body>
	<table id="dg"></table>  
	<div id="tb">
		<a href="javascript:addlogin()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">新增</a>
		<a href="javascript:del()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</a>
		<div id="where" ></div>
	</div>
	<div id="dd"></div>
	<div id="adddlog"></div>
	<div id="updialog"></div>   
	<script type="text/javascript">
		function del(){
			var ids="";
				//获取所有被选中的行
				var arr = $("#dg").datagrid("getSelections");
				for (var i = 0; i < arr.length; i++) {
					ids+=","+arr[i].id;
				}
				ids = ids.substr(1);
			$.ajax({
				url:"<%=path%>/login/delCars.do",
				type:"post",
				data:{"ids":ids},
				dataType:"json",
				success:function(data){
					if(data.success){
						$('#dg').datagrid('load');
					}else{
						$.messager.alert("删除失败！");
					}
				}
				
			})
		}
		function role(id){
			$('#dd').dialog({    
			    title: "分配角色",
			    width: 400,    
			    height: 400,    
			    closed: false,    
			    cache: false,    
			    href: "<%=request.getContextPath()%>/login/addid.do?id="+id,
			    modal: true,
			    buttons:[{
					text:'保存',
					handler:function(){
						$.ajax({
							url:'<%=request.getContextPath()%>/login/addrole.do?loginid='+id,
							type:"post",
							
							data:$("#datat").serialize(),
							dataType:"text",
							success:function(data){
								data = eval("("+data+")");
								if(data.success){
									alert("分配成功")
									$('#dd').dialog('close');
									window.location.reload();
								}else{
									alert("分配失败")
								}
							}
						})
						
					}
				}]
			}); 
		}
		$('#dg').datagrid({    
		    url:'<%=path%>/login/queryrole.do',    
		    columns:[[    
		        {field:'',title:'',checkbox:true,},    
		        {field:'id',title:'用户编号',width:'33.3%',align: 'center',halign:'center'},    
		        {field:'adminName',title:'用户名称',width:'33.3%',align: 'center',halign:'center'},    
		        {field:'s',title:'操作 ',width:'33.3%',align: 'center',halign:'center',formatter:function(value,row,index){
		        	return "<input type='button'  value='分配角色' onclick='role("+row.id+")'>"+
		        	'<input type="button" value="修改" onclick="updatelogin('+row.id+')">';
		        }}
		    ]],
		    fit:true,
		    striped:true,
		    pagination:true,
		    ctrlSelect:true,
		    pageList:[10,15,20],
		    toolbar:'#tb'
		   
		}); 
		
		function addlogin(){				
			$('#adddlog').dialog({    
			    title: '用户新增',    
			    width: 600,    
			    height: 300,    
			    closed: false,      
			    href: '<%=request.getContextPath()%>/login/logAdduser.do',    
			    modal: true,  		  
			    buttons:[{
					text:'保存',
					handler:function(){
						$('#userAddForm').form('submit',{
							url:"<%=request.getContextPath()%>/login/adduser.do",
							onSubmit: function(){  
						    	return $('#userAddForm').form('validate');
						    },
						    success:function(data){
						        $('#adddlog').dialog('close');
						        $('#dg').datagrid("reload");
						    } 
						});
			
					}
				},{
					text:'关闭',
					handler:function(){
						 $('#adddialog').dialog('close');
					}
				}]

			});    
			
		}
		
		function updatelogin(id){
			
			$('#updialog').dialog({    
			    title: '修改',    
			    width: 600,    
			    height: 300,    
			    closed: false,      
			    href: '<%=request.getContextPath()%>/login/queryLogById.do?id='+id,    
			    modal: true,  
			    buttons:[{
					text:'保存',
					handler:function(){
						
						$('#userUpdateForm').form('submit',{
							url:"<%=request.getContextPath()%>/login/updateLog.do",
							onSubmit: function(){    
						    	return $('#userUpdateForm').form('validate');
						    },
						    success:function(data){    
						        $('#updialog').dialog('close');
						        $('#dg').datagrid("reload");
						    } 
						});
			
					}
				},{
					text:'关闭',
					handler:function(){
						 $('#updialog').dialog('close');
					}
				}]

			});    
			
		}
	</script>
</body>
</html>