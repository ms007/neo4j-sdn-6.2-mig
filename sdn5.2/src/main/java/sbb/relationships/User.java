package sbb.relationships;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import sbb.common.BaseDomainObject;

import java.util.HashSet;
import java.util.Set;

@SuperBuilder
@NoArgsConstructor
@NodeEntity
public class User extends BaseDomainObject {

    @Getter
    @Setter
    private String firstName;

    @Getter
    @Setter
    private String lastName;

    @Getter
    @Setter
    @Relationship(type = "IS_EDITOR_OF")
    private Set<Community> editorOfCommunities = new HashSet<>();

    @Getter
    @Setter
    @Relationship(type = "IS_MEMBER_OF")
    private Set<Community> memberOfCommunities = new HashSet<>();
}
