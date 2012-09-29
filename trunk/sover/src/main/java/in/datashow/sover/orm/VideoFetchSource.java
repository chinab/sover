package in.datashow.sover.orm;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

/**
 * 视频获取来源
 */
@Entity
@Table(name = "video_fetch_source")
public class VideoFetchSource {
	/*
	 * UUID
	 */
	private String uuid;

	/**
	 * 视频
	 */
	private Video video;
	/*
	 * 来源
	 */
	private VideoSource videoSource;
	/*
	 * 地址
	 */
	private String url;
	/*
	 * 最后更新时间
	 */
	private Date updatedAt;

	@ManyToOne
	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	@Column(nullable = false)
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

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(strategy = "uuid", name = "system-uuid")
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@ManyToOne(optional = false)
	public VideoSource getVideoSource() {
		return videoSource;
	}

	public void setVideoSource(VideoSource videoSource) {
		this.videoSource = videoSource;
	}

}
