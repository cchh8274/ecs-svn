<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.2.1/jquery-3.2.1.js"></script>
<!-- jquery核心js文件 -->
<script type="text/javascript" src="<%=request.getContextPath()%>/js/easyui/jquery.min.js"></script>
<!-- easyui核心js文件 -->
<script type="text/javascript" src="<%=request.getContextPath()%>/js/easyui/jquery.easyui.min.js"></script>
<!-- easyui语言包 -->
<script type="text/javascript" src="<%=request.getContextPath()%>/js/easyui/locale/easyui-lang-zh_CN.js"></script>
<!-- jquery默认的css样式 -->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/js/easyui/themes/default/easyui.css">
<!-- jquery图标的css样式 -->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/js/easyui/themes/icon.css">
<!-- 引入ztree的资源 -->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/js/ztree/css/zTreeStyle/zTreeStyle.css" />
<script type="text/javascript" src="<%=request.getContextPath()%>/js/ztree/js/jquery.ztree.core.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/ztree/js/jquery.ztree.excheck.js"></script>
</head>
<body>
	<div id="tb">
		<a href="javascript:add()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">新增</a>
		<a href="javascript:del()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</a>
	</div>
	<div id="addEG"></div>
	<div id="updEG"></div>
   <div id="EarningsGather"></div>
   <script type="text/javascript">
      //查询数据---------------------------------------------------------
  $(function(){
	  aavv();
  })
      function aavv(){
      $('#EarningsGather').datagrid({    
	    url:'<%=request.getContextPath()%>/earningsGather/selectList.do',
	    title:"企业表展示",
	    
	    //显示斑马线效果
	    striped:true,
	    //在datagrid数据表格 只能选择一行
	    //singleSelect:true,
	    //按住ctrl选择多行
	    ctrlSelect:true,
	    loadMsg:"数据加载中。。。。。。。。。。。。。。。。。。。。。。。。。。。。",
	    //字段列自适应
	    fitColumns:true,
	    //nowrap:false,
	    //设置分页显示的属性
	    pagination:true,
	    //在设置分页属性的时候初始化页面大小
	    pageSize:3,
	    //在设置分页属性的时候 初始化页面大小选择列表
	    pageList:[1,3,5,7],
	    //当前页第几页
	    pageNumber:1,
	    toolbar: '#tbq',
	    columns:[[    
	         {field:'ck',checkbox:true},  
	        {field:'id',title:'id',width:100},    
	        {field:'erningsMonth',title:'收益月份',width:100},    
	        {field:'unversityId',title:'收益大学',width:100},    	       
	        {field:'number',title:'购买份数总额',width:100},    	       
	        {field:'openid',title:'openid',width:100},    	       
	        {field:'unversityName',title:'大学名称',width:100},    	       
	        {field:'areaName',title:'区域名称',width:100},    	       
	        {field:'areaId',title:'收益区域',width:100},    	       
	        {field:'createtime',title:'创建时间',width:100},    	       
	        {field:'createUser',title:' 创建人',width:100},
	        {field:'earningType',title:' 收益类型',width:100},
	        {field:'createUser',title:' 开始收益日期',width:100},
	        {field:'locationTime',title:' 投放日期',width:100},
	        {field:'s',title:'操作 ',width:'100',align: 'center',halign:'center',formatter:function(value,row,index){
	        	return "<input type='button'  value='修改' onclick='updateEG(\""+row.id+"\")'>";
	        }}
	    ]]    
	})
  }
      
  function add(){				
		$('#addEG').dialog({    
		    title: '新增',    
		    width: 600,    
		    height: 300,    
		    closed: false,      
		    href: '<%=request.getContextPath()%>/earningsGather/addEarningsGather.do',    
		    modal: true,  		  
		    buttons:[{
				text:'保存',
				handler:function(){
					$('#EGAddForm').form('submit',{
						url:"<%=request.getContextPath()%>/earningsGather/insetEarningsGather.do",
						onSubmit: function(){  
					    	return $('#EGAddForm').form('validate');
					    },
					    success:function(data){
					    	
					        $('#addEG').dialog('close');
					        $('#EarningsGather').datagrid("reload");
					    } 
					});
		
				}
			},{
				text:'关闭',
				handler:function(){
					 $('#addEG').dialog('close');
				}
			}]

		});    
		
	}
  
  function updateEG(id){
		$('#updEG').dialog({    
		    title: '修改',    
		    width: 600,    
		    height: 300,    
		    closed: false,      
		    href: '<%=request.getContextPath()%>/earningsGather/queryEarningsGather.do?id='+id,    
		    modal: true,  
		    buttons:[{
				text:'保存',
				handler:function(){
					
					$('#EGUpdateForm').form('submit',{
						url:"<%=request.getContextPath()%>/earningsGather/updEarningsGather.do",
						onSubmit: function(){    
					    	return $('#EGUpdateForm').form('validate');
					    },
					    success:function(data){    
					        $('#updEG').dialog('close');
					        $('#EarningsGather').datagrid("reload");
					    } 
					});
		
				}
			},{
				text:'关闭',
				handler:function(){
					 $('#updEG').dialog('close');
				}
			}]

		});    
		
	}
  
  function del(){
		var ids="";
			//获取所有被选中的行
			var arr = $("#EarningsGather").datagrid("getSelections");
			for (var i = 0; i < arr.length; i++) {
				ids+=","+arr[i].id;
			}
			ids = ids.substr(1);
		$.ajax({
			url:"<%=request.getContextPath()%>/earningsGather/delEarningsGather.do",
			type:"post",
			data:{"ids":ids},
			dataType:"json",
			success:function(data){
				if(data.success){
					$('#EarningsGather').datagrid('load');
				}else{
					$.messager.alert("删除失败！");
				}
			}
			
		})
	}
   </script>
</body>
</html>