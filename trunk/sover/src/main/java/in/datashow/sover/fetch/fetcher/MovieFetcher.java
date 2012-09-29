package in.datashow.sover.fetch.fetcher;

import in.datashow.sover.fetch.MovieFetchStrategy;
import in.datashow.sover.orm.Movie;

import java.util.List;

/**
 * 新视频抓取实现
 */
public interface MovieFetcher {

	/**
	 * 自由抓取新电影
	 * 
	 * @param config
	 * @return
	 */
	public List<Movie> fetchMovie(MovieFetchStrategy config);

	/**
	 * 定向抓取
	 * 
	 * @param url
	 * @return
	 */
	public Movie fetchMovie(String url);
}
