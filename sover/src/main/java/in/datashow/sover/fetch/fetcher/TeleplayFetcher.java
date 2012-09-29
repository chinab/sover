package in.datashow.sover.fetch.fetcher;

import in.datashow.sover.fetch.TeleplayFetchConfig;
import in.datashow.sover.orm.Teleplay;

import java.util.List;

/**
 * 剧集抓取实现
 */
public interface TeleplayFetcher {
	/**
	 * 根据配置文件抓取剧集
	 * 
	 * @param config
	 * @return
	 */
	public List<Teleplay> fetchTeleplay(TeleplayFetchConfig config);
}
