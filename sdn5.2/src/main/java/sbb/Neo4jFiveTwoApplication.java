package sbb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sbb.relationships.RelationshipsService;
import sbb.scripts.ScriptsService;

@SpringBootApplication
public class Neo4jFiveTwoApplication implements CommandLineRunner {

    static Logger logger = LoggerFactory.getLogger(Neo4jFiveTwoApplication.class);

    private final ScriptsService scriptsService;
    private final RelationshipsService relationshipService;

    @Autowired
    public Neo4jFiveTwoApplication(ScriptsService scriptsService, RelationshipsService relationshipService) {
        this.scriptsService = scriptsService;
        this.relationshipService = relationshipService;
    }

    public static void main(String[] args) {
        logger.info("Starting version 5.2...");
        SpringApplication.run(Neo4jFiveTwoApplication.class, args);
        logger.info("Finished...");
    }

    @Override
    public void run(String... args) {
        logger.info("purge database...");
        scriptsService.purgeDatabase();

        logger.info("relationship issue...");
        relationshipService.process();
    }
}
