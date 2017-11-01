package com.preson.service;

import java.util.List;

import com.preson.bean.PreBean;
import com.preson.dao.PreDao;

public class PreService {

	private PreDao dao = new PreDao();
//	显示所有信息
	public List<PreBean> showAll() {
		return dao.showAll();
	}
//	修改信息
	public void modifyPre(PreBean bean) {
		dao.modifyPre(bean);
	}
//	删除信息
	public void deletePre(PreBean bean) {
		dao.deletePre(bean.getId());
	}
//	增加信息
	public void addPre(PreBean bean) {
		dao.addPre(bean.getName(), bean.getGender());
	}

}
