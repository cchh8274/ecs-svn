package com.ycb.service;

import java.util.List;

import cn.kanmars.entity.TblMessageInfo;
import cn.kanmars.entity.TblSeesionInfo;

public interface ServreService {

	List<TblSeesionInfo> querySurface(TblSeesionInfo tblSeesionInfo);

	List<TblMessageInfo> queryMassage( String id);

	void addMassage(TblMessageInfo message);

	void removeMassage(String id);


}
