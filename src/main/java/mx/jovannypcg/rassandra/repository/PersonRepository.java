package mx.jovannypcg.rassandra.repository;

import mx.jovannypcg.rassandra.domain.Person;
import mx.jovannypcg.rassandra.domain.PersonKey;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface PersonRepository extends ReactiveCassandraRepository<Person, PersonKey> {
    Flux<Person> findByKeyFirstName(final String firstName);
    Mono<Person> findOneByKeyFirstName(final String firstName);
}
