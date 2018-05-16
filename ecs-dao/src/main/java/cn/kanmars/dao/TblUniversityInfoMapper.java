/**
 * ecm Generator 
 */
package cn.kanmars.dao;


import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.kanmars.entity.TblLogin;
import cn.kanmars.entity.TblUniversityDetails;
import cn.kanmars.entity.TblUniversityInfo;
/**
 * 大学表
 * tbl_university_info
 */
@cn.kanmars.MybatisRepository
public interface TblUniversityInfoMapper {
    /**
     * 查询单个对象
     */
    public TblUniversityInfo select(TblUniversityInfo tblUniversityInfo);

    /**
     * 查询一个对象列表
     */
    public List<TblUniversityInfo> selectList(TblUniversityInfo tblUniversityInfo);

    /**
     * 新增对象，返回增加的数量
     */
    public int insert(TblUniversityInfo tblUniversityInfo);

    /**
     * 通过主键修改对象，返回修改的数量，主键不可修改
     */
    public int updateByPrimaryKey(TblUniversityInfo tblUniversityInfo);

    /**
     * 删除对象，返回删除的数量
     */
    public int delete(TblUniversityInfo tblUniversityInfo);

    /**
     * 查询一个对象HashMap，字段未驼峰化
     */
    public HashMap queryOneMap(HashMap paramMap);

    /**
     * 查询一个对象List<HashMap>，字段未驼峰化
     */
    public List<HashMap> queryListMap(HashMap paramMap);

    /**
     * 原子性更新一个对象，主键不可修改
     */
    public int updateCAS(HashMap paramMap);

    /**
     * 分页查询
     * 参数有两种情况：
     *     1、传递countFlag=Y标记,则返回的是计数
     *     2、传递countFlag=N标记、limitStart、limitSize,则返回的是分页结果,字段未驼峰化
     */
    public List<HashMap> queryForPage(HashMap paramMap);

    /**
     * 批量插入,如果是mysql数据库，需要在jdbcUrl中设置allowMultiQueries=true参数才可以使用
     * 如果为MYSQL数据库，返回值为插入条数，如果为ORACLE，返回值为第一条更新语句的指定结果，并非所有批量插入的总影响行数
     */
    public int insertBatch(List<HashMap> tblUniversityInfo);

    /**
     * 批量更新,如果是mysql数据库，需要在jdbcUrl中设置allowMultiQueries=true参数才可以使用
     * 返回值为第一条更新语句的执行结果，并非所有批量更新的语句总和
     */
    public int updateBatch(List<HashMap> tblUniversityInfo);

    /**
     * 根据主键查询单个对象
     */
    public TblUniversityInfo selectByPrimaryKey(String id);

    /**
     * editInfo，空的update语句
     */
    public int editInfo(HashMap paramMap);
    	/*
    	 * zjj查询分页
    	 */
	public List<TblUniversityInfo> queryTiaoSu();
	/*
	 * zjj查询分页
	 */

	public List<TblUniversityInfo> selectAreaInfoa(TblUniversityInfo tif);
	//修改大学信息
	public TblUniversityInfo updateUniversit(String id);
	//修改新增
	public void addUniversit(TblUniversityInfo tui);
	//添加信息
	public void insetUniversita(TblUniversityInfo tui);
	//大学信息
	public List<TblUniversityInfo> queryAddUniversita(String ocad);
	//大学详细信息
	public List<TblUniversityInfo> daXuXinXiXangQing(String code);

	public List<TblUniversityDetails> queryDetails(@Param("id")String id);

	public List<TblUniversityDetails> fyqueryDetails(TblUniversityDetails tud,@Param("id") String id);

	public void insetUniversitDetails(TblUniversityDetails tud);

	public TblUniversityDetails upQueryUniversitDetails(@Param("id")String id);

	public void updUniversitDetails(TblUniversityDetails tud);

	public void delUniversitDetails(@Param("ids")String ids);
    
}

