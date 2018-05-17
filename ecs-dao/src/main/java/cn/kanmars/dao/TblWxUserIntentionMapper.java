package cn.kanmars.dao;

import cn.kanmars.entity.TblWxUserIntention;

public interface TblWxUserIntentionMapper {
    int deleteByPrimaryKey(String id);

    int insert(TblWxUserIntention record);

    int insertSelective(TblWxUserIntention record);

    TblWxUserIntention selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TblWxUserIntention record);

    int updateByPrimaryKey(TblWxUserIntention record);
}