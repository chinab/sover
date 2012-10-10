package in.datashow.sover.sys;

/**
 * 配置
 * 
 * @author YY
 * 
 */
public class Settings {

	/**
	 * 默认设置
	 */
	public Settings() {

	}

	/* 数据备份设置 */
	private boolean autoBackup = true; // 自动备份开关
	private String autoBackupCron = "0 30 2 * * *"; // 自动备份时间
	private String autoBackupType = "today"; // 备份方式，备份当天:today,全部备份:full
	private String backupBaseDir = null; // 备份文件存储目录

	/* 爬虫设置 */
	private int maxRunningThread = 4; // 最大执行线程
	private int maxConnectTimeout = 3000; // 爬虫最大连接用时
	private int maxFetchTimeout = 5000; // 爬虫最大等待数据用时
	private boolean fetchPic = true; // 获取图片开关
	private String picBaseDir = null; // 图片保存目录

	/* 更新包通知设置 */
	private int interval = 1000 * 60 * 15; // 数据推送间隔时间
	private String[] url;

	public boolean isAutoBackup() {
		return autoBackup;
	}

	public void setAutoBackup(boolean autoBackup) {
		this.autoBackup = autoBackup;
	}

	public String getAutoBackupCron() {
		return autoBackupCron;
	}

	public void setAutoBackupCron(String autoBackupCron) {
		this.autoBackupCron = autoBackupCron;
	}

	public String getAutoBackupType() {
		return autoBackupType;
	}

	public void setAutoBackupType(String autoBackupType) {
		this.autoBackupType = autoBackupType;
	}

	public String getBackupBaseDir() {
		return backupBaseDir;
	}

	public void setBackupBaseDir(String backupBaseDir) {
		this.backupBaseDir = backupBaseDir;
	}

	public int getMaxRunningThread() {
		return maxRunningThread;
	}

	public void setMaxRunningThread(int maxRunningThread) {
		this.maxRunningThread = maxRunningThread;
	}

	public int getMaxConnectTimeout() {
		return maxConnectTimeout;
	}

	public void setMaxConnectTimeout(int maxConnectTimeout) {
		this.maxConnectTimeout = maxConnectTimeout;
	}

	public int getMaxFetchTimeout() {
		return maxFetchTimeout;
	}

	public void setMaxFetchTimeout(int maxFetchTimeout) {
		this.maxFetchTimeout = maxFetchTimeout;
	}

	public boolean isFetchPic() {
		return fetchPic;
	}

	public void setFetchPic(boolean fetchPic) {
		this.fetchPic = fetchPic;
	}

	public String getPicBaseDir() {
		return picBaseDir;
	}

	public void setPicBaseDir(String picBaseDir) {
		this.picBaseDir = picBaseDir;
	}

	public int getInterval() {
		return interval;
	}

	public void setInterval(int interval) {
		this.interval = interval;
	}

	public String[] getUrl() {
		return url;
	}

	public void setUrl(String[] url) {
		this.url = url;
	}

}
