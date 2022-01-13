package sbb.projection;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import sbb.common.BaseDomainObject;

@NodeEntity
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
