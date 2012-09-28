package in.datashow.sover;

import in.datashow.sover.sys.Context;

import org.hibernate.SessionFactory;

public class SpringTest {

	public static void main(String[] args) {
		Context.init();
		SessionFactory sf = Context.getApplicationContext().getBean(
				SessionFactory.class);
		sf.close();
		Context.destroy();
	}
}
