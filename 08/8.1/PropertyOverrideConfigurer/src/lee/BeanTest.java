package lee;

import javax.sql.DataSource;
import java.sql.*;

import org.springframework.context.*;
import org.springframework.context.support.*;

/**
 * Description:
 * <br/>??վ: <a href="http://www.crazyit.org">????Java????</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class BeanTest
{
	public static void main(String[] args)throws Exception
	{
		ApplicationContext ctx = new
			ClassPathXmlApplicationContext("beans.xml");
		DataSource ds = (DataSource)ctx.getBean("dataSource");
		Connection conn = ds.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(
			"insert into news_inf value(null , ? , ?)");
		pstmt.setString(1 , "????Java????");
		pstmt.setString(2 , "????iOS????");
		pstmt.executeUpdate();
		pstmt.close();
		conn.close();
	}
}