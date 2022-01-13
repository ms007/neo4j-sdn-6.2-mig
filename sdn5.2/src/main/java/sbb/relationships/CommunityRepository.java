package sbb.relationships;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CommunityRepository extends Neo4jRepository<Community, String> {
}

