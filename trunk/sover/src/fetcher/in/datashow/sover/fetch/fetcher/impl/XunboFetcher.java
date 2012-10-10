package in.datashow.sover.fetch.fetcher.impl;

import in.datashow.sover.fetch.Fetcher;
import in.datashow.sover.orm.job.CheckJob;
import in.datashow.sover.orm.job.CheckJobResult;
import in.datashow.sover.orm.job.ExploreJob;
import in.datashow.sover.orm.job.ExploreJobResult;
import in.datashow.sover.orm.job.FetchTeleplayJob;
import in.datashow.sover.orm.job.FetchTeleplayJobResult;

import org.springframework.stereotype.Component;

/**
 * xunbo.cc 网站视频抓取逻辑
 * 
 * @author yangyan
 * 
 */
@Component("xunbo.cc")
public class XunboFetcher implements Fetcher {
	@Override
	public ExploreJobResult explore(ExploreJob job) {

		String 电影 = "http://www.2tu.cc/GvodHtml/15.html";
		String 电视 = "http://www.2tu.cc/GvodHtml/16.html";
		String 动画片 = "http://www.2tu.cc/GvodHtml/17.html";
		String 综艺片 = "http://www.2tu.cc/GvodHtml/8.html";
		return null;
	}

	@Override
	public CheckJobResult check(CheckJob job) {
		return null;
	}

	@Override
	public FetchTeleplayJobResult fetch(FetchTeleplayJob job) {
		return null;
	}

}
