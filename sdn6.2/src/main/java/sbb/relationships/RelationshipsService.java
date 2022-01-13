package sbb.relationships;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RelationshipsService {
    static Logger logger = LoggerFactory.getLogger(RelationshipsService.class);

    private final UserRepository userRepository;

    public RelationshipsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void process() {
        // Start project Neo4jFiveTwo to build the sample graph

        // fetch eva
        Optional<User> fetchedUser = userRepository.findByFirstName("Eva");
        logger.info("User fetched with depth infinite. Inspect with debugger");
    }
}
