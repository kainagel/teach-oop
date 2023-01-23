package yy_spring;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.io.entity.EntityUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

public class HttpRequestExample {

	private static final String resource = "https://www.regionalstatistik.de/genesisws/rest/2020/helloworld/whoami";

	public static void main(String[] args) throws IOException {

		// Default Java API
		URLConnection connection = new URL(resource).openConnection();
		try (InputStream inputStream = connection.getInputStream()) {
			String result = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
			System.out.println(result);
		}


		// Uses Apache httpclient5
		try (CloseableHttpClient client = HttpClients.createDefault()) {

			HttpGet get = new HttpGet(resource);
			// Uses a callback function to provide the results. This ensures all resources are closed properly
			String result = client.execute(get, response -> EntityUtils.toString(response.getEntity()));

			System.out.println(result);
		}
	}
}
