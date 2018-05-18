package com.ycb.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.kanmars.entity.TblEarningsGather;

public interface EarningsGatherService {

	List<TblEarningsGather> selectList(TblEarningsGather tblEarningsGather);

	List<TblEarningsGather> selectpage(Integer page, Integer rows, TblEarningsGather tblEarningsGather);

	void insetEarningsGather(TblEarningsGather teg);

	TblEarningsGather queryEarningsGather(String id);

	void updEarningsGather(TblEarningsGather teg);

	void delEarningsGather(String ids);

}
