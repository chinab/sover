package in.datashow.sover;

import in.datashow.sover.orm.Movie;
import in.datashow.sover.sys.Context;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SpringTest {

	public static void main(String[] args) {
		Context.init();
		SessionFactory sf = Context.getApplicationContext().getBean(SessionFactory.class);

		Session session = sf.openSession();
		session.beginTransaction();

		Movie m = new Movie();

		m.setActors("刘德华 马德华 张阿华 王麻子");
		m.setMovieName("物资交流会");
		m.setPublishYear(1999);
		m.setType("single");

		Serializable s = session.save(m);

		System.out.println(s);

		session.getTransaction().commit();
		session.close();
		sf.close();
		Context.destroy();
	}
}
