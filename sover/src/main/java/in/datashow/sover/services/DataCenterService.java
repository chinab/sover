package in.datashow.sover.services;

/**
 * 数据中心相关业务逻辑
 * 
 * @author yangyan
 * 
 */
public interface DataCenterService {
	/**
	 * 检查视频状态
	 * @param videoName
	 * @param catName
	 * @return
	 */
	public int checkStatus(String videoName, String catName);
}
