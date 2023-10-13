package our.project.dogpark.service;


import our.project.dogpark.model.Playground;
import our.project.dogpark.model.Visit;

import java.util.*;

public class FamousPlayground {
    public Optional<Playground> findFamousPlayground(Set<Visit> visits) {

        Map<Playground, Integer> countByPlaygroundName = new HashMap<>();

        List<Playground> playgrounds = visits
                .stream()
                .map(Visit::getPlayground)
                .toList();

        for (Playground playground : playgrounds) {
            countByPlaygroundName.put(playground, Collections.frequency(playgrounds, playground));
        }

        Optional<Map.Entry<Playground, Integer>> maxPlaygroundPaar = countByPlaygroundName
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue));

        return maxPlaygroundPaar.map(Map.Entry::getKey);
    }
}

