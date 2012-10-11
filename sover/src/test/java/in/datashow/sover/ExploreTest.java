package in.datashow.sover;

import in.datashow.sover.orm.job.ExploreJobResult;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutionException;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.ning.http.client.AsyncCompletionHandler;
import com.ning.http.client.AsyncHttpClient;
import com.ning.http.client.AsyncHttpClientConfig;
import com.ning.http.client.ListenableFuture;
import com.ning.http.client.Response;

public class ExploreTest {

	public static String ua = "Mozilla/5.0 (Windows NT 5.1) AppleWebKit/537.4 (KHTML, like Gecko) Chrome/22.0.1229.79 Safari/537.4";

	public static void main(String[] args) {

		AsyncHttpClientConfig config = new AsyncHttpClientConfig.Builder()
				.setUserAgent(ua).setMaxRequestRetry(5)
				.setCompressionEnabled(true).build();

		AsyncHttpClient client = new AsyncHttpClient(config);

		String testPage = "http://www.2tu.cc/GvodHtml/15.html";

		String a = null;
		try {
			ListenableFuture<String> execute = client.prepareGet(testPage)
					.execute(new AsyncCompletionHandler<String>() {
						@Override
						public String onCompleted(Response arg0)
								throws Exception {
							return arg0.getResponseBody("gb2312");
						}
					});
			a = execute.get();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Document doc = null;
		// System.out.println(a);
		if (a != null) {
			doc = Jsoup.parse(a);
		}

		if (doc == null) {
			return;
		}

		Elements elements = doc.select(".cb dl");

		ExploreJobResult result = new ExploreJobResult();

		if (elements != null && elements.size() > 0) {
			// System.out.println(elements);

			result.setSuccess(true);
			java.util.List<ExploreJobResult.ExploreResult> videos = new ArrayList<ExploreJobResult.ExploreResult>();
			result.setVideos(videos);
			Iterator<Element> ele = elements.iterator();

			while (ele.hasNext()) {
				Element e = ele.next();
				Element tmp1 = e.select("h3").first();
				Element tmp1_a = tmp1.child(0);
				String pageUrl = tmp1_a.attr("href");
				String name = tmp1_a.text();
				int year = Integer.valueOf(tmp1.textNodes().get(0).text()
						.trim());

				Element tmp2 = e.select("ul").first();

				String[] actors = tmp2.child(0).text().replaceFirst("主演：", "")
						.split(",");

				String catName = tmp2.child(2).text().replaceFirst("类型：", "")
						.trim();
				String area = tmp2.child(3).text().replaceFirst("地区：", "")
						.trim();
				String imgUrl = e.select("img").first().attr("src");

				// System.out.println("----" + name + "----");
				// System.out.println(year);
				// System.out.println(pageUrl);
				// System.out.println(Arrays.toString(actors));

				ExploreJobResult.ExploreResult r = new ExploreJobResult.ExploreResult();

				Set<String> set = new HashSet<String>();
				Collections.addAll(set, actors);
				r.setActors(set);
				r.setAreaName(area);
				r.setCatName(catName);

				// /Html/GP5266.html
				r.setNativeId(pageUrl.replaceAll("[^\\d]", ""));
				r.setYear(year);
				r.setPicUrl(imgUrl);
				r.setUrl("http://www.2tu.cc" + pageUrl);
				r.setVideoName(name);

				System.out.println(ToStringBuilder.reflectionToString(r));
				videos.add(r);
			}

		}
	}
}
