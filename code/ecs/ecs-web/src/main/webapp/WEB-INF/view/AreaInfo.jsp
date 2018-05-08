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
</head>
<body>
<!-- 新增页面 -->
	 <div id="adduser_dialo" data-options="iconCls:'icon-save',resizable:true,modal:true,closed:true">
	</div> 
	<div id="tb">
		<a href="javascript:addUniversityInfob()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">新增</a>
    <div id="where" ></div>
	</div>
   <div id="AreaInfo"></div>
   <script type="text/javascript">
      //查询数据---------------------------------------------------------
  $(function(){
	  aavv();
  })
      function aavv(){
      $('#AreaInfo').datagrid({    
	    url:'<%=request.getContextPath()%>/AreaInfo/queryAreaInfo.do',
	    title:"区域信息",
	    
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
	        {field:'areaName',title:'区域名称',width:100},    
	        //{field:'status',title:'areaCode',width:100},
	     {field:'status',title:'状态',width:100,
	            formatter: function(value,row,index){
	                if (value=='1'){
	                    return "正常";
	                } else if (value=='2'){
	                    return '不正常';
	                }
	           }
	        },
	        {field:'enableLevl',title:'启用等级',width:100},
	        {field:'pageStatus',title:'页面启用状态',width:100},
	        {field:'createTime',title:'创建时间',width:100},
	        {field:'createUser',title:'创建人',width:100},
	        {field:'updateTime',title:'修改时间',width:100},
	        {field:'upUser',title:'修改人',width:100},
	        {field:'area_code',title:'修改人',width:100},
	        {field : 'pz',title : '操作',formatter:function(value,rows,index){
	         	  return '<a href="javaScript:updateUniversityInfob(\''+rows.id+'\')">修改</a>';
	           }},
	       /*  {field:'s',title:'操作 ',width:100,formatter:function(value,row,index){
	        	return '<input type="button" value="修改" onclick="updateUniversityInfo('+row.id+')">';
	        }} */
	        
	    ]]    
	})
  }
//修改数据
  function updateUniversityInfob(id){
	   /* var aa= $('#UniversityInfo').datagrid('getChecked');
	   if(aa.length==1){
		   for(var i=0;i<aa.length;i++){
				var bb = aa[i].entId;
			 }  */
		 $('#adduser_dialo').dialog({    
			    title: '区域信息',    
			    width: 500,    
			    height: 500,    
			    closed: false,    
			    cache: false,    
			    modal: true,
			    //拿新增页面
			    href:"<%=request.getContextPath()%>/AreaInfo/updAreaInfoa.do?id="+id,
				buttons:[{
					text:'保存',
					iconCls:'icon-save',
					handler:function(){
						$.ajax({
			     			type:"post",
			     			url:"<%=request.getContextPath()%>/AreaInfo/updAreaInfob.do",
			     			data:$("#addareainfo").serialize(),
			     			dataType:"text",
			     			success: function(){
			     				aavv();
			     				$('#adduser_dialo').dialog("close");
			     				/* $('#user_from').datagrid('reload');  */
			     			}
			     		})
					}
				},{
					text:'取消',
					iconCls:'icon-cancel',
					handler:function(){
						$('#adduser_dialo').dialog("close");
					}
				}]
			})
		   
	  /*  }else{
		   alert("只能选中一个"); 
	   }*/
	   
     }
      
     function addUniversityInfob(){
    	//增加---------------------------------------------
    			$('#adduser_dialo').dialog({    
    			    title: '区域信息',    
    			    width: 500,    
    			    height: 500,    
    			    closed: false,    
    			    cache: false,    
    			    modal: true,
    			    //拿新增页面
			    href:"<%=request.getContextPath()%>/AreaInfo/addaerainfoz.do",
    				onClose: function(){
    					/* $('#adduser_dialo').html(""); */
    				},
    				buttons:[{
    					text:'保存',
    					iconCls:'submit',
    					
    					handler:function(){
    						/* var entName =  $("#name").textbox('getValue');
    				 var dizhi =  $("#name1").textbox('getValue');
    				 var dianhua =  $("#name2").textbox('getValue');
    					 	if(entName == null || entName == ""){
    							return false;
    						}else if(dizhi == null || dizhi == ""){
    							return false;
    						}else if(dianhua == null || dianhua == ""){
    							return false;
    						}else{*/
    						$.ajax({ 
    			     			type:"post",
    			     			url:"<%=request.getContextPath()%>/AreaInfo/insetAerainfoz.do",
    			     			data:$("#addAreaInfo").serialize(),
    			     			dataType:"text",
    			     			success: function(){
    			     				aavv();
    			     				$('#adduser_dialo').dialog("close");
    			     			}
    			     		})
    					/* } */
    					}
    				},{
    					text:'取消',
    					iconCls:'icon-cancel',
    					handler:function(){
    						$('#adduser_dialo').dialog("close");
    					}
    				}]
    			});   
    		}  
     
	
   </script>
</body>
</html>