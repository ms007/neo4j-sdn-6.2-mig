package sbb.projection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ProjectionService {
    static Logger logger = LoggerFactory.getLogger(ProjectionService.class);

    private final LearningJourneyRepository learningJourneyRepository;
    private final LearningJourneyUserRepository userRepository;

    public ProjectionService(LearningJourneyRepository learningJourneyRepository, LearningJourneyUserRepository userRepository) {
        this.learningJourneyRepository = learningJourneyRepository;
        this.userRepository = userRepository;
    }

    public void process() {
        String id = createLearningJourney();

        GermanLearningJourney learningJourney = getGermanLearningJourney(id);
        logger.info("Learning journey projection loaded");
    }

    private GermanLearningJourney getGermanLearningJourney(String id) {
        return learningJourneyRepository.getGermanLearningJourney(id);
    }

    private String createLearningJourney() {
        LearningJourneyUser user = LearningJourneyUser.builder()
                .firstName("Jon")
                .lastName("Doe")
                .build();

        userRepository.save(user);

        LearningJourneyKnowledgeRecord germanTextField = LearningJourneyKnowledgeRecord.builder()
                .order(1)
                .content("<div>german content</div>")
                .type(LearningJourneyKnowledgeRecordType.TEXT)
                .build();

        LearningJourneyKnowledgeRecord frenchTextField = LearningJourneyKnowledgeRecord.builder()
                .order(1)
                .content("<div>french content</div>")
                .type(LearningJourneyKnowledgeRecordType.TEXT)
                .build();

        LearningJourneyKnowledgeRecord imageField = LearningJourneyKnowledgeRecord.builder()
                .order(1)
                .content("<img src='test' />")
                .type(LearningJourneyKnowledgeRecordType.IMAGE)
                .build();

        LearningJourneyLanguage german = LearningJourneyLanguage.builder()
                .title("Learn something new DE")
                .knowledgeRecords(Set.of(germanTextField, imageField))
                .build();

        LearningJourneyLanguage french = LearningJourneyLanguage.builder()
                .title("Learn something new FR")
                .knowledgeRecords(Set.of(frenchTextField))
                .build();

        LearningJourney learningJourney = LearningJourney.builder()
                .creator(user)
                .german(german)
                .french(french)
                .build();

        learningJourneyRepository.save(learningJourney);
        logger.info("Learning journey persisted");
        return learningJourney.getId();
    }
}
