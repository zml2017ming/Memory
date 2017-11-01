package com.preson.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.preson.bean.PreBean;
import com.preson.service.PreService;
import com.utils.common.CommonUtils;
import com.utils.servlet.BaseServlet;

public class PreServlet extends BaseServlet {
	private PreService service = new PreService();
//	新增信息
	public String addPre(HttpServletRequest request, HttpServletResponse response){
//		获取输入
		Map<String, String[]> map = request.getParameterMap();
		PreBean bean = CommonUtils.toBean(map, PreBean.class);
//		service存储
		service.addPre(bean);
//		转到页面
		showAll(request, response);
		return "f:/jsps/show.jsp";
	}
//	删除信息
	public String deletePre(HttpServletRequest request, HttpServletResponse response){
//		获取输入
		Map<String, String[]> map = request.getParameterMap();
		PreBean bean = CommonUtils.toBean(map, PreBean.class);
//		service删除
		service.deletePre(bean);
//		返回页面
		showAll(request, response);
		return "f:/jsps/show.jsp";
	}
//	修改信息
	public String modifyPre(HttpServletRequest request, HttpServletResponse response){
//		获取输入
		Map<String, String[]> parameterMap = request.getParameterMap();
		PreBean bean = CommonUtils.toBean(parameterMap, PreBean.class);
//		service修改
		service.modifyPre(bean);
//		返回页面
//		return "f:jsps/show.jsp";
		showAll(request, response);
		return "f:/jsps/show.jsp";
	}
//	显示所有信息
	public String showAll(HttpServletRequest request, HttpServletResponse response){
		List<PreBean> list = service.showAll();
//		返回域
		request.setAttribute("list", list);
		return "f:/jsps/show.jsp";
	}
}
