package sbb.localdatetime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class LocalDateTimeService {
    static Logger logger = LoggerFactory.getLogger(LocalDateTimeService.class);

    private final PersonRepository personRepository;

    public LocalDateTimeService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void process() {
        Person jon = Person.builder()
                .firstName("Jon")
                .lastName("Doe")
                .lastTimeUpdated(LocalDateTime.now())
                .build();

        personRepository.save(jon);

        logger.info("Person persisted. lastTimeUpdated field persisted with different precision. Inspect the graph");
    }
}
