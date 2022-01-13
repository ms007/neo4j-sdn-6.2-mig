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
public class LearningJourneyKnowledgeRecord extends BaseDomainObject {
    @Setter
    @Getter
    private String content;

    @Getter
    @Setter
    private Integer order;

    @Getter
    @Setter
    private LearningJourneyKnowledgeRecordType type;
}
