package com.ycb.test;

import com.ycb.util.HttpUtils;

public class MessageTest {
	public static void main(String[] args) {
		String  param="jsonStr={'openid':'111'}";
		String res=HttpUtils.submitPost("http://localhost:8080/ecs-web/chat/queryMessage.do", param);
		System.out.println(res);
	}
}		
