package com.ycb.service.Impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycb.service.BankamountInfoService;

import cn.kanmars.dao.TblBankamountInfoMapper;
import cn.kanmars.entity.TblBankamountInfo;

@Service
public class BankamountInfoServiceImpl implements BankamountInfoService{

	@Autowired
	private TblBankamountInfoMapper tblBankamountInfoMapper;

	@Override
	public List<TblBankamountInfo> selectList(TblBankamountInfo tblBankamountInfo) {
		return tblBankamountInfoMapper.selectList(tblBankamountInfo);
	}

	@Override
	public List<TblBankamountInfo> selectpage(Integer page, Integer rows, TblBankamountInfo tblBankamountInfo) {
		TblBankamountInfo tif = new TblBankamountInfo(); 
		page = (page-1)*rows;
	    tif.setLimitSize(rows);
	  	tif.setLimitStart(page);
	    return tblBankamountInfoMapper.selectpage(tif);
	}
	//��ѯ��ǰ��û�����п�//������п�
	@Override
	public String seleBankamountInfo(String bankAmountNo) {
		
		return tblBankamountInfoMapper.seleBankamountInfo(bankAmountNo);
	}
	//Ìí¼ÓÒøÐÐ¿¨
	@Override
	public void addBankamountInfo(HashMap<String, String> hmap) {
		tblBankamountInfoMapper.addBankamountInfo(hmap);
		
	}
	//²éÑ¯¸ÃÓÃ»§ÓÐ¼¸ÕÅÒøÐÐ¿¨
	@Override
	public List<TblBankamountInfo> seleAllBankamountInfo(String openid) {
		
		return tblBankamountInfoMapper.seleAllBankamountInfo(openid);
	}
	 //²éÑ¯Ñ¡ÖÐµÄÒøÐÐ¿¨
	@Override
	public TblBankamountInfo dangeBankamountInfo(String bankAmountNo) {
		
		return tblBankamountInfoMapper.dangeBankamountInfo(bankAmountNo);
	}
	//回显银行卡
	@Override
	public TblBankamountInfo dangeBankamountInfohui(String openid) {
		return tblBankamountInfoMapper.dangeBankamountInfohui(openid);
	}

	@Override
	public TblBankamountInfo panduPwd(String openid) {
		
		return tblBankamountInfoMapper.panduPwd(openid);
	}

	@Override
	public List<TblBankamountInfo> seleUserPwd(String openid) {
		
		return tblBankamountInfoMapper.seleUserPwd(openid);
	}

	@Override
	public void updateUserToPwd(String forwardPwd, String id) {
		
		tblBankamountInfoMapper.updateUserToPwd(forwardPwd,id);
	}
//	判断用户是否已经添加过该银行的银行卡
	@Override
	public TblBankamountInfo judgeBankamountInfo(String openid, String bankName) {
		
		return tblBankamountInfoMapper.judgeBankamountInfo(openid,bankName);
	}
}
