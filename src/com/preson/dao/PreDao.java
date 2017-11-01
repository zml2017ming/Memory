package com.preson.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.preson.bean.PreBean;
import com.utils.jdbc.TxQueryRunner;


public class PreDao extends TxQueryRunner{
//	显示所有信息
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<PreBean> showAll() {
		List<PreBean> list = null;
		String sql = "SELECT * FROM pre";
		try {
			list = query(sql, new BeanListHandler(PreBean.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
//	修改信息
	public void modifyPre(PreBean bean) {
		String sql = "UPDATE username SET name=?, gender=? WHERE id=?";
		Object [] params = {bean.getName(), bean.getGender(), bean.getId()};
		try {
			update(sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
//	删除信息
	public void deletePre(int id) {
		String sql = "DELETE FROM pre WHERE id=?";
		try {
			update(sql, id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
//	新增信息
	public void addPre(String name, String gender) {
		String sql = "INSERT INTO pre (name, gender) VALUES (?,?)";
		Object [] params = {name, gender};
		try {
			update(sql, params);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

}
