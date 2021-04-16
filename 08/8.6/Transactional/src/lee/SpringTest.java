package lee;

import org.springframework.context.support.*;
import org.springframework.context.*;

import org.crazyit.app.dao.*;

public class SpringTest
{
	public static void main(String[] args)
	{
		// 创建Spring容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		// 获取事务代理Bean
		NewsDao dao = (NewsDao)ctx.getBean("newsDao" , NewsDao.class);
		// 执行插入操作
		dao.insert("疯狂Java" , "轻量级Java EE企业应用实战");
	}
}
