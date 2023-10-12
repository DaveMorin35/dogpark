package our.project.dogpark.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import our.project.dogpark.model.Playground;
import our.project.dogpark.model.Visit;
import our.project.dogpark.model.dog.Breed;
import our.project.dogpark.model.dog.Dog;
import our.project.dogpark.model.owner.Owner;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

class UniqueVisitCounterTest {
    UniqueVisitCounter uniqueVisitCounter = new UniqueVisitCounter();

    @Test
    void countUniqueVisit() {
        Owner owner1 = new Owner("Vahe","v1");
        Owner owner2 = new Owner("Dave","d1");
        Owner owner3 = new Owner("Dora","d2");

        Dog dog1 = new Dog("Max", "1", Breed.Beagle,owner3);
        Dog dog2 = new Dog("Bella", "2", Breed.Retriever,owner2);
        Dog dog3 = new Dog("Tom", "3", Breed.Bulldog,owner1);

        Playground playground1 = new Playground("Spartakus", 50);
        Playground playground2 = new Playground("Suite", 20);
        Playground playground3 = new Playground("Cat", 30);


        Visit v1 = new Visit("v1", dog1, playground1, LocalDateTime.now());
        Visit v2 = new Visit("v2", dog2, playground2, LocalDateTime.now());
        Visit v3 = new Visit("v3", dog3, playground1, LocalDateTime.now());
        Visit v4 = new Visit("v3", dog1, playground1, LocalDateTime.now());

        Set<Visit> visits = new HashSet<>();
        visits.add(v1);
        visits.add(v2);
        visits.add(v3);
        visits.add(v4);

        int uniqueDogsNumber = uniqueVisitCounter.countUniqueVisit(visits, playground1);

        Assertions.assertEquals(2,uniqueDogsNumber);
    }
}