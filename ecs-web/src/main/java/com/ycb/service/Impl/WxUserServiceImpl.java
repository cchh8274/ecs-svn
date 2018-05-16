package com.ycb.service.Impl;

import java.util.Date;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycb.service.WxUserService;
import com.ycb.util.DateUtils;

import cn.kanmars.dao.TblWxUserInfoMapper;
import cn.kanmars.entity.TblWxUserInfo;

@Service
public class WxUserServiceImpl implements WxUserService{
	@Autowired
	private TblWxUserInfoMapper  tblWxUserInfoMapper; 
	
	@Override
	public void insetListWxUser(HashMap userInfos) throws Exception{
		TblWxUserInfo	tfo =new	TblWxUserInfo();
		Date dateDate = (Date) userInfos.get("createtTime");
	    String createtTime = DateUtils.dateToStrLong(dateDate);
		tfo.setCreatetTime(createtTime);
		tfo.setCreateUser((String) userInfos.get("createUser"));
		tfo.setQrSceneStr((String) userInfos.get("qrSceneStr"));
		tfo.setQrScene((String) userInfos.get("qrScene"));
		tfo.setSubscribeScene((String) userInfos.get("subscribeScene"));
		tfo.setGroupid((String) userInfos.get("groupid"));
		tfo.setRemark((String) userInfos.get("remark"));
		tfo.setUnionid((String) userInfos.get("unionid"));
		tfo.setSubscribeTime((String) userInfos.get("subscribeTime"));
		tfo.setCity((String) userInfos.get("headimgurl"));
		tfo.setLanguage((String) userInfos.get("language"));
		tfo.setProvince((String) userInfos.get("province"));
		tfo.setId((String) userInfos.get("id"));
		tfo.setOpenid((String) userInfos.get("openid"));
		tfo.setNickname((String) userInfos.get("nickname"));
		tfo.setSex((String) userInfos.get("sex"));
		tfo.setCity((String) userInfos.get("city"));
		tfo.setCountry((String) userInfos.get("country"));
		tblWxUserInfoMapper.insert(tfo);
	}

}
