package sbb.projection;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LearningJourneyRepository extends Neo4jRepository<LearningJourney, String> {
    @Query(""
            + "MATCH (lj:LearningJourney)-[l:DE]-(lang:LearningJourneyLanguage)-[c:CONTAINS]-(records) "
            + "MATCH (lj)-[cr:CREATED_BY]-(user:LearningJourneyUser) "
            + "WHERE lj.id = $id "
            + "RETURN lj.id AS id, l, lang.title as title, cr, user, collect(c), collect(records) as knowledgeRecords")
    GermanLearningJourney getGermanLearningJourney(String id);
}
