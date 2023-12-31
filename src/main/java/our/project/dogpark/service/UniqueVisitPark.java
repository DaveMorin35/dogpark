package our.project.dogpark.service;


import our.project.dogpark.model.Visit;
import our.project.dogpark.model.dog.Dog;

import java.util.HashSet;
import java.util.Set;

public class UniqueVisitPark {
    public int countUniqueVisit(Set<Visit> visits) {

        Set<Dog> dogs = new HashSet<>();

        visits.stream()
                .map(Visit::getDog)
                .forEach(dogs::add);

        return dogs.size();
    }
}

