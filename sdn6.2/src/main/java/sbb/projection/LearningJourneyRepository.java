package sbb.projection;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LearningJourneyRepository extends Neo4jRepository<LearningJourney, String> {
    @Query(""
            + "MATCH (lj:LearningJourney)-[l:DE]-(lang:LearningJourneyLanguage)-[c:CONTAINS]-(records) "
            + "MATCH (lj)-[cr:CREATED_BY]-(user:LearningJourneyUser) "
            + "RETURN lj, l, lang.title as title, cr, user, collect(c), collect(records) as knowledgeRecords")
    List<GermanLearningJourney> getGermanLearningJourney();
}
