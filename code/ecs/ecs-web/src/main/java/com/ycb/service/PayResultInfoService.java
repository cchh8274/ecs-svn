package com.ycb.service;

import java.util.List;

import cn.kanmars.entity.TblPayResultInfo;

public interface PayResultInfoService {

	List<TblPayResultInfo> selectList(TblPayResultInfo tblPayResultInfo);

	List<TblPayResultInfo> selectpage(Integer page, Integer rows, TblPayResultInfo tblPayResultInfo);

}
