package com.ycb.service;

import java.util.List;

import cn.kanmars.entity.TblReflectInfo;

public interface ReflectInfoService {

	List<TblReflectInfo> selectList(TblReflectInfo tblReflectInfo);

	List<TblReflectInfo> selectpage(Integer page, Integer rows, TblReflectInfo tblReflectInfo);

}