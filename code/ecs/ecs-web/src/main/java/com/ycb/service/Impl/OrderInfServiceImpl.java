package com.ycb.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycb.service.OrderInfService;

import cn.kanmars.dao.TblOrderInfoMapper;
import cn.kanmars.entity.TblOrderInfo;
@Service
public class OrderInfServiceImpl implements OrderInfService {
	@Autowired
	private TblOrderInfoMapper tblOrderInfoMapper;
	/*
	 * zjj 分页查询
	 * @see com.ycb.service.OrderInfService#queryOrderInf()
	 */
	@Override
	public List<TblOrderInfo> queryOrderInf() {
		
		return tblOrderInfoMapper.queryOrderInf();
	}

	@Override
	public List<TblOrderInfo> selectOrderInf(int page, int rows) {
		TblOrderInfo toi = new TblOrderInfo();
		page = (page-1)*rows;
		toi.setLimitSize(rows);
		toi.setLimitStart(page);
		return tblOrderInfoMapper.selectOrderInf(toi);
	}

}
