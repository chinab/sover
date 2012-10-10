package in.datashow.sover.orm.job;

import in.datashow.sover.orm.VideoFetchSource;

/**
 * 获取视频信息
 * 
 * @author YY
 * 
 */
public class FetchVideoJob {
	private VideoFetchSource fetchSource;
	private String url;

	public VideoFetchSource getFetchSource() {
		return fetchSource;
	}

	public void setFetchSource(VideoFetchSource fetchSource) {
		this.fetchSource = fetchSource;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
