package sbb.projection;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LearningJourneyUserRepository extends Neo4jRepository<LearningJourneyUser, String> {
}
