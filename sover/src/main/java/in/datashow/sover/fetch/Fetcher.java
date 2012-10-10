package in.datashow.sover.fetch;

import in.datashow.sover.orm.job.CheckJob;
import in.datashow.sover.orm.job.CheckJobResult;
import in.datashow.sover.orm.job.ExploreJob;
import in.datashow.sover.orm.job.ExploreJobResult;
import in.datashow.sover.orm.job.FetchTeleplayJob;
import in.datashow.sover.orm.job.FetchTeleplayJobResult;

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
	 * 抓内容
	 * 
	 * @param job
	 */
	public FetchTeleplayJobResult fetch(FetchTeleplayJob job);
}
