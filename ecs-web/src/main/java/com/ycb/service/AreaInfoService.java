package com.ycb.service;

import java.util.List;
import java.util.Map;

import cn.kanmars.entity.TblAreaInfo;

public interface AreaInfoService {
	/*
	 * 张见军
	 * 分页查询
	 */
	List<TblAreaInfo> queryAreaInfo();

	List<TblAreaInfo> selectAreaInfo(int page, int rows);
	//查询修改
	TblAreaInfo updAreaInfoa(String id);
	//修改新增
	void updAreaInfob(TblAreaInfo tai);
	//新增信息
	void insetAerainfoz(TblAreaInfo tif);

}
