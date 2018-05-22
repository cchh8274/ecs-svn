package com.ycb.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycb.service.UniversityDetailsService;

import cn.kanmars.dao.TblUniversityDetailsMapper;
import cn.kanmars.entity.TblUniversityDetails;

@Service
public class UniversityDetailsServiceImpl implements  UniversityDetailsService{

	@Autowired
	private TblUniversityDetailsMapper tblUniversityDetailsMapper;
//	查询大学详细信息
	@Override
	public TblUniversityDetails seleUniversityDetails(String id) {
		return tblUniversityDetailsMapper.seleUniversityDetails(id);
	}
	@Override
	public List<TblUniversityDetails> seleUniversityDetailsaaa() {
		return tblUniversityDetailsMapper.seleUniversityDetailsaaa();
	}
}
