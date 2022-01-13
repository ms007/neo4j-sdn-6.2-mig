package sbb.relationships;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import sbb.common.BaseDomainObject;

import java.util.ArrayList;
import java.util.List;

@NodeEntity
@SuperBuilder
@NoArgsConstructor
public class Community extends BaseDomainObject {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    @Relationship(type = "CREATED_BY")
    private User creator;

    @Getter
    @Setter
    @Relationship(type = "IS_MEMBER_OF", direction = "INCOMING")
    private List<User> members = new ArrayList<>();

    @Getter
    @Setter
    @Relationship(type = "IS_EDITOR_OF", direction = "INCOMING")
    private List<User> editors = new ArrayList<>();
}
