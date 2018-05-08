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
	<table id="dgs"></table>  
	<div id="updapteStock"></div>
	<div id="addUser"></div>
	<div id="adddialog"></div> 
	<div id="updia"></div> 
<script type="text/javascript">

	$(function(){    
		$('#dgs').datagrid({    
		    url:'<%=request.getContextPath()%>/login/queryRole.do',
		    fit:true,
		    striped:true,
		    pagination:true,
		    checkOnSelect:false,
		    pageNumber:1,
		    pageSize:3,
		    pageList:[3,5,9],
		    toolbar: [{
				iconCls: 'icon-add',
				handler: function(){
					adds()
				}
			},'-',{
				iconCls: 'icon-remove',
				handler: function(){
					var uarr = $('#dgs').datagrid('getSelections');
					console.info(uarr);
					var ids = ""
					for (var i = 0; i < uarr.length; i++) {
						ids += uarr[i].id+",";
					}
					ids=ids.substring(0,ids.length-1);
					$.ajax({
						url:"<%=request.getContextPath()%>/login/removeRoleByIds.do?rids="+ids,
						success:function(msg){
							 $('#dgs').datagrid("reload");
						}		
					})
					$('#dgs').datagrid('reload');
					$.messager.show({
						title:'我的消息',
						msg:'删除成功！',
						showType:'show',
					});

				}
			}],
		    columns:[[     
				{field:'',title:'',checkbox:true,}, 
		        {field:'id',title:'编号',width:'33.3%',align: 'center',halign:'center'},    
		        {field:'roleName',title:'角色名',width:'33.3%',align: 'center',halign:'center'},
		        {field:'act',title:'操作',width:'33.3%',align: 'center',halign:'center',
		        	formatter: function(value,row,index){
						return '<input type="button" value="分配权限" onclick="updaptequan('+row.id+')">'+
						'<input type="button" value="修改" onclick="updatequan('+row.id+')">';
					}
		        },
		    ]]    
		}); 
	})
	function updaptequan(id){
		
		$('#updapteStock').dialog({    
		    title: '树',    
		    width: 600,    
		    height: 400,    
		    closed: false,    
		    href:'<%=request.getContextPath()%>/login/queryQuanById.do?rid2='+id,    
		    modal: true,
		    buttons:[{
				text:'保存',
				handler:function(){
					var array= $('#trees').tree('getChecked');
					 var  qxid="";
		 				for (var i = 0; i < array.length; i++) {
								qxid+=","+array[i].id;
							}
		 				var  arr=qxid.substr(1)+"-"+id
					$.ajax({
	 				   url:"<%=request.getContextPath()%>/login/updateQuan.do?arr="+arr,
						type:"post",	   
	 				   success:function(data){
	 						$('#updapteStock').dialog("close")
	 				   }
	 			  	})
					
				}
			},{
				text:'关闭',
				handler:function(){
					$('#updapteStock').dialog('close')
				}
			}]

		}); 
	
	}
	
	
	
	function adds(){				
		$('#adddialog').dialog({    
		    title: '角色新增',    
		    width: 600,    
		    height: 300,    
		    closed: false,      
		    href: '<%=request.getContextPath()%>/login/jumpAddRole.do',    
		    modal: true,  		  
		    buttons:[{
				text:'保存',
				handler:function(){
					$('#addForm').form('submit',{
						url:"<%=request.getContextPath()%>/login/addRole.do",
						onSubmit: function(){  
					    	return $('#addForm').form('validate');
					    },
					    success:function(data){
					        $('#adddialog').dialog('close');
					        $('#dgs').datagrid("reload");
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
	function updatequan(id){
	
		$('#updia').dialog({    
		    title: '修改',    
		    width: 600,    
		    height: 300,    
		    closed: false,      
		    href: '<%=request.getContextPath()%>/login/queryRoleById.do?id='+id,    
		    modal: true,  
		    buttons:[{
				text:'保存',
				handler:function(){
					
					$('#updateForm').form('submit',{
						url:"<%=request.getContextPath()%>/login/updateRole.do",
						onSubmit: function(){    
					    	return $('#updateForm').form('validate');
					    },
					    success:function(data){    
					        $('#updia').dialog('close');
					        $('#dgs').datagrid("reload");
					    } 
					});
		
				}
			},{
				text:'关闭',
				handler:function(){
					 $('#updia').dialog('close');
				}
			}]

		});    
		
	}
</script>
</body>
</html>