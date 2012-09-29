package in.datashow.sover.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

/**
 * 电视剧实体(剧集 +数据源)
 * 
 * @author yangyan
 * 
 */
@Entity
@javax.persistence.Table(name = "teleplay_entity")
public class TeleplayEntity {
	private String uuid;
	private Video video;
	private Teleplay teleplay;
	private VideoSource videoSource;
	private String url;

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(strategy = "uuid", name = "system-uuid")
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@ManyToOne
	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	@ManyToOne
	public Teleplay getTeleplay() {
		return teleplay;
	}

	public void setTeleplay(Teleplay teleplay) {
		this.teleplay = teleplay;
	}

	@ManyToOne
	public VideoSource getMovieSource() {
		return videoSource;
	}

	public void setMovieSource(VideoSource videoSource) {
		this.videoSource = videoSource;
	}

	@Column(nullable = false)
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
