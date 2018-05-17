package com.ycb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ycb.service.WxUserIntentionService;

@Controller
@RequestMapping(value="uxUserIntention")
public class WxUserIntentionController {
	@Autowired
	private WxUserIntentionService wxUserIntentionService;

}
