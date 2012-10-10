package in.datashow.sover.orm.job;

import in.datashow.sover.fetch.JobResult;

import java.util.List;

/**
 * 检查任务返回结果
 * 
 * @author YY
 * 
 */
public class CheckJobResult extends JobResult {

	private boolean update;
	private List<CheckResult> parts;

	public boolean isUpdate() {
		return update;
	}

	public void setUpdate(boolean update) {
		this.update = update;
	}

	public List<CheckResult> getParts() {
		return parts;
	}

	public void setParts(List<CheckResult> parts) {
		this.parts = parts;
	}

	/**
	 * 检查更新结果
	 * 
	 * @author YY
	 * 
	 */
	class CheckResult {
		private String name;
		private int order;
		private String mediaSourceName;
		private String url;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getOrder() {
			return order;
		}

		public void setOrder(int order) {
			this.order = order;
		}

		public String getMediaSourceName() {
			return mediaSourceName;
		}

		public void setMediaSourceName(String mediaSourceName) {
			this.mediaSourceName = mediaSourceName;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

	}
}
