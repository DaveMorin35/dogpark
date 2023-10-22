package our.project.dogpark.service;


import our.project.dogpark.model.Playground;
import our.project.dogpark.model.Visit;
import our.project.dogpark.model.dog.Dog;

import java.util.HashSet;
import java.util.Set;

public class UniqueVisitCounter {
    public int countUniqueVisit(Set<Visit> visits, Playground playground) {

        Set<Dog> dogs = new HashSet<>();
        for (Visit visit : visits) {
            if (visit.getPlayground().equals(playground)) {
                Dog dog = visit.getDog();
                dogs.add(dog);
            }

        }
        return dogs.size();
    }
}
