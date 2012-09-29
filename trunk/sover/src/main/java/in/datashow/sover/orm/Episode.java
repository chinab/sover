package in.datashow.sover.orm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 剧集信息
 */
@Entity
@Table(name = "episode")
public class Episode {
	/*
	 * UUID
	 */
	private String uuid;
	/*
	 * 电影UUID
	 */
	private String movie;
	/*
	 * 来源
	 */
	private int movieSource;
	/*
	 * 剧集名称
	 */
	private String name;
	/*
	 * 资源路径
	 */
	private String url;
	/*
	 * 排序
	 */
	private int orderSeq;
	/*
	 * 锁定排序
	 */
	private boolean lockOrder;

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(strategy = "uuid", name = "system-uuid")
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public int getMovieSource() {
		return movieSource;
	}

	public void setMovieSource(int movieSource) {
		this.movieSource = movieSource;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOrderSeq() {
		return orderSeq;
	}

	public void setOrderSeq(int orderSeq) {
		this.orderSeq = orderSeq;
	}

	public boolean isLockOrder() {
		return lockOrder;
	}

	public void setLockOrder(boolean lockOrder) {
		this.lockOrder = lockOrder;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
