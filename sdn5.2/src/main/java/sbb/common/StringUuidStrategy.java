package sbb.common;

import org.neo4j.ogm.id.IdStrategy;

import java.util.UUID;

public final class StringUuidStrategy implements IdStrategy {

    @Override
    public Object generateId(Object entity) {
        return UUID.randomUUID().toString();
    }
}
