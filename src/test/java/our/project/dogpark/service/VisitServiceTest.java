package our.project.dogpark.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import our.project.dogpark.model.dog.Breed;
import our.project.dogpark.model.dog.Dog;
import our.project.dogpark.model.owner.Owner;
import our.project.dogpark.model.playground.Playground;
import our.project.dogpark.model.playground.Visit;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class VisitServiceTest {
    VisitService visitService = new VisitService();
    Owner owner1 = new Owner("Vahe","v1");
    Owner owner2 = new Owner("Dave","d1");
    Owner owner3 = new Owner("Dora","d2");

    Dog dog1 = new Dog("Max", "1", Breed.BEAGLE, owner3);
    Dog dog2 = new Dog("Bella", "2", Breed.RETRIEVER, owner2);
    Dog dog3 = new Dog("Tom", "3", Breed.BULLDOG, owner1);

    Playground playground1 = new Playground("Spartakus", 50);
    Playground playground2 = new Playground("Suite", 20);


    Visit v1 = new Visit("v1", dog1, playground1, LocalDateTime.now());
    Visit v2 = new Visit("v2", dog2, playground2, LocalDateTime.now());
    Visit v3 = new Visit("v3", dog3, playground1, LocalDateTime.now());
    Visit v4 = new Visit("v3", dog1, playground1, LocalDateTime.now());
    @Test
    void testEmptyList() {
        Set<Visit> visits = new HashSet<>();
        Playground result = visitService.findMostUsedPlayground(visits);
        assertNull(result);
    }
    @Test
    void getAllUniqueVisits() {

            Set<Visit> visits = new HashSet<>();
            visits.add(v1);
            visits.add(v2);
            visits.add(v3);
            visits.add(v4);

            int result = visitService.getNumberOfDogsForPlayground(visits, playground1);
            Assertions.assertEquals(2,result);
        }

    @Test
    void countVisitForAGivenDay() {
    }

    @Test
    void findMostUsedPlayground() {
        Set<Visit> visits = new HashSet<>();

        visits.add(v1);
        visits.add(v2);
        visits.add(v3);

        Playground result = visitService.findMostUsedPlayground(visits);
        Assertions.assertEquals(playground2,result);

    }
}