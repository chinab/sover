package in.datashow.sover.fetch.fetcher.impl;

import in.datashow.sover.fetch.TeleplayFetchConfig;
import in.datashow.sover.fetch.fetcher.TeleplayFetcher;
import in.datashow.sover.fetch.fetcher.VideoFetcher;
import in.datashow.sover.fetch.strategy.VideoFetchStrategy;
import in.datashow.sover.orm.Teleplay;
import in.datashow.sover.orm.Video;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 * xunbo.cc 网站视频抓取逻辑
 * @author yangyan
 *
 */
@Component("xunbo.cc")
public class Site_Xunbo_ComboFetcher implements VideoFetcher, TeleplayFetcher {

	@Override
	public List<Teleplay> fetchTeleplay(TeleplayFetchConfig config) {
		return null;
	}

	@Override
	public List<Video> fetchVideo(VideoFetchStrategy config) {
		return null;
	}

	@Override
	public Video fetchVideo(String url) {
		return null;
	}

}
