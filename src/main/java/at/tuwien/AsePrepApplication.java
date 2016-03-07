package at.tuwien;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AsePrepApplication {

    private static final Logger LOG = LoggerFactory.getLogger(AsePrepApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AsePrepApplication.class, args);
    }
}
