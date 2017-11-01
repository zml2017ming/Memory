package com;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.preson.bean.PreBean;
import com.preson.service.PreService;
/*
 * struts2的action创建有三种方法
 * 1.直接创建一个action ,不继承也不实现
 * 2.创建一个action继承ActionSupport(推荐)
 * 3.创建一个cation实现Action接口
 */
public class HelloAction extends ActionSupport{
	public String helloword() {
		System.out.println("Hello, Word!");
		return SUCCESS;
	}
	public String hellochina(){
		System.out.println("Hello,China!good!");
		return "china";
	}
	
	public String getAllUser(){
		PreService service = new PreService();
		List<PreBean> list = service.showAll();
		ServletActionContext.getRequest().setAttribute("list", list);
		return SUCCESS;
	}
}
