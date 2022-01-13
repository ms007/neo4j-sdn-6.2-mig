package sbb.projection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectionService {
    static Logger logger = LoggerFactory.getLogger(ProjectionService.class);

    private final LearningJourneyRepository learningJourneyRepository;

    public ProjectionService(LearningJourneyRepository learningJourneyRepository) {
        this.learningJourneyRepository = learningJourneyRepository;
    }

    public void process() {
        List<GermanLearningJourney> learningJourneys = learningJourneyRepository.getGermanLearningJourney();
        logger.info("All german learning journeys loaded");
    }
}
