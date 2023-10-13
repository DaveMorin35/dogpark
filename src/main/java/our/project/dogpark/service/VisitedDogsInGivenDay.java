package our.project.dogpark.service;

import our.project.dogpark.model.Visit;

import java.time.LocalDate;
import java.util.Set;

public class VisitedDogsInGivenDay {
    public long countVisitedDogsInGivenDay(Set<Visit> visits, LocalDate day) {
        return visits.stream()
                .filter(visit -> visit.getTimestamp().toLocalDate().equals(day))
                .map(Visit::getDog)
                .distinct()
                .count();

    }
}
