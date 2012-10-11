package in.datashow.sover.commons;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Sover video md5
 * 
 * @author yangyan
 * 
 */
public class VideoMd5 {
	public static String md5(String videoName, String catName) {
		if (videoName == null || videoName.trim().length() < 1) {
			return null;
		}
		if (catName == null || "".equals(catName.trim())) {
			catName = "";
		}
		return DigestUtils.md5Hex(videoName.trim().concat(catName.trim()));
	}
}
