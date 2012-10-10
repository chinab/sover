package in.datashow.sover.fetch;

import in.datashow.sover.orm.job.CheckJob;
import in.datashow.sover.orm.job.CheckJobResult;
import in.datashow.sover.orm.job.ExploreJob;
import in.datashow.sover.orm.job.ExploreJobResult;
import in.datashow.sover.orm.job.FetchTeleplayJob;
import in.datashow.sover.orm.job.FetchTeleplayJobResult;
import in.datashow.sover.orm.job.FetchVideoJob;
import in.datashow.sover.orm.job.FetchVideoJobResult;

/**
 * 爬虫接口
 * 
 * @author YY
 * 
 */
public interface Fetcher {
	/**
	 * 探测
	 * 
	 * @param job
	 */
	public ExploreJobResult explore(ExploreJob job);

	/**
	 * 检查更新
	 * 
	 * @param job
	 */
	public CheckJobResult check(CheckJob job);

	/**
	 * 抓视频
	 * @param job
	 * @return
	 */
	public FetchVideoJobResult fetch(FetchVideoJob job);
	
	
	/**
	 * 抓剧集
	 * 
	 * @param job
	 */
	public FetchTeleplayJobResult fetch(FetchTeleplayJob job);
}
