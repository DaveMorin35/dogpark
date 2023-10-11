package our.project.dogpark.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import our.project.dogpark.model.Playground;
import our.project.dogpark.model.Visit;

import java.util.HashSet;
import java.util.Set;

class FamousPlaygroundTest {

    @Test
    void findFamousPlayground() {
        FamousPlayground famousPlayground = new FamousPlayground();

        Visit visit = new Visit(new Playground("Park1", 50));
        Visit visit1 = new Visit(new Playground("Park2", 100));
        Visit visit2 = new Visit(new Playground("Park2", 100));

        Set<Visit> visits = new HashSet<>();

        visits.add(visit);
        visits.add(visit1);
        visits.add(visit2);
        Playground result = famousPlayground.findFamousPlayground(visits);

        Assertions.assertEquals(new Playground("Park2", 100), result);
    }
}