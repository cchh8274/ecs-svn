package com.ycb.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycb.service.ReflectInfoService;

import cn.kanmars.dao.TblReflectInfoMapper;
import cn.kanmars.entity.TblPayResultInfo;
import cn.kanmars.entity.TblReflectInfo;

@Service
public class ReflectInfoServiceImpl implements ReflectInfoService{

	@Autowired
	private TblReflectInfoMapper tblReflectInfoMapper;

	@Override
	public List<TblReflectInfo> selectList(TblReflectInfo tblReflectInfo) {
		// TODO Auto-generated method stub
		return tblReflectInfoMapper.selectList(tblReflectInfo);
	}

	@Override
	public List<TblReflectInfo> selectpage(Integer page, Integer rows, TblReflectInfo tblReflectInfo) {
		TblReflectInfo tri = new TblReflectInfo(); 
		page = (page-1)*rows;
		tri.setLimitSize(rows);
		tri.setLimitStart(page);
	    return tblReflectInfoMapper.selectpage(tri);
	}

	@Override
	public List<TblReflectInfo> seleBringOutTheDetails(String openid) {
		
		return tblReflectInfoMapper.seleBringOutTheDetails(openid);
	}
	//添加提现记录
	@Override
	public void addBankamountInfo(TblReflectInfo rf) {
		
		tblReflectInfoMapper.addBankamountInfo(rf);
	}
}
