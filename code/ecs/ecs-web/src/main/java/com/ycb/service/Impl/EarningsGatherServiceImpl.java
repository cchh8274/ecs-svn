package com.ycb.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycb.service.EarningsGatherService;

import cn.kanmars.dao.TblEarningsGatherMapper;
import cn.kanmars.entity.TblEarningsGather;

@Service
public class EarningsGatherServiceImpl implements EarningsGatherService{

	@Autowired
	private TblEarningsGatherMapper tblEarningsGatherMapper;

	@Override
	public List<TblEarningsGather> selectList(TblEarningsGather tblEarningsGather) {
		return tblEarningsGatherMapper.selectList(tblEarningsGather);
	}

	@Override
	public List<TblEarningsGather> selectpage(Integer page, Integer rows, TblEarningsGather tblEarningsGather) {
		TblEarningsGather teg = new TblEarningsGather(); 
		page = (page-1)*rows;
		teg.setLimitSize(rows);
		teg.setLimitStart(page);
	    return tblEarningsGatherMapper.selectpage(teg);
	}

	@Override
	public void insetEarningsGather(TblEarningsGather teg) {
		tblEarningsGatherMapper.insetEarningsGather(teg);
	}

	@Override
	public TblEarningsGather queryEarningsGather(String id) {
		return tblEarningsGatherMapper.queryEarningsGather(id);
	}

	@Override
	public void updEarningsGather(TblEarningsGather teg) {
		tblEarningsGatherMapper.updEarningsGather(teg);
	}

	@Override
	public void delEarningsGather(String ids) {
		tblEarningsGatherMapper.delEarningsGather(ids);
	}


}
