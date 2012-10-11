package in.datashow.sover.orm.job;

import in.datashow.sover.fetch.JobResult;

import java.util.List;
import java.util.Set;

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
	public static class ExploreResult {
		private String videoName;
		private String nativeId;
		private int year;
		private Set<String> actors;
		private String catName;
		private String areaName;
		private String picUrl;
		private String url;

		public String getNativeId() {
			return nativeId;
		}

		public void setNativeId(String nativeId) {
			this.nativeId = nativeId;
		}

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

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public Set<String> getActors() {
			return actors;
		}

		public void setActors(Set<String> actors) {
			this.actors = actors;
		}

		public String getCatName() {
			return catName;
		}

		public void setCatName(String catName) {
			this.catName = catName;
		}

		public String getAreaName() {
			return areaName;
		}

		public void setAreaName(String areaName) {
			this.areaName = areaName;
		}

		public String getPicUrl() {
			return picUrl;
		}

		public void setPicUrl(String picUrl) {
			this.picUrl = picUrl;
		}
	}
}
