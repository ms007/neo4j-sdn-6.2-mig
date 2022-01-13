package sbb.projection;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import sbb.common.BaseDomainObject;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

@NodeEntity
@NoArgsConstructor
@SuperBuilder
public class LearningJourneyLanguage extends BaseDomainObject {
    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    @Builder.Default
    @Relationship(type = "CONTAINS")
    private Set<LearningJourneyKnowledgeRecord> knowledgeRecords = new TreeSet<>(Comparator.comparing(LearningJourneyKnowledgeRecord::hashCode));
}
