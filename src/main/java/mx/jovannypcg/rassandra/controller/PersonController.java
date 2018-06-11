package mx.jovannypcg.rassandra.controller;

import mx.jovannypcg.rassandra.domain.Person;
import mx.jovannypcg.rassandra.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/people")
public class PersonController {
    private PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping
    public Flux<Person> getPeople() {
        return this.personRepository.findAll();
    }
}
