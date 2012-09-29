package in.datashow.sover.fetch.fetcher;

import in.datashow.sover.fetch.EpisodeFetchConfig;
import in.datashow.sover.orm.Episode;

import java.util.List;

/**
 * 剧集抓取实现
 */
public interface EpisodeFetcher {
	/**
	 * 根据配置文件抓取剧集
	 * 
	 * @param config
	 * @return
	 */
	public List<Episode> fetchEpisode(EpisodeFetchConfig config);
}
