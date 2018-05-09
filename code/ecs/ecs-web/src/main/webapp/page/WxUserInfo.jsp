<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
   <div id="WxUserInfo"></div>
   <script type="text/javascript">
      //查询数据---------------------------------------------------------
  $(function(){
	  aavv();
  })
      function aavv(){
      $('#WxUserInfo').datagrid({    
	    url:'<%=request.getContextPath()%>/WxUserInfo/queryWxUserInfo.do',
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
	        {field:'openid',title:'用户唯一标识',width:100},    
	        {field:'nickname',title:'用户的昵称',width:100},    
	       // {field:'sex',title:'性别',width:100},
	        {field:'sex',title:'性别',width:100,
	            formatter: function(value,row,index){
	                if (value=='1'){
	                    return "男";
	                } else {
	                    return '女';
	                }
	           }
	        },
	        {field:'city',title:'用户所在城市',width:100},
	        {field:'country',title:'用户所在国家',width:100},
	        {field:'province',title:'用户所在省份',width:100},
	        {field:'language',title:'用户的语言',width:100},
	        {field:'headimgurl',title:'用户头像',width:100},
	        {field:'subscribe_time',title:'用户关注时间',width:100},
	        {field:'unionid',title:'只用户绑定到微信',width:100},
	        {field:'remark',title:'公众号运营者对粉丝的备注',width:100},
	        {field:'groupid',title:'用户所在的分组ID',width:100},
	        {field:'tagidList',title:'用户被打上的标签ID列表',width:100},
	        {field:'subscribeScene',title:'返回用户关注的渠道来源',width:100},
	        {field:'qrScene',title:'二维码扫码场景',width:100},
	        {field:'qrSceneStr',title:'二维码扫码场景描述',width:100},
	        {field:'createtTime',title:'创建时间',width:100},
	        {field:'createUser',title:'创建人',width:100},
	    ]]    
	})
  }
	
   </script>
</body>
</html>