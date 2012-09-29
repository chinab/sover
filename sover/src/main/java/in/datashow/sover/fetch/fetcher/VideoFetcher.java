package in.datashow.sover.fetch.fetcher;

import in.datashow.sover.fetch.strategy.VideoFetchStrategy;
import in.datashow.sover.orm.Video;

import java.util.List;

/**
 * 新视频抓取实现
 */
public interface VideoFetcher {

	/**
	 * 自由抓取新电影
	 * 
	 * @param config
	 * @return
	 */
	public List<Video> fetchVideo(VideoFetchStrategy config);

	/**
	 * 定向抓取
	 * 
	 * @param url
	 * @return
	 */
	public Video fetchVideo(String url);
}
