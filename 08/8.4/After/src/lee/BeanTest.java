package lee;

import org.springframework.context.*;
import org.springframework.context.support.*;

import org.crazyit.app.service.*;
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
	public static void main(String[] args)
	{
		// ????Spring????
		ApplicationContext ctx = new
			ClassPathXmlApplicationContext("beans.xml");
		Hello hello = ctx.getBean("hello" , Hello.class);
		hello.foo();
		hello.addUser("????" , "7788");
		World world = ctx.getBean("world" , World.class);
		world.bar();

	}
}