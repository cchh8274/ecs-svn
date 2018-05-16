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

<script type="text/javascript" charset="utf-8" src="<%=request.getContextPath()%>/js/ueditor/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="<%=request.getContextPath()%>/js/ueditor/ueditor.all.js"></script>
<script type="text/javascript" charset="utf-8" src="<%=request.getContextPath()%>/js/ueditor/lang/zh-cn/zh-cn.js"></script>
    <%--webuploader--%>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/js/webuploader-dist-v0.1.3/webuploader.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/webuploader-dist-v0.1.3/webuploader.js"></script>
</head>
<body>
<!-- 新增页面 -->
	 <div id="adduser_daxun" data-options="iconCls:'icon-save',resizable:true,modal:true,closed:true">
	</div>  
		<div id="tb">
		<a href="javascript:addUniversityInfo()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">新增</a>
    <div id="where" ></div>
	</div>
   <div id="UniversityInfo"></div>
   <script type="text/javascript">
      //查询数据---------------------------------------------------------
  $(function(){
	  aavv();
  })
      function aavv(){
      $('#UniversityInfo').datagrid({    
	    url:'<%=request.getContextPath()%>/Universit/queryUniversit.do',
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
	        {field:'univerName',title:'大学名称',width:100},    
	        {field:'areaName',title:'区域名称',width:100},    
	        {field:'areaId',title:'区域ID',width:100},    
	        {field:'location',title:'点的位置',width:100},    
	        {field:'createTime',title:'创建时间',width:100},    
	        {field:'createUser',title:'创建人',width:100},    
	        {field:'upTime',title:'修改时间',width:100},    
	        {field:'upUser',title:'修改人',width:100},
	        /* {field:'headimg',title:'img',width:100,align:'center',formatter:function(value,row,index)
                {
                    return "<img width='50px' height='50px' src='"+value+"'/>";
                }}, */
	        {field : 'pz',title : '操作',formatter:function(value,rows,index){
	         	  return '<a href="javaScript:aupdateUniversityInfo(\''+rows.id+'\')">修改</a>'+
	         	 		 '<a href="javaScript:details(\''+rows.id+'\')">    详情</a>';
	           }},
	       
	        
	    ]]    
	})
  }
//修改数据
  function aupdateUniversityInfo(id){
	   /* var aa= $('#UniversityInfo').datagrid('getChecked');
	   if(aa.length==1){
		   for(var i=0;i<aa.length;i++){
				var bb = aa[i].entId;
			 }  */
		 $('#adduser_daxun').dialog({    
			    title: '修改大学信息',    
			    width: 500,    
			    height: 500,    
			    closed: false,    
			    cache: false,    
			    modal: true,
			    //拿新增页面
			 	 href:"<%=request.getContextPath()%>/Universit/updateUniversit.do?id="+id,
				buttons:[{
					text:'保存',
					iconCls:'icon-save',
					handler:function(){
						$.ajax({
			     			type:"post",
			     			url:"<%=request.getContextPath()%>/Universit/addUniversit.do",
			     			data:$("#adddaxunForm1").serialize(),
			     			dataType:"text",
			     			success: function(){
			     				aavv();
			     				$('#adduser_daxun').dialog("close");
			     				/* $('#user_from').datagrid('reload');  */
			     			}
			     		})
					}
				},{
					text:'取消',
					iconCls:'icon-cancel',
					handler:function(){
						$('#adduser_daxun').dialog("close");
					}
				}]
			})
		   
	  /*  }else{
		   alert("只能选中一个"); 
	   }*/
	   
     }
      
     function addUniversityInfo(){
    	//增加---------------------------------------------
    			$('#adduser_daxun').dialog({    
    			    title: '增加用户信息',    
    			    width: 500,    
    			    height: 500,    
    			    closed: false,    
    			    cache: false,    
    			    modal: true,
    			    //拿新增页面
			    href:"<%=request.getContextPath()%>/Universit/addUniversita.do",
    				onClose: function(){
    					/* $('#adduser_daxun').html(""); */
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
    			     			url:"<%=request.getContextPath()%>/Universit/insetUniversita.do",
    			     			data:$("#addUniversit").serialize(),
    			     			dataType:"text",
    			     			success: function(){
    			     				aavv();
    			     				$('#adduser_daxun').dialog("close");
    			     			}
    			     		})
    					/* } */
    					}
    				},{
    					text:'取消',
    					iconCls:'icon-cancel',
    					handler:function(){
    						$('#adduser_daxun').dialog("close");
    					}
    				}]
    			});   
    		}  
     function details(id){
    	 location.href = "<%=request.getContextPath()%>/Universit/universitDetails.do?id="+id;
     }
	
   </script>
</body>
</html>