package sbb.localdatetime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mapping.MappingException;
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
        Person eva = Person.builder()
                .firstName("Eva")
                .lastName("Pearson")
                .lastTimeUpdated(LocalDateTime.now())
                .build();

        personRepository.save(eva);
        logger.info("Person persisted. lastTimeUpdated field persisted with different precision. Inspect the graph");

        try {
            Person jon = personRepository.findByFirstName("Jon");
        } catch( MappingException exception) {
            // Detail
            logger.error("Failed with mapping error", exception);
        }
    }
}
