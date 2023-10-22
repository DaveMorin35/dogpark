package our.project.dogpark.service;

import our.project.dogpark.model.dog.Dog;
import our.project.dogpark.model.playground.Playground;
import our.project.dogpark.model.playground.Visit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class VisitService {
    public int getAllUniqueVisits(Set<Visit> visits, Playground playground) {

        Set<Dog> dogs = new HashSet<>();
        for (Visit visit : visits) {
            if (visit.playground().equals(playground)) {
                Dog dog = visit.dog();
                dogs.add(dog);
            }

        }
        return dogs.size();
    }

    public int countVisitForAGivenDay(Set<Visit> visits, LocalDate givenDay) {
        Set<Dog> dogs = new HashSet<>();
        for (Visit visit : visits) {
            LocalDateTime timestamp = visit.localDateTime();
            LocalDate currentDay = timestamp.toLocalDate();
            if (currentDay.equals(givenDay)) {
                Dog dog = visit.dog();
                dogs.add(dog);
            }
        }
        return dogs.size();
    }


    public Playground findMostUsedPlayground(Set<Visit> visits) {


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
