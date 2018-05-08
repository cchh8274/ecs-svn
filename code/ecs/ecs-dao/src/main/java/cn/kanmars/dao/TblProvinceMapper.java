package cn.kanmars.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.kanmars.entity.TblAreaInfo;

/**
 * 区域表
 * tbl_province
 */
@cn.kanmars.MybatisRepository
public interface TblProvinceMapper {

	List<TblAreaInfo> region();

}
