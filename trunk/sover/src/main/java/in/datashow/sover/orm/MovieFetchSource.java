package in.datashow.sover.orm;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

/**
 * 视频获取来源
 */
@Entity
@Table(name = "movie_fetch_source")
public class MovieFetchSource {
	/*
	 * UUID
	 */
	private String uuid;
	/*
	 * 电影
	 */
	private String movie;
	/*
	 * 来源
	 */
	private String source;
	/*
	 * 地址
	 */
	private String url;
	/*
	 * 最后更新时间
	 */
	private Date updatedAt;

	/*
	 * 最新的一集 UUID
	 */
	private String newestEpisode;

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getNewestEpisode() {
		return newestEpisode;
	}

	public void setNewestEpisode(String newestEpisode) {
		this.newestEpisode = newestEpisode;
	}

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(strategy = "uuid", name = "system-uuid")
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
}
