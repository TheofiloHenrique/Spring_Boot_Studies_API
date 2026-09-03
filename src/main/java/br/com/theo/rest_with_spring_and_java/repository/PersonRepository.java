package br.com.theo.rest_with_spring_and_java.repository;

import br.com.theo.rest_with_spring_and_java.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}
