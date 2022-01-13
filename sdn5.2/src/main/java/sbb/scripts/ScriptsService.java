package sbb.scripts;

import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScriptsService {

    private final SessionFactory sessionFactory;

    @Autowired
    public ScriptsService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void purgeDatabase() {
        Session session = sessionFactory.openSession();
        session.purgeDatabase();
    }
}
