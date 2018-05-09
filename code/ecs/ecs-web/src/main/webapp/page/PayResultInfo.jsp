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
   <div id="PayResultInfo"></div>
   <script type="text/javascript">
      //查询数据---------------------------------------------------------
  $(function(){
	  aavv();
  })
      function aavv(){
      $('#PayResultInfo').datagrid({    
	    url:'<%=request.getContextPath()%>/payResultInfo/selectList.do',
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
	        {field:'appid',title:'公众账号ID',width:100},    
	        {field:'mchId',title:'商户号',width:100},    
	        {field:'deviceInfo',title:'设备号',width:100},    
	        {field:'nonceStr',title:'随机字符串',width:100},    
	        {field:'sign',title:'签名',width:100},    
	        {field:'signType',title:'签名类型',width:100},    
	        {field:'resultCode',title:'支付结果',width:100},    
	        {field:'errCodeDes',title:'错误代码描述',width:100},   
	        {field:'errCode',title:'错误代码',width:100}, 
	        {field:'openid',title:'用户标识ID',width:100},   
	        {field:'tradeType',title:'是否关注公众账号',width:100},   
	        {field:'bankType',title:'付款银行',width:100},   
	        {field:'totalFee',title:'订单金额',width:100},   
	        {field:'settlementTotalFee',title:'应结订单金额',width:100},   
	        {field:'feeType',title:'货币种类',width:100},   
	        {field:'cashFee',title:'现金支付金额',width:100},   
	        {field:'cashFeeType',title:'现金支付货币类型',width:100},   
	        {field:'couponFee',title:'总代金券金额',width:100},   
	        {field:'couponCount',title:'代金券使用数量',width:100},   
	        {field:'couponType',title:'代金券类型',width:100},   
	        {field:'couponId',title:'代金券ID',width:100},   
	        {field:'couponFeeOne',title:'单个代金券支付金额',width:100},   
	        {field:'transactionIdtransactionId',title:'微信支付订单号',width:100},   
	        {field:'outTradeNo',title:'商户订单号',width:100},  
	        {field:'timeEnd',title:'支付完成时间',width:100},   
	        {field:'createTime',title:'创建时间',width:100},   
	        {field:'createUser',title:'创建人',width:100}   
	     
	       
	    ]]    
	})
  }
	
   </script>
</body>
</html>