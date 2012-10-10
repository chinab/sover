package in.datashow.sover.fetch;

import org.springframework.stereotype.Component;

/**
 * 抓取任务
 */
@Component("jobTrigger")
public class JobTrigger {
	public void fetch() {
		System.out.println("抓取");
	}
}
