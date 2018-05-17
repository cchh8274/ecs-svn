package cn.kanmars.dao;

import java.util.List;

import cn.kanmars.entity.TblWxUserIntention;

public interface TblWxUserIntentionMapper {

	List<TblWxUserIntention> queryWxUserIntention();

	List<TblWxUserIntention> selectWxUserIntention(TblWxUserIntention twui);
    
}