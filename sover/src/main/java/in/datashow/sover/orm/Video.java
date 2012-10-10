package in.datashow.sover.orm;

import in.datashow.sover.VideoType;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 视频信息（每部电影或电视剧只有一个）
 */
@Entity
@Table(name = "video")
public class Video {

	/*
	 * UUID
	 */
	private String uuid;
	/*
	 * 名称
	 */
	private String videoName;

	/**
	 * 别名
	 */
	private String[] aliases;
	/*
	 * 介绍
	 */
	private String videoIntroduce;
	/*
	 * 年份
	 */
	private int publishYear;
	/*
	 * 演员
	 */
	private Set<Actor> actors;
	/*
	 * 类型
	 */
	private VideoType videoType;

	/*
	 * 地区
	 */
	private Area area;

	/*
	 * 剧集
	 */
	private Set<Teleplay> teleplaies;

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(strategy = "uuid", name = "system-uuid")
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Enumerated(EnumType.STRING)
	public VideoType getVideoType() {
		return videoType;
	}

	public void setVideoType(VideoType videoType) {
		this.videoType = videoType;
	}

	public int getPublishYear() {
		return publishYear;
	}

	@Column(nullable = false)
	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public String getVideoIntroduce() {
		return videoIntroduce;
	}

	public void setVideoIntroduce(String videoIntroduce) {
		this.videoIntroduce = videoIntroduce;
	}

	public void setActors(Set<Actor> actors) {
		this.actors = actors;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	@ManyToMany(fetch = FetchType.EAGER)
	public Set<Actor> getActors() {
		return actors;
	}

	@ManyToOne
	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public String[] getAliases() {
		return aliases;
	}

	public void setAliases(String[] aliases) {
		this.aliases = aliases;
	}

	@OneToMany(fetch = FetchType.LAZY)
	public Set<Teleplay> getTeleplaies() {
		return teleplaies;
	}

	public void setTeleplaies(Set<Teleplay> teleplaies) {
		this.teleplaies = teleplaies;
	}

}
