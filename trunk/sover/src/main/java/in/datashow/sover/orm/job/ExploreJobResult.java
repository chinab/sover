package in.datashow.sover.orm.job;

import in.datashow.sover.fetch.JobResult;

import java.util.List;

public class ExploreJobResult extends JobResult {

	private List<ExploreResult> videos;

	public List<ExploreResult> getVideos() {
		return videos;
	}

	public void setVideos(List<ExploreResult> videos) {
		this.videos = videos;
	}

	/**
	 * 探测到的对象
	 * 
	 * @author YY
	 * 
	 */
	class ExploreResult {
		private String videoName;
		private String url;

		public String getVideoName() {
			return videoName;
		}

		public void setVideoName(String videoName) {
			this.videoName = videoName;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}
	}

}
