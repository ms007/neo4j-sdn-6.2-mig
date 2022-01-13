package sbb.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;

@SuperBuilder
@NoArgsConstructor
public abstract class BaseDomainObject {
    @Id
    @GeneratedValue(strategy = StringUuidStrategy.class)
    @Getter
    private String id;

    @Id
    @GeneratedValue
    @Getter
    private Long internalId;
}