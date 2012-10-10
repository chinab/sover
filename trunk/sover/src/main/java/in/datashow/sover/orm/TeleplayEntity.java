package in.datashow.sover.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

/**
 * 电视剧实体(剧集 +媒体源+信息源)
 * 
 * @author yangyan
 * 
 */
@Entity
@javax.persistence.Table(name = "teleplay_entity")
public class TeleplayEntity {
	private String uuid;
	private String nativeId;
	private String nativeCategory;
	private Video video;
	private Teleplay teleplay;
	private VideoFetchSource videoFetchSource;
	private VideoMediaSource videoMediaSource;
	private String mediaUrl;
	private String playUrl;
	private boolean last;

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
	public VideoMediaSource getVideoMediaSource() {
		return videoMediaSource;
	}

	public void setVideoMediaSource(VideoMediaSource videoMediaSource) {
		this.videoMediaSource = videoMediaSource;
	}

	@Column(nullable = false)
	public void setMediaUrl(String mediaUrl) {
		this.mediaUrl = mediaUrl;
	}

	public String getMediaUrl() {
		return mediaUrl;
	}

	public String getNativeId() {
		return nativeId;
	}

	public void setNativeId(String nativeId) {
		this.nativeId = nativeId;
	}

	public String getNativeCategory() {
		return nativeCategory;
	}

	public void setNativeCategory(String nativeCategory) {
		this.nativeCategory = nativeCategory;
	}

	@ManyToOne
	public VideoMediaSource getVideoSource() {
		return videoMediaSource;
	}

	public void setVideoSource(VideoMediaSource videoSource) {
		this.videoMediaSource = videoSource;
	}

	@ManyToOne
	public VideoFetchSource getVideoFetchSource() {
		return videoFetchSource;
	}

	public void setVideoFetchSource(VideoFetchSource videoFetchSource) {
		this.videoFetchSource = videoFetchSource;
	}

	public String getPlayUrl() {
		return playUrl;
	}

	public void setPlayUrl(String playUrl) {
		this.playUrl = playUrl;
	}

	public boolean isLast() {
		return last;
	}

	public void setLast(boolean last) {
		this.last = last;
	}

}
