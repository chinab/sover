package in.datashow.sover.orm.job;


/**
 * 抓取任务
 * <p>
 * 抓取资源内容的任务
 * </p>
 * 
 * @author YY
 * 
 */
public class FetchTeleplayJob {
	private String name;
	private String url;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
