package com.ycb.service;

import java.util.List;

import cn.kanmars.entity.TblUniversityDetails;

public interface UniversityDetailsService {
//	查询大学详细信息
	List<TblUniversityDetails> seleUniversityDetails(String id);

}
