package com.ycb.service;

import java.util.List;

import cn.kanmars.entity.TblMachineInfo;

public interface MachineIfmService {
		/*
		 * 分页查询
		 */
	List<TblMachineInfo> queryMachineIfm();

	List<TblMachineInfo> selectMachineIfm(int page, int rows);
	//修改查询
	TblMachineInfo selectaMachineIfm(String id);
	//修改新增
	void addMachineIfm(TblMachineInfo mif);
	//添加信息
	void insetMachineIfm(TblMachineInfo mif);

}
