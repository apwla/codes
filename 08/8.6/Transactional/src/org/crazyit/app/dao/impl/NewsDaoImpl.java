package org.crazyit.app.dao.impl;

import javax.sql.DataSource;
import java.sql.Connection;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.*;

import org.crazyit.app.dao.*;

public class NewsDaoImpl implements NewsDao
{
	private DataSource ds;
	public void setDs(DataSource ds)
	{
		this.ds = ds;
	}
	@Transactional(propagation=Propagation.REQUIRED ,
		isolation=Isolation.DEFAULT , timeout=5)
	public void insert(String title, String content)
	{
		JdbcTemplate jt = new JdbcTemplate(ds);
		jt.update("insert into news_inf"
			+ " values(null , ? , ?)"
			, title , content);
		// ���β��������Υ��Ψһ��Լ��
		jt.update("insert into news_inf"
			+ " values(null , ? , ?)"
			, title , content);
		// ���û��������ƣ����һ����¼���Ա�����
		// �������������ƣ������ֵ�һ����¼Ҳ�岻��ȥ��
	}
}