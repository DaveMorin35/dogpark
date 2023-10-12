package our.project.dogpark.service;

import our.project.dogpark.model.playground.Playground;
import our.project.dogpark.model.playground.Visit;
import our.project.dogpark.model.dog.Dog;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueVisits {
    public Set<Dog> getAllUniqueVisits(Set<Visit> visits) {

        Set<Dog> dogs = new HashSet<>();
        visits.stream().forEach(visit -> {
            Dog dog = visit.dog();
            dogs.add(dog);
            System.out.println("Here is the list of all the dogs who ever visited the play park: " + dog);
        });

        return dogs;
    }

    public Playground findFamousPlayground(Set<Visit> visits) {


        Map<Playground, Long> countByPlaygroundName = new HashMap<>();
        for (Visit visit : visits) {
            Playground playground = visit.playground();
            countByPlaygroundName.put(playground, countByPlaygroundName.getOrDefault(playground, 0l) + 1);
        }

        Playground maxPlayground = null;
        long maxValue = 0;
        for (Map.Entry<Playground, Long> pair : countByPlaygroundName.entrySet()) {
            if (pair.getValue() > maxValue) {
                maxValue = pair.getValue();
                maxPlayground = pair.getKey();
            }
        }
        return maxPlayground;
    }
}
