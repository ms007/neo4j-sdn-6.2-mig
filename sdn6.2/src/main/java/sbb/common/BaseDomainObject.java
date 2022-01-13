package sbb.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

@SuperBuilder
@NoArgsConstructor
public abstract class BaseDomainObject {
    @Id
    @GeneratedValue(generatorClass = UUIDStringGenerator.class)
    @Getter
    private String id;
}