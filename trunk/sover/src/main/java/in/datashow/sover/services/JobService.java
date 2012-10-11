package in.datashow.sover.services;

import in.datashow.sover.fetch.Fetcher;
import in.datashow.sover.orm.job.ExploreJobResult;

/**
 * 
 * 任务相关的业务逻辑
 * 
 * @author YY
 * 
 */
public interface JobService {
	/**
	 * 检查探测结果，并丰富资源库
	 * 
	 * @param result
	 * @param source
	 */
	public void checkExploreJobResultAndDeplyUpdateJobs(
			ExploreJobResult result, Class<Fetcher> fetcherClass);
}
