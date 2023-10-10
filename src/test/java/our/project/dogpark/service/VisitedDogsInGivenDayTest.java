package our.project.dogpark.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import our.project.dogpark.model.Playground;
import our.project.dogpark.model.Visit;
import our.project.dogpark.model.dog.Breed;
import our.project.dogpark.model.dog.Dog;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class VisitedDogsInGivenDayTest {
    VisitedDogsInGivenDay visitedDogsInGivenDay = new VisitedDogsInGivenDay();

    @Test
    void countVisitedDogsInGivenDay() {
        Dog dog1 = new Dog("Max", "1", Breed.Beagle);
        Dog dog2 = new Dog("Bella", "2", Breed.Retriever);
        Dog dog3 = new Dog("Tom", "3", Breed.Bulldog);

        Playground playground1 = new Playground("Spartakus", 50);
        Playground playground2 = new Playground("Suite", 20);
        Playground playground3 = new Playground("Cat", 30);


        Visit v1 = new Visit("v1", dog1, playground1, LocalDateTime.now().minusDays(2));
        Visit v2 = new Visit("v2", dog2, playground2, LocalDateTime.now().plusDays(1));
        Visit v3 = new Visit("v3", dog2, playground1, LocalDateTime.now());
        Visit v4 = new Visit("v4", dog2, playground1, LocalDateTime.now());
        Visit v5 = new Visit("v5", dog2, playground2, LocalDateTime.now());

        Set<Visit> visits = new HashSet<>();
        visits.add(v1);
        visits.add(v2);
        visits.add(v3);
        visits.add(v4);
        visits.add(v5);

        int visitedDogsToday = visitedDogsInGivenDay.countVisitedDogsInGivenDay(visits, LocalDate.now());

        Assertions.assertEquals(1,visitedDogsToday);
    }
}