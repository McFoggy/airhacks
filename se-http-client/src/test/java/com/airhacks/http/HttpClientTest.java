/*
 */
package com.airhacks.http;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.time.Duration;
import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;

public class HttpClientTest {

    private HttpClient client;

    @Before
    public void init() {
        this.client = HttpClient.newHttpClient();
    }

    @Test
    public void get() throws IOException, InterruptedException {
        URI uri = URI.create("http://airhacks.com");
        HttpRequest getRequest = HttpRequest.newBuilder(uri).
                GET().
                timeout(Duration.ofMillis(500)).
                build();
        HttpResponse<String> response = this.client.send(getRequest,
                HttpResponse.BodyHandler.asString(Charset.defaultCharset()));
        String payload = response.body();
        System.out.println("payload = " + payload);
        assertThat(payload, containsString("java"));
    }
}
