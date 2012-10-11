package in.datashow.sover;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.ning.http.client.AsyncCompletionHandler;
import com.ning.http.client.AsyncHttpClient;
import com.ning.http.client.ListenableFuture;
import com.ning.http.client.Response;

/**
 * AsyncHttpClient 使用测试
 * <p>
 * datashow.in
 * </p>
 * 
 * @author yangyan
 * 
 */
public class HttpTest {

	public static long a = 0;
	public static int b = 100;
	public static int c = 0;

	public static void main(String[] args) {

		AsyncHttpClient client = new AsyncHttpClient();

		final long s = System.currentTimeMillis();

		List<ListenableFuture<String>> list = new ArrayList<ListenableFuture<String>>();
		try {
			for (int i = 0; i < b; i++) {
				final ListenableFuture<String> f = client.prepareGet(
						"http://www.oschina.net").execute(
						new AsyncCompletionHandler<String>() {
							@Override
							public String onCompleted(Response response)
									throws Exception {
								String content = response.getResponseBody();
								FileUtils.writeStringToFile(new File(
										"d:\\temp\\" + c++ + "_oschina.html"),
										content);
								// System.out.println(content);
								a = System.currentTimeMillis() - s;
								b--;
								return content;
							}

						});

				list.add(f);
				// System.out.println(a);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		while (true) {
			try {
				Thread.sleep(3000);

				if (b <= 0) {
					System.out.println(b);
					System.out.println("100 此连接及下载用时：" + a + "ms");
					break;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
