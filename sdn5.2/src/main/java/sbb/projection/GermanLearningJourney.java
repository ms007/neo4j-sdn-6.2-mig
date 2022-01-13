package sbb.projection;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.neo4j.annotation.QueryResult;

import java.util.HashSet;
import java.util.Set;

@Data
@SuperBuilder
@NoArgsConstructor
@QueryResult
public class GermanLearningJourney {
    String id;

    String title;

    LearningJourneyUser user;

    @Builder.Default
    private Set<LearningJourneyKnowledgeRecord> knowledgeRecords = new HashSet<>();
}
