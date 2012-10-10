package in.datashow.sover.fetch;

/**
 * 任务执行结果
 * 
 * @author YY
 * 
 */
public abstract class JobResult {

	private String msg;
	private boolean success;
	private boolean timeout;

	public boolean isTimeout() {
		return timeout;
	}

	public void setTimeout(boolean timeout) {
		this.timeout = timeout;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public boolean isSuccess() {
		return success;
	}
}
