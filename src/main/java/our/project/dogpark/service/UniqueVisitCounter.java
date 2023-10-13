package our.project.dogpark.service;


import our.project.dogpark.model.Playground;
import our.project.dogpark.model.Visit;
import our.project.dogpark.model.dog.Dog;

import java.util.HashSet;
import java.util.Set;

public class UniqueVisitCounter {
    public long countUniqueVisit(Set<Visit> visits, Playground playground) {
        Set<Dog> dogs = new HashSet<>();
        return visits.stream()
                .filter(visit -> visit.getPlayground().equals(playground))
                .map(Visit::getDog)
                .distinct()
                .count();

    }
}
