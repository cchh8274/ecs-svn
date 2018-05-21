package com.ycb.service;

import java.util.List;

import cn.kanmars.entity.TblUniversityDetails;
import cn.kanmars.entity.TblUniversityInfo;

public interface UniversitService {

	List<TblUniversityInfo> queryTiaoSu();

	List<TblUniversityInfo> selectAreaInfoa(Integer page, Integer rows);

	TblUniversityInfo updateUniversit(String id);
	void addUniversit(TblUniversityInfo tui);
	void insetUniversita(TblUniversityInfo tui);
	//大学信息
	List<TblUniversityInfo> queryAddUniversita(String ocad);
	//大学详细信息
	List<TblUniversityInfo> daXuXinXiXangQing(String code);

	List<TblUniversityDetails> queryDetails(String id);

	List<TblUniversityDetails> fyqueryDetails(Integer page, Integer rows, String id);

	void insetUniversitDetails(TblUniversityDetails tud);

	TblUniversityDetails upQueryUniversitDetails(String id);

	void updUniversitDetails(TblUniversityDetails tud);

	void delUniversitDetails(String ids);
	//查询大学的id
	String idUnXinXi(String code);
//	查询附近的大学现在是写死的支取三条
	List<TblUniversityInfo> fuJinuniversityDetails(String lawz);

}
