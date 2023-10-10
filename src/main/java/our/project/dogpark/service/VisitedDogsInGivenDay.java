package our.project.dogpark.service;

import our.project.dogpark.model.Visit;

import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Collectors;

public class VisitedDogsInGivenDay {
    public int countVisitedDogsInGivenDay(Set<Visit> visits, LocalDate day) {
       return visits.stream()
                .filter(visit -> visit.getTimestamp().toLocalDate().equals(day))
                .collect(Collectors.toSet())
               .stream().map(Visit::getDog).collect(Collectors.toSet()).size();

    }
}
