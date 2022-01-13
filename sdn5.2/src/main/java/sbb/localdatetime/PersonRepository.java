package sbb.localdatetime;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
interface PersonRepository extends Neo4jRepository<Person, String> {
}
