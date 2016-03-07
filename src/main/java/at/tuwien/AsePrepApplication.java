package at.tuwien;

import at.tuwien.domain.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication
public class AsePrepApplication implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(AsePrepApplication.class);

    @Value("${spring.apiUrl}")
    private String apiUrl;

    public static void main(String[] args) {
        SpringApplication.run(AsePrepApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info(apiUrl);
        RestTemplate restTemplate = new RestTemplate();
        // it is possible to use String.class here to just read the plain JSON output
        // checkout response wrappers for nested objects
        // Link: http://www.baeldung.com/rest-template
        // Authentication: http://stackoverflow.com/questions/21920268/basic-authentication-for-rest-api-using-spring-resttemplate

        // Auth: 	public TestRestTemplate(String username, String password,
        //http://stackoverflow.com/questions/10358345/making-authenticated-post-requests-with-spring-resttemplate-for-android
        Quote quote = restTemplate.getForObject(apiUrl, Quote.class);
        LOG.info(quote.toString());

        //access to headers

        //http://stackoverflow.com/questions/19238715/how-to-set-an-accept-header-on-spring-resttemplate-request
        //http://stackoverflow.com/questions/16781680/http-get-with-headers-using-resttemplate
        //http://stackoverflow.com/questions/6005709/how-do-i-read-the-response-header-from-resttemplate


        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        ResponseEntity<String> result = restTemplate.exchange(apiUrl, HttpMethod.GET, entity, String.class);
        LOG.info(result.getHeaders().toString());
        LOG.info("asdf");
        LOG.info(result.getStatusCode().toString());
//        LOG.info(result.getBody());
    }
}
