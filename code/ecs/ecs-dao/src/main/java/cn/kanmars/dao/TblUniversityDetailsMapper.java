package cn.kanmars.dao;

import java.util.List;

import cn.kanmars.entity.TblUniversityDetails;

public interface TblUniversityDetailsMapper {
   /* int deleteByPrimaryKey(String id);

    int insert(TblUniversityDetails record);

    int insertSelective(TblUniversityDetails record);

    TblUniversityDetails selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TblUniversityDetails record);

    int updateByPrimaryKey(TblUniversityDetails record);*/
//	查询大学详细信息
        TblUniversityDetails seleUniversityDetails(String id);

	List<TblUniversityDetails> seleUniversityDetailsaaa();
}