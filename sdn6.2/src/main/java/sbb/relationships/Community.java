package sbb.relationships;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import sbb.common.BaseDomainObject;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.data.neo4j.core.schema.Relationship.Direction.INCOMING;

@Node
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
    @Relationship(type = "IS_MEMBER_OF", direction = INCOMING)
    private List<User> members = new ArrayList<>();

    @Getter
    @Setter
    @Relationship(type = "IS_EDITOR_OF", direction = INCOMING)
    private List<User> editors = new ArrayList<>();
}
