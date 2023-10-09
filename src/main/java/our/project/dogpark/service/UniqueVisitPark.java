package our.project.dogpark.service;


import our.project.dogpark.model.Visit;
import our.project.dogpark.model.dog.Dog;

import java.util.HashSet;
import java.util.Set;

public class UniqueVisitPark {
    public int countUniqueVisit(Set<Visit> visits) {

        Set<Dog> dogs = new HashSet<>();
        for (Visit visit : visits) {
            Dog dog = visit.getDog();
            dogs.add(dog);
        }
        return dogs.size();
    }
}
