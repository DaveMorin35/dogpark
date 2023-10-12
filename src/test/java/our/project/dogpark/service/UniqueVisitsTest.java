package our.project.dogpark.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import our.project.dogpark.model.dog.Breed;
import our.project.dogpark.model.dog.Dog;
import our.project.dogpark.model.owner.Owner;
import our.project.dogpark.model.playground.Playground;
import our.project.dogpark.model.playground.Visit;

import java.time.LocalDateTime;
import java.util.*;

class UniqueVisitsTest {
    UniqueVisits uniqueVisits = new UniqueVisits();


    @Test
    void getAllUniqueVisits() {
    }

     @Test
     void testEmptyList() {


         Set<Visit> visits = new HashSet<>();


         Playground result = uniqueVisits.findFamousPlayground(visits);

         String expected = null;

         Assertions.assertEquals(expected, result);

     }
    @Test
    void findFamousPlayground() {

        Set<Visit> visits = new HashSet<>();

        Playground playground1 = new Playground("Spartakus", 50);
        Playground playground2 = new Playground("Suite", 20);
        Playground playground3 = new Playground("Cat", 30);

        Dog dog1 = new Dog("Max", "1", Breed.RETRIEVER, new Owner("Dora", "d13"));
        Dog dog2 = new Dog("Sissy", "1", Breed.BULLDOG, new Owner("Lily", "l15"));
        Dog dog3 = new Dog("Danny", "1", Breed.BEAGLE, new Owner("Amy", "a9"));

        Visit v1 = new Visit("v1", dog1, playground1, LocalDateTime.now());
        Visit v2 = new Visit("v2", dog2, playground2, LocalDateTime.now());
        Visit v3 = new Visit("v3", dog3, playground2, LocalDateTime.now());

        visits.add(v1);
        visits.add(v2);
        visits.add(v3);

        Playground expected = playground2;

        Playground result = uniqueVisits.findFamousPlayground(visits);

        Assertions.assertEquals(expected,result);

    }

}