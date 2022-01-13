package sbb.relationships;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RelationshipsService {
    static Logger logger = LoggerFactory.getLogger(RelationshipsService.class);

    private final CommunityRepository communityRepository;
    private final UserRepository userRepository;

    public RelationshipsService(CommunityRepository communityRepository, UserRepository userRepository) {
        this.communityRepository = communityRepository;
        this.userRepository = userRepository;
    }

    public void process() {
        // Build the graph
        User jon = User.builder().firstName("Jon").lastName("First").build();
        User eva = User.builder().firstName("Eva").lastName("Second").build();

        userRepository.save(jon);
        userRepository.save(eva);

        Community frontendCommunity = Community.builder()
                .name("FrontEnd")
                .creator(jon)
                .editors(List.of(jon))
                .members(List.of(jon, eva))
                .build();

        Community backendCommunity = Community.builder()
                .name("BackendEnd")
                .creator(jon)
                .editors(List.of(eva))
                .members(List.of(jon, eva))
                .build();

        communityRepository.save(frontendCommunity);
        communityRepository.save(backendCommunity);

        // fetch eva
        Optional<User> fetchedUser = userRepository.findById(eva.getId());
        logger.info("User fetched with depth 1. Inspect with debugger");
    }
}
