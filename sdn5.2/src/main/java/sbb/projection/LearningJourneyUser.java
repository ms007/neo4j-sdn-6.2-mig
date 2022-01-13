package sbb.projection;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.neo4j.ogm.annotation.NodeEntity;
import sbb.common.BaseDomainObject;

@NodeEntity
@SuperBuilder
@NoArgsConstructor
public class LearningJourneyUser extends BaseDomainObject {
    @Getter
    @Setter
    private String firstName;

    @Getter
    @Setter
    private String lastName;
}
