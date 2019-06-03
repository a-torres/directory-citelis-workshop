package mx.com.citelis.directory.config;

import mx.com.citelis.directory.model.Person;
import mx.com.citelis.directory.repository.PersonRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@EnableConfigurationProperties(DirectoryProperties.class)
public class DirectoryConfiguration {
    @Bean
    public ApplicationRunner init(PersonRepository personRepository) {
        return args -> {
            personRepository.saveAll(Arrays.asList(new Person("migue@citelis.com.mx", "Migue"),
                    new Person("george@citelis.com.mx", "El George"),
                    new Person("kints@citelis.com.mx", "El Kints")));
        };
    }
}
