package sbb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sbb.localdatetime.LocalDateTimeService;
import sbb.relationships.RelationshipsService;

@SpringBootApplication
public class Neo4jSixTwoApplication implements CommandLineRunner {
    static Logger logger = LoggerFactory.getLogger(Neo4jSixTwoApplication.class);

    private final RelationshipsService relationshipsService;
    private final LocalDateTimeService localDateTimeService;

    @Autowired
    public Neo4jSixTwoApplication(RelationshipsService relationshipsService, LocalDateTimeService localDateTimeService) {
        this.relationshipsService = relationshipsService;
        this.localDateTimeService = localDateTimeService;
    }

    public static void main(String[] args) {
        logger.info("Starting version 6.2...");
        SpringApplication.run(Neo4jSixTwoApplication.class, args);
        logger.info("Finished...");
    }

    @Override
    public void run(String... args) {
        /*
        logger.info("relationship issue...");
        relationshipsService.process();
        */

        logger.info("localDateTime issue...");
        localDateTimeService.process();
    }
}



