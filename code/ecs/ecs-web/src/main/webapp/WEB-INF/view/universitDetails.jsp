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
<link rel="stylesheet" href="<%=request.getContextPath()%>/js/zTree/css/zTreeStyle/zTreeStyle.css" type="text/css">
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
<script type="text/javascript" charset="utf-8" src="<%=request.getContextPath()%>/js/ueditor/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="<%=request.getContextPath()%>/js/ueditor/ueditor.all.js"></script>

    <script type="text/javascript" charset="utf-8" src="<%=request.getContextPath()%>/js/ueditor/lang/zh-cn/zh-cn.js"></script>
    <%--webuploader--%>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/js/webuploader-dist-v0.1.3/webuploader.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/webuploader-dist-v0.1.3/webuploader.js"></script>
</head>
<body>
	<input type="hidden" value="${id}" id="aaa">
	<div id="udxx">
		<a href="javascript:add()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">新增</a>
		<a href="javascript:del()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</a>
	</div>
	<div id="UniversityDetails"></div>
	<div id="addUD"></div>
	<div id="updUD"></div>
	
<script>
	
$(function(){
	var id = $("#aaa").val();
	  xx(id);
})
    function xx(id){
    $('#UniversityDetails').datagrid({    
	    url:'<%=request.getContextPath()%>/Universit/queryDetails.do?id='+id,
	    title:"大学表展示",
	    
	    //显示斑马线效果
	    striped:true,
	    //按住ctrl选择多行
	    ctrlSelect:true,
	    loadMsg:"数据加载中。。。。。。。。。。。。。。。。。。。。。。。。。。。。",
	    //字段列自适应
	    fitColumns:true,
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
	        {field:'universityName',title:'大学名称',width:100},    
	        {field:'universityId',title:'大学ID',width:100},    
	        {field:'headimg',title:'img',width:100,align:'center',formatter:function(value,row,index)
              {
                  return "<img width='50px' height='50px' src='"+value+"'/>";
              }},
            {field:'universityGrade',title:'大学等级',width:100},
            {field:'universityPeople',title:'大学人数',width:100},
            {field:'universityProbability',title:'大学投资回报率',width:100},
            {field:'universityAdvantage',title:'大学优势介绍',width:100},
	        {field : 'pz',title : '操作',formatter:function(value,rows,index){
	         	  return '<a href="javaScript:updateUD(\''+rows.id+'\')">修改</a>';
	           }},
	       
	        
	    ]]    
	})
}
	
function add(){	
	var id = $("#aaa").val();
	alert(id);
	$('#addUD').dialog({    
	    title: '新增',    
	    width: 600,    
	    height: 300,    
	    closed: false,      
	    href: '<%=request.getContextPath()%>/Universit/addUniversitDetails.do',    
	    modal: true,  		  
	    buttons:[{
			text:'保存',
			handler:function(){
				$('#UDAddForm').form('submit',{
					url:"<%=request.getContextPath()%>/Universit/insetUniversitDetails.do?idd="+id,
					onSubmit: function(){  
				    	return $('#UDAddForm').form('validate');
				    },
				    success:function(data){
				    	
				        $('#addUD').dialog('close');
				        $('#UniversityDetails').datagrid("reload");
				    } 
				});
	
			}
		},{
			text:'关闭',
			handler:function(){
				 $('#addUD').dialog('close');
			}
		}]

	});    
	
}

function updateUD(id){
	$('#updUD').dialog({    
	    title: '修改',    
	    width: 600,    
	    height: 300,    
	    closed: false,      
	    href: '<%=request.getContextPath()%>/Universit/upQueryUniversitDetails.do?id='+id,    
	    modal: true,  
	    buttons:[{
			text:'保存',
			handler:function(){
				
				$('#UDUpdateForm').form('submit',{
					url:"<%=request.getContextPath()%>/Universit/updUniversitDetails.do",
					onSubmit: function(){    
				    	return $('#UDUpdateForm').form('validate');
				    },
				    success:function(data){    
				        $('#updUD').dialog('close');
				        $('#UniversityDetails').datagrid("reload");
				    } 
				});
	
			}
		},{
			text:'关闭',
			handler:function(){
				 $('#updUD').dialog('close');
			}
		}]

	});    
	
}

function del(){
	var ids="";
		//获取所有被选中的行
		var arr = $("#UniversityDetails").datagrid("getSelections");
		for (var i = 0; i < arr.length; i++) {
			ids+=","+arr[i].id;
		}
		ids = ids.substr(1);
	$.ajax({
		url:"<%=request.getContextPath()%>/Universit/delUniversitDetails.do",
		type:"post",
		data:{"ids":ids},
		dataType:"json",
		success:function(data){
			if(data.success){
				$('#UniversityDetails').datagrid('load');
			}else{
				$.messager.alert("删除失败！");
			}
		}
		
	})
}
</script>
</body>
</html>