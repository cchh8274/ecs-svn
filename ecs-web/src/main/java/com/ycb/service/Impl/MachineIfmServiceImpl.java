package com.ycb.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycb.service.MachineIfmService;

import cn.kanmars.dao.TblMachineInfoMapper;
import cn.kanmars.entity.TblMachineInfo;
@Service
public class MachineIfmServiceImpl implements MachineIfmService {
	@Autowired
	private TblMachineInfoMapper tblMachineInfoMapper;
	/*
	 * zjj 查询分页
	 * @see com.ycb.service.MachineIfmService#queryMachineIfm()
	 */
	@Override
	public List<TblMachineInfo> queryMachineIfm() {
		
		return tblMachineInfoMapper.queryMachineIfm();
	}

	@Override
	public List<TblMachineInfo> selectMachineIfm(int page, int rows) {
		TblMachineInfo tmi = new TblMachineInfo();
		page = (page-1)*rows;
		tmi.setLimitSize(rows);
		tmi.setLimitStart(page);
		return tblMachineInfoMapper.selectMachineIfm(tmi);
	}
	//修改查询

	@Override
	public TblMachineInfo selectaMachineIfm(String id) {
		
		return tblMachineInfoMapper.selectaMachineIfm(id);
	}
	//修改新增
	@Override
	public void addMachineIfm(TblMachineInfo mif) {
		tblMachineInfoMapper.addMachineIfm(mif);
		
	}
	//添加信息
	@Override
	public void insetMachineIfm(TblMachineInfo mif) {
		tblMachineInfoMapper.insetMachineIfm(mif);
		
	}
	

}
