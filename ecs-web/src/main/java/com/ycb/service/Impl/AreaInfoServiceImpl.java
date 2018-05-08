package com.ycb.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycb.service.AreaInfoService;

import cn.kanmars.dao.TblAreaInfoMapper;
import cn.kanmars.entity.TblAreaInfo;
@Service
public class AreaInfoServiceImpl implements AreaInfoService {
	@Autowired
	private TblAreaInfoMapper tblAreaInfoMapper;
		/*
		 * zjj 
		 * 分页查询
		 * @see com.ycb.service.AreaInfoService#queryAreaInfo()
		 */
	@Override
	public List<TblAreaInfo> queryAreaInfo() {
		
		return tblAreaInfoMapper.queryAreaInfo();
	}

	@Override
	public List<TblAreaInfo> selectAreaInfo(int page, int rows) {
		TblAreaInfo tai = new TblAreaInfo();
		page = (page-1)*rows;
		tai.setLimitSize(rows);
		tai.setLimitStart(page);
		return tblAreaInfoMapper.selectAreaInfo(tai);
	}
	//查询修改
	@Override
	public TblAreaInfo updAreaInfoa(String id) {
		return tblAreaInfoMapper.updAreaInfoa(id);
	}
	//修改新增
	@Override
	public void updAreaInfob(TblAreaInfo tai) {
		 tblAreaInfoMapper.updAreaInfob(tai);
		
	}
	//新增信息
	@Override
	public void insetAerainfoz(TblAreaInfo tif) {
		
		tblAreaInfoMapper.insetAerainfoz(tif);
	}

}
