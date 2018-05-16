<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="UDAddForm" method="post">
      	<table>
      		<tr>
      			<td>大学名称:</td>
      			<td>
      				<input class="easyui-textbox" type="text" name="universityName"  style="width:180px">
      			</td>
      		</tr>
      		<tr>
      			<td>大学图片:</td>
      			<td>
      				<input id="imgs" type="hidden" >
				    <div id="img"></div>
				    <div id="uploader-demo">
				        <!--用来存放item-->
				        <div id="fileList" class="uploader-list"></div>
				        <div id="filePicker">选择图片</div>
				    </div>
      			</td>
      		</tr>
      	</table>
     </form>
<script>
   $(function(){
   if($("#UniversityDetails").datagrid('getSelected')!=null){
       var tr=$("#UniversityDetails").datagrid('getSelected');
       $("#img").html("<img  height='50' width='50' src='"+tr.headimg+"' />");
           }
       });
   
   // 初始化Web Uploader
   var uploader = WebUploader.create({

       // 选完文件后，是否自动上传。
       auto: true,

       // swf文件路径
       swf: '/js/webuploader-0.1.5/jekyll/js/Uploader.swf',

       // 文件接收服务端。
       server: '<%=request.getContextPath()%>/Universit/fileupload.do',

       // 选择文件的按钮。可选。
       // 内部根据当前运行是创建，可能是input元素，也可能是flash.
       pick: '#filePicker',

       // 只允许选择图片文件。
       accept: {
           title: 'Images',
           extensions: 'gif,jpg,jpeg,bmp,png',
           mimeTypes: 'image/*'
       }
   });

   // 当有文件添加进来的时候
   uploader.on( 'fileQueued', function( file ) {
       var $li = $(
           '<div id="' + file.id + '" class="file-item thumbnail">' +
           '<img>' +
           '<div class="info">' + file.name + '</div>' +
           '</div>'
           ),
           $img = $li.find('img');


       // $list为容器jQuery实例
       $("#fileList").append( $li );



       // 创建缩略图
       // 如果为非图片文件，可以不用调用此方法。
       // thumbnailWidth x thumbnailHeight 为 100 x 100
       uploader.makeThumb( file, function( error, src ) {
           if ( error ) {
               $img.replaceWith('<span>不能预览</span>');
               return;
           }

           $img.attr( 'src', src );
       }/*, thumbnailWidth, thumbnailHeight */);
   });

   // 文件上传过程中创建进度条实时显示。
   uploader.on( 'uploadProgress', function( file, percentage ) {
       var $li = $( '#'+file.id ),
           $percent = $li.find('.progress span');

       // 避免重复创建
       if ( !$percent.length ) {
           $percent = $('<p class="progress"><span></span></p>')
               .appendTo( $li )
               .find('span');
       }

       $percent.css( 'width', percentage * 100 + '%' );
   });

   // 文件上传成功，给item添加成功class, 用样式标记上传成功。
   uploader.on( 'uploadSuccess', function( file , response) {
       var imgurl = response._raw; //上传图片的路径
       //alert(imgurl);
       var str = '<input type="text" name="headimg" value="'+imgurl+'">';
       $("#img").html(str);
       $( '#'+file.id ).addClass('upload-state-done');
   });

   // 文件上传失败，显示上传出错。
   uploader.on( 'uploadError', function( file ) {
       var $li = $( '#'+file.id ),
           $error = $li.find('div.error');

       // 避免重复创建
       if ( !$error.length ) {
           $error = $('<div class="error"></div>').appendTo( $li );
       }

       $error.text('上传失败');
   });

   // 完成上传完了，成功或者失败，先删除进度条。
   uploader.on( 'uploadComplete', function( file ) {
       //  alert(file.name);
       $( '#'+file.id ).find('.progress').remove();

   });
   
   </script>
</body>
</html>