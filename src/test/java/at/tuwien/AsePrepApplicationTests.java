package at.tuwien;

import at.tuwien.domain.Quote;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AsePrepApplication.class)
@WebAppConfiguration
public class AsePrepApplicationTests {

    private static final Logger LOG = LoggerFactory.getLogger(AsePrepApplicationTests.class);

    @Value("${spring.apiUrl}")
    private String apiUrl;

//    @Test
//    public void testSuccessfulResponse() {
//        LOG.info(apiUrl);
//        RestTemplate restTemplate = new RestTemplate();
//        // it is possible to use String.class here to just read the plain JSON output
//        Quote quote = restTemplate.getForObject(apiUrl, Quote.class);
//        LOG.info(quote.toString());
//    }

//    RestTemplate template = new TestRestTemplate();
//
//    @Test
//    public void testRequest() throws Exception {
//        HttpHeaders headers = template.getForEntity(apiUrl, String.class).getHeaders();
//        System.out.println(headers.getLocation().toString());
//        assertThat(headers.getLocation().toString(), containsString("fooj"));
//    }
}
