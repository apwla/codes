package org.crazyit.app.service.impl;

import org.crazyit.app.service.*;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class MyServiceImpl implements MyService
{
	public int validLogin(String username , String pass)
	{
		// �˴�ֻ�Ǽ�ʾ������ֱ���ж��û����������Ƿ����Ҫ��
		if ( username.equals("crazyit.org")
			&& pass.equals("leegang") )
		{
			return 99;
		}
		return -1;
	}
}