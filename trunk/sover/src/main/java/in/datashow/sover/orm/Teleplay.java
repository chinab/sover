package in.datashow.sover.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 剧集信息
 */
@Entity
@Table(name = "teleplay")
public class Teleplay {
	/*
	 * UUID
	 */
	private String uuid;
	/*
	 * 视频
	 */
	private Video video;
	/*
	 * 剧集名称
	 */
	private String name;
	/*
	 * 排序
	 */
	private int orderSeq;

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(strategy = "uuid", name = "system-uuid")
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Column(nullable = false, length = 20)
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

	public void setVideo(Video video) {
		this.video = video;
	}

	@ManyToOne(optional = false)
	public Video getVideo() {
		return video;
	}

}
