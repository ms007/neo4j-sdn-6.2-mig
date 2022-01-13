package sbb.relationships;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface UserRepository extends Neo4jRepository<User, String> {
    Optional<User> findByFirstName(String firstName);
}
