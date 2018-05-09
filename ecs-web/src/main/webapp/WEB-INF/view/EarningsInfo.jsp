<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
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
   <div id="EarningsInfo"></div>
	<div id="addEI"></div>
	<div id="updEI"></div>
   <script type="text/javascript">
      //查询数据---------------------------------------------------------
  $(function(){
	  aavv();
  })
      function aavv(){
      $('#EarningsInfo').datagrid({    
	    url:'<%=request.getContextPath()%>/earningsInfo/selectList.do',
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
	        {field:'openid',title:'openid',width:100},    
	        {field:'wxUserName',title:'微信用户',width:100},    	       
	        {field:'manicheId',title:'机器ID',width:100},    	       
	        {field:'unversityName',title:'大学名称',width:100},    	       
	        {field:'unversityId',title:'大学ID',width:100},    	       
	        {field:'manicheName',title:'机器名称',width:100},    	       
	        {field:'price',title:'收益单价',width:100},    	       
	        {field:'coffeeNumber',title:'收益咖啡机数量',width:100},    	       
	        {field:'tolalMoney',title:' 当月收益总金额',width:100},    	       
	        {field:'earingMonth',title:'收益时间',width:100},    	       
	        {field:'earningStartTime',title:'收益开始时间',width:100},    	       
	        {field:'isEaningStatus',title:'是否下发收益',width:100},    	       
	        {field:'earningSendTime',title:'收益下发时间',width:100},    	       
	        {field:'createTime',title:'创建时间',width:100},    	       
	        {field:'createUser',title:'创建人',width:100},    	       
	        {field:'updateTime',title:'修改时间',width:100},
	        {field:'s',title:'操作 ',width:'100',align: 'center',halign:'center',formatter:function(value,row,index){
	        	return "<input type='button'  value='修改' onclick='updateEI(\""+row.id+"\")'>";
	        }}
	    ]]    
	})
  }
      
  function add(){				
		$('#addEI').dialog({    
		    title: '新增',    
		    width: 600,    
		    height: 300,    
		    closed: false,      
		    href: '<%=request.getContextPath()%>/earningsInfo/addEarningsInfo.do',    
		    modal: true,  		  
		    buttons:[{
				text:'保存',
				handler:function(){
					$('#EIAddForm').form('submit',{
						url:"<%=request.getContextPath()%>/earningsInfo/insetEarningsInfo.do",
						onSubmit: function(){  
					    	return $('#EIAddForm').form('validate');
					    },
					    success:function(data){
					    	
					        $('#addEI').dialog('close');
					        $('#EarningsInfo').datagrid("reload");
					    } 
					});
		
				}
			},{
				text:'关闭',
				handler:function(){
					 $('#addEI').dialog('close');
				}
			}]

		});    
		
	}
  
  function updateEI(id){
		$('#updEI').dialog({    
		    title: '修改',    
		    width: 600,    
		    height: 300,    
		    closed: false,      
		    href: '<%=request.getContextPath()%>/earningsInfo/queryEarningsInfo.do?id='+id,    
		    modal: true,  
		    buttons:[{
				text:'保存',
				handler:function(){
					
					$('#EIUpdateForm').form('submit',{
						url:"<%=request.getContextPath()%>/earningsInfo/updEarningsInfo.do",
						onSubmit: function(){    
					    	return $('#EIUpdateForm').form('validate');
					    },
					    success:function(data){    
					        $('#updEI').dialog('close');
					        $('#EarningsInfo').datagrid("reload");
					    } 
					});
		
				}
			},{
				text:'关闭',
				handler:function(){
					 $('#updEI').dialog('close');
				}
			}]

		});    
		
	}
  function del(){
		var ids="";
			//获取所有被选中的行
			var arr = $("#EarningsInfo").datagrid("getSelections");
			for (var i = 0; i < arr.length; i++) {
				ids+=","+arr[i].id;
			}
			ids = ids.substr(1);
		$.ajax({
			url:"<%=request.getContextPath()%>/earningsInfo/delEarningsInfo.do",
			type:"post",
			data:{"ids":ids},
			dataType:"json",
			success:function(data){
				if(data.success){
					$('#EarningsInfo').datagrid('load');
				}else{
					$.messager.alert("删除失败！");
				}
			}
			
		})
	}
   </script>
</body>
</html>