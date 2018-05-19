<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试qrcode生成带logo的二维码并解决中文冲突</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/qrcode/jquery-1.8.0.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/qrcode/utf.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/qrcode/jquery.qrcode.js"></script>
</head>
<body>

<center>
	<div id="qrcode"></div>
</center>

<script type="text/javascript">
$(document).ready(function() {
         $("#qrcode").qrcode({
             render : "canvas", //设置渲染方式，有table和canvas
             text : "https://mp.weixin.qq.com/mp/profile_ext?action=home&__biz=MzUzNzYwMTM3Nw==#wechat_redirect", //扫描二维码后自动跳向该链接
             width : "300", //二维码的宽度
             height : "300", //二维码的高度
             background : "#ffffff", //二维码的后景色
             foreground : "#000000", //二维码的前景色
             src: '<%=request.getContextPath() %>/js/qrcode/b73032a571595760442b12a9d11218c6.jpg', //二维码中间的图片
         });
     });
     
     /* 想法思路：摒弃后台生成二维码的繁琐开发，并且不需要在服务器端生成多余的二维码图片，
     二维码直接通过JavaScript直接在客户端生成，有效减少带宽，以及维护成本。兰琴可以将此源码写在前台，
  text的话跳一个请求路径到后台，并带上查询出的openid，后台请求走一个C操作，根据openid将用户信息，
      关联信息保存到对应数据库，最后return跳转一个jsp页面，页面window.location.href跳转我们的
      公众号的路径。       src是logo，兰琴可以把查询的用户头像获取到这里来。*/
</script>
</body>
</html>