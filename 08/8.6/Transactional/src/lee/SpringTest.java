package lee;

import org.springframework.context.support.*;
import org.springframework.context.*;

import org.crazyit.app.dao.*;

public class SpringTest
{
	public static void main(String[] args)
	{
		// ����Spring����
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		// ��ȡ�������Bean
		NewsDao dao = (NewsDao)ctx.getBean("newsDao" , NewsDao.class);
		// ִ�в������
		dao.insert("���Java" , "������Java EE��ҵӦ��ʵս");
	}
}
