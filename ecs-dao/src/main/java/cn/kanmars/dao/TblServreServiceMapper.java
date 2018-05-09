package cn.kanmars.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.kanmars.entity.TblMessageInfo;
import cn.kanmars.entity.TblSeesionInfo;

public interface TblServreServiceMapper {

	List<TblSeesionInfo> querySurface(TblSeesionInfo tblSeesionInfo);

	void updZtState(@Param("id")String id);

	List<TblMessageInfo> queryMassage(@Param("id") String id);

	void addMassage(TblMessageInfo message);

	void removeMassage(@Param("id")String id);


}
