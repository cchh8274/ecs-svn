package com.ycb.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycb.service.ProvinceService;

import cn.kanmars.dao.TblAreaInfoMapper;
import cn.kanmars.entity.TblAreaInfo;

@Service
public class ProvinceServiceImpl implements ProvinceService{

	
	@Autowired
	private TblAreaInfoMapper  tblAreaInfoMapper;


	@Override
	public List<TblAreaInfo> region() {
		List<TblAreaInfo> list =tblAreaInfoMapper.selectAreaInfoList();
		return list;
	}

}
