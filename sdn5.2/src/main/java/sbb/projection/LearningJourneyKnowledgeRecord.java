package sbb.projection;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import sbb.common.BaseDomainObject;

@NodeEntity
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
    @Property
    @EqualsAndHashCode.Include
    private LearningJourneyKnowledgeRecordType type;
}
