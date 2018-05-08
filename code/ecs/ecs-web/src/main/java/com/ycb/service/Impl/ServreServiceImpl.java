package com.ycb.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycb.service.ServreService;

import cn.kanmars.dao.TblServreServiceMapper;
import cn.kanmars.entity.TblMessageInfo;
import cn.kanmars.entity.TblSeesionInfo;

@Service
public class ServreServiceImpl implements ServreService{

	@Autowired
	private TblServreServiceMapper tblServreServiceMapper;

	@Override
	public List<TblSeesionInfo> querySurface(TblSeesionInfo tblSeesionInfo) {
		return tblServreServiceMapper.querySurface(tblSeesionInfo);
	}

	@Override
	public List<TblMessageInfo> queryMassage(String id) {
		tblServreServiceMapper.updZtState(id);
		return tblServreServiceMapper.queryMassage(id);
	}

	@Override
	public void addMassage(TblMessageInfo message) {
		tblServreServiceMapper.addMassage(message);
	}

	@Override
	public void removeMassage(String id) {
		tblServreServiceMapper.removeMassage(id);
	}
}
