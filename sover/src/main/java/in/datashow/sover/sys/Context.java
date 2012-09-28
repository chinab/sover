package in.datashow.sover.sys;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 上下文环境
 */
public class Context {
	private static ClassPathXmlApplicationContext applicationContext;

	/**
	 * 初始化上下文
	 */
	public static void init() {
		applicationContext = new ClassPathXmlApplicationContext(
				"classpath:/applicationContext.xml");
	}

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	/**
	 * 销毁上下文
	 */
	public static void destroy() {
		applicationContext.destroy();
	}
}
