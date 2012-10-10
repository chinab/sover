package in.datashow.sover.orm.job;

import in.datashow.sover.fetch.JobResult;
import in.datashow.sover.orm.Video;

public class FetchVideoJobResult extends JobResult {
	private Video video;

	public Video getVideo() {
		return video;
	}
}
