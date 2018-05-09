package com.ycb.service;

import java.util.List;
import java.util.Map;

import cn.kanmars.entity.TblLogin;
import cn.kanmars.entity.TblUniversityInfo;

public interface UniversitService {

	List<TblUniversityInfo> queryTiaoSu();

	List<TblUniversityInfo> selectAreaInfoa(Integer page, Integer rows);

	TblUniversityInfo updateUniversit(String id);
	//�޸�����
	void addUniversit(TblUniversityInfo tui);
	//�����Ϣ
	void insetUniversita(TblUniversityInfo tui);
	//大学信息
	List<TblUniversityInfo> queryAddUniversita(String ocad);
	//大学详细信息
	List<TblUniversityInfo> daXuXinXiXangQing(String code);

}
