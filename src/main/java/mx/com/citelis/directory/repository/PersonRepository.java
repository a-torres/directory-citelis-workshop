package mx.com.citelis.directory.repository;

import mx.com.citelis.directory.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, String> {
}
