package in.datashow.sover;

import in.datashow.sover.orm.VideoMediaSource;
import in.datashow.sover.sys.Context;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SpringTest {

	public static void main2(String[] args) {
		String url = "gvod://svr03.gvod.tv:8089/7F008637BDD3B66964B71A79438C862D982E03F8/269381389/[迅雷下载www.2tu.cc]民兵葛二蛋.TV-01.rmvb";

		System.out.println(url.matches("^gvod://.+"));
	}

	public static void init() {
		SessionFactory sf = Context.getApplicationContext().getBean(
				SessionFactory.class);

		Session session = sf.openSession();
		session.beginTransaction();

		int updated = session.createQuery("delete from VideoMediaSource vs")
				.executeUpdate();

		System.out.println(updated);

		VideoMediaSource qvod = new VideoMediaSource();
		qvod.setName("快播");
		qvod.setUrlPattern("^gvod://.+");
		VideoMediaSource bdhd = new VideoMediaSource();
		bdhd.setName("百度影音");
		bdhd.setUrlPattern("^bdhd://.+");
		session.save(qvod);
		session.save(bdhd);
		//
		// Video m = new Video();
		//
		// m.setActors("刘德华 马德华 张阿华 王麻子");
		// m.setMovieName("物资交流会");
		// m.setPublishYear(1999);
		// m.setMovieDesc("发生地方的说法但是范德萨发生的发生大发生大发生的就离开；fjsdklf");
		// m.setVideoType(VideoType.MOVIE);
		//
		// Serializable s = session.save(m);
		//
		// System.out.println(s);

		session.getTransaction().commit();
		session.close();
		sf.close();
	}

	public static void main(String[] args) {
		Context.init();
		init(); //生成数据库
		Context.destroy();
	}
}
