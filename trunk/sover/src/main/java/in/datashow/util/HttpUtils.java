package in.datashow.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import org.apache.commons.io.IOUtils;

/**
 * HTTP 工具类 - without HttpClient
 * <p>
 * <a href="http://www.datashow.in">DAtAsHow</a>
 * </p>
 * 
 * @author yangyan
 * 
 */
public class HttpUtils {

	private String DEFAULT_USERAGENT = "Mozilla/5.0 (Windows NT 5.1) AppleWebKit/537.4 (KHTML, like Gecko) Chrome/22.0.1229.79 Safari/537.4";
	private int DEFAULT_READ_TIMEOUT = 20000;
	private int DEFAULT_CONNECT_TIMEOUT = 10000;

	/**
	 * 发出GET请求,不关闭连接
	 * 
	 * @param url
	 * @param referer
	 * @param host
	 * @param cookies
	 * @param charset
	 * @return
	 */
	private HttpURLConnection executeGet(String url, String referer,
			String host, Map<String, String> cookies, String charset,
			int readTimeout, int connectTimeout) {
		HttpURLConnection conn = null;
		try {
			conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("GET");// 提交模式
			if (readTimeout < 1000) {
				conn.setReadTimeout(DEFAULT_READ_TIMEOUT);
			} else {
				conn.setReadTimeout(readTimeout);
			}

			if (connectTimeout < 1000) {
				conn.setConnectTimeout(DEFAULT_CONNECT_TIMEOUT);
			} else {
				conn.setConnectTimeout(connectTimeout);
			}

			conn.addRequestProperty("User-Agent", DEFAULT_USERAGENT);
			if (referer != null) {
				conn.addRequestProperty("Referer", referer);
			}
			if (host != null) {
				conn.addRequestProperty("Host", host);
			}
			conn.connect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * 发出POST请求,不关闭连接
	 * 
	 * @param url
	 * @param referer
	 * @param host
	 * @param cookies
	 * @param charset
	 * @param postData
	 * @return
	 */
	private HttpURLConnection executePost(String url, String referer,
			String host, Map<String, String> cookies, String charset,
			Map<String, Object> postData, int readTimeout, int connectTimeout) {
		HttpURLConnection conn = null;
		try {
			conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("POST");// 提交模式

			if (readTimeout < 1000) {
				conn.setReadTimeout(DEFAULT_READ_TIMEOUT);
			} else {
				conn.setReadTimeout(readTimeout);
			}

			if (connectTimeout < 1000) {
				conn.setConnectTimeout(DEFAULT_CONNECT_TIMEOUT);
			} else {
				conn.setConnectTimeout(connectTimeout);
			}
			conn.setReadTimeout(DEFAULT_READ_TIMEOUT);
			conn.setConnectTimeout(DEFAULT_CONNECT_TIMEOUT);
			conn.addRequestProperty("User-Agent", DEFAULT_USERAGENT);
			conn.connect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * POST请求，并获取文本后返回
	 * 
	 * @param url
	 * @param referer
	 * @param host
	 * @param cookies
	 * @param charset
	 * @param postData
	 * @return
	 */
	public String postText(String url, String referer, String host,
			Map<String, String> cookies, String charset,
			Map<String, Object> postData) {
		HttpURLConnection conn = null;
		try {
			conn = executePost(url, referer, host, cookies, charset, postData,
					0, 0);
			String s = parseText(conn.getInputStream(), charset);
			return s;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.disconnect();
			}
		}
		return null;

	}

	/**
	 * GET
	 * 
	 * @param url
	 * @param referer
	 * @param host
	 * @param cookies
	 * @param charset
	 * @return
	 */
	public String getText(String url, String referer, String host,
			Map<String, String> cookies, String charset) {
		HttpURLConnection conn = null;
		try {
			conn = executeGet(url, referer, host, cookies, charset, 0, 0);
			String s = parseText(conn.getInputStream(), charset);
			return s;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.disconnect();
			}
		}
		return null;
	}

	/**
	 * 下载文件
	 * 
	 * @param url
	 * @param referer
	 * @param host
	 * @param cookies
	 * @param output
	 * @return
	 */
	public boolean getFileSaveAs(String url, String referer, String host,
			Map<String, String> cookies, File output) {
		if (output.exists()) {
			throw new RuntimeException("文件已经存在，保存失败");
		}
		HttpURLConnection conn = null;
		try {
			getDataToOutputStream(url, referer, host, cookies,
					new FileOutputStream(output));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.disconnect();
			}
		}
		return output.exists();
	}

	public boolean getDataToOutputStream(String url, String referer,
			String host, Map<String, String> cookies, OutputStream output) {
		HttpURLConnection conn = null;
		try {
			conn = executeGet(url, referer, host, cookies, null, 0, 0);
			IOUtils.copy(conn.getInputStream(), output);
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.disconnect();
			}
		}
		return false;
	}

	/**
	 * 获取数据
	 * 
	 * @param url
	 * @param referer
	 * @param host
	 * @param cookies
	 * @return
	 */
	public byte[] getData(String url, String referer, String host,
			Map<String, String> cookies) {

		HttpURLConnection conn = null;
		try {
			conn = executeGet(url, referer, host, cookies, null, 0, 0);
			byte[] data = IOUtils.toByteArray(conn.getInputStream());
			return data;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.disconnect();
			}
		}
		return null;
	}

	/**
	 * 从response中获得文本
	 * 
	 * @param inputStream
	 * @param charset
	 * @return
	 */
	private String parseText(InputStream inputStream, String charset) {
		String s = null;
		try {
			s = IOUtils.toString(inputStream, charset);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return s;
	}

	class HttpResp {
		int code;
		String text;
		Map<String, String> cookies;
		Map<String, String> headers;
	}

	public static void main11(String[] args) {
		HttpUtils http = new HttpUtils();
		String url = "http://tu.4567.tv/20120425102918697.jpg";
		http.getFileSaveAs(url, url, "www.2tu.cc", null, new File(
				"d:\\temp\\1.jpg"));
	}

	public static void main22(String[] args) {
		HttpUtils http = new HttpUtils();

		String baseURL = "http://www.2tu.cc";
		String url = baseURL + "/play/play8910.html";
		http.executeGet(url, url, "www.2tu.cc", null, "GB2312", 0, 0);
	}

	public static void main(String[] args) {

		long s = System.currentTimeMillis();

		HttpUtils http = new HttpUtils();

		for (int i = 0; i < 100; i++) {
			String ss = http.getText("http://www.baidu.com",
					"http://www.baidu.com", "www.baidu.com", null, "GB2312");
		}

		long s2 = System.currentTimeMillis();
		System.out.println(s2 - s);
	}
}
