package com.ycb.service;

import java.util.List;

import cn.kanmars.entity.TblMachineGatherInfo;

public interface MachineGatherInfoService {
	/*
	 * zjj 分页查新
	 */
	List<TblMachineGatherInfo> queryMachineGatherInfo();

	List<TblMachineGatherInfo> selectMachineGatherInfo(int page, int rows);

}
