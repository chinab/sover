package in.datashow.sover.fetch;

/**
 * 抓取来源
 */
public class FetchSource {
	/**
	 * UUID
	 */
	private String uuid;
	/**
	 * 信息来源名称
	 */
	private String name;
	/**
	 * 来源首页
	 */
	private String homePage;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHomePage() {
		return homePage;
	}

	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}
}
