package at.tuwien;

import at.tuwien.domain.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AsePrepApplication implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(AsePrepApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AsePrepApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        LOG.info(quote.toString());
    }
}
