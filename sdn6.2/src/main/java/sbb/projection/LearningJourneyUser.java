package sbb.projection;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.neo4j.core.schema.Node;
import sbb.common.BaseDomainObject;

@Node
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
