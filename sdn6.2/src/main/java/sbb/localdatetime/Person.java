package sbb.localdatetime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.neo4j.core.schema.Node;
import sbb.common.BaseDomainObject;

import java.time.LocalDateTime;

@Node
@SuperBuilder
@NoArgsConstructor
public class Person extends BaseDomainObject {

    @Getter
    @Setter
    private String firstName;

    @Getter
    @Setter
    private String lastName;

    @Getter
    @Setter
    private LocalDateTime lastTimeUpdated;
}
