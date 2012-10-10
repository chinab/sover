package in.datashow.sover.orm.job;

/**
 * 检查任务
 * <p>
 * 检查已有资源更新状态的任务
 * </p>
 * 
 * @author YY
 * 
 */
public class CheckJob {
	private int order;
	private String url;
	private String videoUuid;

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getVideoUuid() {
		return videoUuid;
	}

	public void setVideoUuid(String videoUuid) {
		this.videoUuid = videoUuid;
	}
}
