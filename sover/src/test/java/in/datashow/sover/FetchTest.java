package in.datashow.sover;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.apache.commons.io.IOUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class FetchTest {

	public static void main(String[] args) {

		String a = null;
		String baseURL = "http://www.2tu.cc";
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("javascript");
		String url = baseURL + "/play/play8910.html";
		try {
			Document doc = Jsoup.connect(url).get();
			Element dataJS = doc.select(".playerbox").select("script[src^=/playdata/]").first();
			String dataJSSrc = dataJS.attr("src");
			// System.out.println(dataJSSrc);

			URLConnection conn = new URL(baseURL + dataJSSrc).openConnection();
			conn.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 5.1) AppleWebKit/537.4 (KHTML, like Gecko) Chrome/22.0.1229.79 Safari/537.4");
			conn.setReadTimeout(5000);
			String s = IOUtils.toString(conn.getInputStream(), "utf-8");
			System.out.println(conn.getContentType()); // application/x-javascript
			s = s.substring(s.indexOf("VideoInfoList=") + "VideoInfoList=".length(), s.indexOf("var urlinfo"));
			// System.out.println(s);

			Object object = engine.eval(s);
			a = String.valueOf(object);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ScriptException e) {
			e.printStackTrace();
		}

		a = a.replaceAll("gvod\\$\\$\\$", "").replaceAll("gvod#", "").replaceAll("bdhd#", "");

		int xunbo_start = a.indexOf("迅播高清$$") + "迅播高清$$".length();
		int bd_start = a.indexOf("百度影音$$") + "百度影音$$".length();
		// System.out.println(xunbo_start + "    " + bd_start);

		String qvod = a.substring(xunbo_start, a.lastIndexOf("百度影音$$") - 1);
		String bd = a.substring(bd_start, a.lastIndexOf("$bdhd"));

		// System.out.println(qvod);
		// System.out.println(bd);

		System.out.println("QVOD 资源： ");
		String b[] = qvod.split("\\$");
		for (int i = 0; i < b.length; i = i + 2) {
			System.out.println(b[i] + ":" + b[i + 1]);
		}

		System.out.println("百度影音 资源：");
		String bdd[] = bd.split("\\$");
		for (int i = 0; i < bdd.length; i = i + 2) {
			System.out.println(bdd[i] + ":" + bdd[i + 1]);
		}
	}
}
