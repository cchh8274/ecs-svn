package com.ycb.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycb.service.UniversitService;

import cn.kanmars.dao.TblUniversityInfoMapper;
import cn.kanmars.entity.TblLogin;
import cn.kanmars.entity.TblUniversityDetails;
import cn.kanmars.entity.TblUniversityInfo;
@Service
public class UniversitServiceImpl implements UniversitService {
		@Autowired
		private TblUniversityInfoMapper tblUniversityInfoMapper;
	@Override
	public List<TblUniversityInfo> queryTiaoSu() {
		
		return tblUniversityInfoMapper.queryTiaoSu();
	}

	@Override
	public List<TblUniversityInfo> selectAreaInfoa(Integer page, Integer rows) {
		  TblUniversityInfo tif = new TblUniversityInfo();
		  page = (page-1)*rows;
		    tif.setLimitSize(rows);
		  	tif.setLimitStart(page);
	      return tblUniversityInfoMapper.selectAreaInfoa(tif);
		
	}
	//�޸Ĵ�ѧ��Ϣ
	@Override
	public TblUniversityInfo updateUniversit(String id) {
		
		return tblUniversityInfoMapper.updateUniversit(id);
	}
	//�޸�����
	@Override
	public void addUniversit(TblUniversityInfo tui) {
		tblUniversityInfoMapper.addUniversit(tui);
		
	}
	//�����Ϣ
	@Override
	public void insetUniversita(TblUniversityInfo tui) {
		tblUniversityInfoMapper.insetUniversita(tui);
		
	}
	//大学信息
	@Override
	public List<TblUniversityInfo> queryAddUniversita(String ocad) {
		
		return tblUniversityInfoMapper.queryAddUniversita(ocad);
	}
	//大学详细信息
	@Override
	public List<TblUniversityInfo> daXuXinXiXangQing(String code) {
		
		return tblUniversityInfoMapper.daXuXinXiXangQing(code);
	}

	public List<TblUniversityDetails> queryDetails(String id) {
		return tblUniversityInfoMapper.queryDetails(id);
	}

	public List<TblUniversityDetails> fyqueryDetails(Integer page, Integer rows, String id) {
		TblUniversityDetails tud = new TblUniversityDetails();
		  page = (page-1)*rows;
		  tud.setLimitSize(rows);
		  tud.setLimitStart(page);
	      return tblUniversityInfoMapper.fyqueryDetails(tud,id);
	}

	@Override
	public void insetUniversitDetails(TblUniversityDetails tud) {
		tblUniversityInfoMapper.insetUniversitDetails(tud);
	}

	@Override
	public TblUniversityDetails upQueryUniversitDetails(String id) {
		return tblUniversityInfoMapper.upQueryUniversitDetails(id);
	}

	@Override
	public void updUniversitDetails(TblUniversityDetails tud) {
		tblUniversityInfoMapper.updUniversitDetails(tud);
	}

	@Override
	public void delUniversitDetails(String ids) {
		tblUniversityInfoMapper.delUniversitDetails(ids);
	}

}
