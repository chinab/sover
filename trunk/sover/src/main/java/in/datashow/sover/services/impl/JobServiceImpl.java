package in.datashow.sover.services.impl;

import in.datashow.sover.commons.VideoMd5;
import in.datashow.sover.fetch.Fetcher;
import in.datashow.sover.orm.job.ExploreJobResult;
import in.datashow.sover.orm.job.ExploreJobResult.ExploreResult;
import in.datashow.sover.services.DataCenterService;
import in.datashow.sover.services.JobService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author yangyan
 * 
 */
@Service
public class JobServiceImpl implements JobService {

	final Log log = LogFactory.getLog(JobServiceImpl.class);

	private DataCenterService dataCenterService;

	@Autowired
	public void setDataCenterService(DataCenterService dataCenterService) {
		this.dataCenterService = dataCenterService;
	}

	@Override
	public void checkExploreJobResultAndDeplyUpdateJobs(
			ExploreJobResult result, Class<Fetcher> fetcherClass) {

		if (!result.isSuccess()) {
			log.warn(fetcherClass.getName() + "|探测任务|失败|" + result.getMsg());
			return;
		}
		// 类型 名称
		for (ExploreResult v : result.getVideos()) {
			this.dataCenterService
					.checkStatus(v.getVideoName(), v.getCatName());
			String md5 = VideoMd5.md5(v.getVideoName(), v.getCatName());
		}
	}
}
