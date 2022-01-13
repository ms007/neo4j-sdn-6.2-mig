package sbb.projection;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import sbb.common.BaseDomainObject;

@Node
@NoArgsConstructor
@SuperBuilder
public class LearningJourney extends BaseDomainObject {
    @Getter
    @Setter
    @Relationship(type = "DE")
    private LearningJourneyLanguage german;

    @Getter
    @Setter
    @Relationship(type = "FR")
    private LearningJourneyLanguage french;

    @Getter
    @Setter
    @Relationship(type = "CREATED_BY")
    private LearningJourneyUser creator;
}
