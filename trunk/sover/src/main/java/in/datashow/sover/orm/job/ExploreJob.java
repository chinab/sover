package in.datashow.sover.orm.job;

import java.util.Map;

/**
 * 资源探索任务
 * <p>
 * 探索新资源为目的的任务，如果names指定，则只探测给定名称的视频，否则探测所有资源
 * </p>
 * 
 * @author YY
 * 
 */
public class ExploreJob {
	/**
	 * 抓取分类结束点
	 */
	private Map<String, String> finishCategoryPoints;
	private String[] names;

	public String[] getNames() {
		return names;
	}

	public void setNames(String[] names) {
		this.names = names;
	}

	public Map<String, String> getFinishCategoryPoints() {
		return finishCategoryPoints;
	}

	public void setFinishCategoryPoints(Map<String, String> finishCategoryPoints) {
		this.finishCategoryPoints = finishCategoryPoints;
	}
}
