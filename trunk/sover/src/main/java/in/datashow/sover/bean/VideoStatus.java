package in.datashow.sover.bean;

import java.util.Date;
import java.util.Set;

/**
 * 视频状态
 * 
 * @author yangyan
 * 
 */
public class VideoStatus {
	private String uuid; //视频UUID
	private boolean exists; // 是否存在
	private int maxOrder; // 最大剧集数
	private String maxTeleplay; // 最大剧集UUID
	private Set<String> fetchSources; // 包含此视频的数据源
	private Date lastCheckTeleplay; // 最后检查剧集的时间
	private Date lastUpdate; // 最后更新时间
	private boolean teleplayFinsh; // 剧集更新完成

	public boolean isExists() {
		return exists;
	}

	public void setExists(boolean exists) {
		this.exists = exists;
	}

	public int getMaxOrder() {
		return maxOrder;
	}

	public void setMaxOrder(int maxOrder) {
		this.maxOrder = maxOrder;
	}

	public String getMaxTeleplay() {
		return maxTeleplay;
	}

	public void setMaxTeleplay(String maxTeleplay) {
		this.maxTeleplay = maxTeleplay;
	}

	public Set<String> getFetchSources() {
		return fetchSources;
	}

	public void setFetchSources(Set<String> fetchSources) {
		this.fetchSources = fetchSources;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Date getLastCheckTeleplay() {
		return lastCheckTeleplay;
	}

	public void setLastCheckTeleplay(Date lastCheckTeleplay) {
		this.lastCheckTeleplay = lastCheckTeleplay;
	}

	public boolean isTeleplayFinsh() {
		return teleplayFinsh;
	}

	public void setTeleplayFinsh(boolean teleplayFinsh) {
		this.teleplayFinsh = teleplayFinsh;
	}

}
