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
   <div id="BankamountInfo"></div>
   <script type="text/javascript">
      //查询数据---------------------------------------------------------
  $(function(){
	  aavv();
  })
      function aavv(){
      $('#BankamountInfo').datagrid({    
	    url:'<%=request.getContextPath()%>/bankamountInfo/selectList.do',
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
	        {field:'userName',title:'用户名称',width:100},    
	        {field:'idcard',title:'身份证号',width:100},    
	        {field:'phone',title:'电话',width:100},    
	        {field:'wxName',title:'微信用户名称',width:100},    
	        {field:'openid',title:'openid',width:100},    
	        {field:'bankAmountNo',title:' 银行账户',width:100},    
	        {field:'bankName',title:'银行名称',width:100},    
	        {field:'bankAdress',title:'开户地址',width:100},   
	        {field:'createTime',title:'创建时间',width:100}, 
	        {field:'createUser',title:'创建人',width:100},   
	        {field:'updateTime',title:' 修改时间',width:100},   
	        {field:'updateUser',title:' 修改人',width:100},
	        {field:'cartImg',title:' 银行卡图片',width:100},
	    ]]    
	})
  }
	
   </script>
</body>
</html>