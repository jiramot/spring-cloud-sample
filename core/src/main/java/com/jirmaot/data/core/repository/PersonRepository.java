package com.jirmaot.data.core.repository;

import com.jirmaot.data.core.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PersonRepository extends CrudRepository<Person, Long> {
}