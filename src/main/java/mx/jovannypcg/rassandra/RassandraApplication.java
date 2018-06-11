package mx.jovannypcg.rassandra;

import mx.jovannypcg.rassandra.domain.Person;
import mx.jovannypcg.rassandra.domain.PersonKey;
import mx.jovannypcg.rassandra.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.cassandra.CassandraDataAutoConfiguration;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {CassandraDataAutoConfiguration.class})
public class RassandraApplication implements CommandLineRunner {

    private PersonRepository personRepository;

    public RassandraApplication(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(RassandraApplication.class, args);
    }

    @Override
    public void run(String... args) {
        final Person a = new Person(new PersonKey("Jovanny", LocalDateTime.now(), UUID.randomUUID()), "A", 1000);
        final Person b = new Person(new PersonKey("Moss", LocalDateTime.now(), UUID.randomUUID()), "B", 3250);
        final Person c = new Person(new PersonKey("Daniel", LocalDateTime.now(), UUID.randomUUID()), "C", 980);
        final Person d = new Person(new PersonKey("Ivan", LocalDateTime.now(), UUID.randomUUID()), "D", 5000);

        personRepository.insert(List.of(a, b, c, d)).subscribe();
    }
}
