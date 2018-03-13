<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
	<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
 	<!-- 该页面实现一个播放器播放一个已知地址的视频资源 -->
<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <title>视频播放</title>
  <link rel="stylesheet" href="./bs/css/bootstrap.css">
  <link rel="stylesheet" href="./bs/css/Kaoyanbangindex.css">
  <script src="./bs/js/jquery.min.js"></script>
  <script src="./bs/js/bootstrap.min.js"></script>
  <script src="./bs/js/holder.js"></script>
  <script src="./bs/js/jwplayer.js"></script>
  <script type="text/javascript">jwplayer.key="W+FSSIJICMeqqi4MQCwmdLePq9iq8HQqiVT5dQ==";</script>
 </head>
 <body>
	<div class="container">
		<h1 class='page-header'>视频播放</h1>
		<div class="row">
		<!-- 放置播放器 -->
		<div class="col-md-10">
		<div id="myplayer" class="embed-responsive embed-responsive-16by9">
		 <video id="myplayer2" class="jw-video jw-reset" x-webkit-airplay="allow"  src="https://hsy-first-yun-1252134166.cos.ap-chengdu.myqcloud.com/%E6%B1%A4%E5%AE%B6%E5%87%A4/1.mp4?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDR5pXUfX4rCFp56xK1SffELYQ1QS26STK%26q-sign-time%3D1520844763%3B1520846563%26q-key-time%3D1520844763%3B1520846563%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3D1baf007cf93cb0caa4b76f6b0315878ec166b675&token=df901b76d8576d6a64c79fc00a3a58d68f03705910001&clientIP=125.71.229.40&clientUA=f0fa511b-3836-46a8-8fce-1931f7c349bf" ></video>
		</div>
		</div>
		<!-- 可用于放视频列表 -->
		<div id="myplayer1" class="col-md-2" style="background: orange;">
		</div>
</div>
</div>
<script>

$(function (){
	 
	jwplayer('myplayer').setup({ 
		 
		file: "https://hsy-first-yun-1252134166.cos.ap-chengdu.myqcloud.com/%E6%B1%A4%E5%AE%B6%E5%87%A4/1.mp4?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDR5pXUfX4rCFp56xK1SffELYQ1QS26STK%26q-sign-time%3D1520844763%3B1520846563%26q-key-time%3D1520844763%3B1520846563%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3D1baf007cf93cb0caa4b76f6b0315878ec166b675&token=df901b76d8576d6a64c79fc00a3a58d68f03705910001&clientIP=125.71.229.40&clientUA=f0fa511b-3836-46a8-8fce-1931f7c349bf",       
		image: " ", 
		width: '100%',          
		height: '560px'
	});   
    
})
</script> 
 </body>
</html>
 