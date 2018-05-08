package com.ycb.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycb.service.MachineGatherInfoService;

import cn.kanmars.dao.TblMachineGatherInfoMapper;
import cn.kanmars.entity.TblMachineGatherInfo;
@Service
public class MachineGatherInfoServiceImpl implements MachineGatherInfoService {
	
	@Autowired
	private TblMachineGatherInfoMapper tblMachineGatherInfoMapper;
	/*
	 * zjj 分页查询
	 * @see com.ycb.service.MachineGatherInfoService#queryMachineGatherInfo()
	 */
	@Override
	public List<TblMachineGatherInfo> queryMachineGatherInfo() {
		
		return tblMachineGatherInfoMapper.queryMachineGatherInfo();
	}

	@Override
	public List<TblMachineGatherInfo> selectMachineGatherInfo(int page, int rows) {
		TblMachineGatherInfo tmgi = new TblMachineGatherInfo();
		page = (page-1)*rows;
		tmgi.setLimitSize(rows);
		tmgi.setLimitStart(page);
		return tblMachineGatherInfoMapper.selectMachineGatherInfo(tmgi);
	}

}
