package com.ycb.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycb.service.AmountDetailService;

import cn.kanmars.dao.TblAmountDetailMapper;
import cn.kanmars.entity.TblAmountDetail;
import cn.kanmars.entity.TblReflectInfo;

@Service
public class AmountDetailServiceImpl implements AmountDetailService{

	@Autowired
	private TblAmountDetailMapper tblAmountDetailMapper;

	@Override
	public List<TblAmountDetail> selectList(TblAmountDetail ablAmountDetail) {
		return tblAmountDetailMapper.selectList(ablAmountDetail);
	}

	@Override
	public List<TblAmountDetail> selectpage(Integer page, Integer rows, TblAmountDetail ablAmountDetail) {
		TblAmountDetail tad = new TblAmountDetail(); 
		page = (page-1)*rows;
		tad.setLimitSize(rows);
		tad.setLimitStart(page);
	    return tblAmountDetailMapper.selectpage(tad);
	}
}
