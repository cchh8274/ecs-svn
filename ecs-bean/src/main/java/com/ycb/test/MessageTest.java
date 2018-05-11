package com.ycb.test;

import com.ycb.util.HttpUtils;
import com.ycb.util.SapHttpUtils;

public class MessageTest {
	public static void main(String[] args) {
		String  param="jsonStr={'openid':'111'}";
		boolean res=SapHttpUtils.sapsubmitPost("http://localhost:8080/ecs-web/chat/queryMessage.do", param);
		System.out.println(res);
	}
}		
