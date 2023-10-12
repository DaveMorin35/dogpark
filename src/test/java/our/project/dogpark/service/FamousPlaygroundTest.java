package our.project.dogpark.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import our.project.dogpark.model.Playground;
import our.project.dogpark.model.Visit;

import java.util.ArrayList;
import java.util.List;

class FamousPlaygroundTest {

    @Test
    void findFamousPlayground() {
        FamousPlayground famousPlayground = new FamousPlayground();

        Playground park2 = new Playground("Park2", 100);
        Visit visit = new Visit(new Playground("Park1", 50));
        Visit visit1 = new Visit(park2);
        Visit visit2 = new Visit(park2);

        List<Visit> visits = new ArrayList<>();

        visits.add(visit);
        visits.add(visit1);
        visits.add(visit2);
        Playground result = famousPlayground.findFamousPlayground(visits);

        Assertions.assertEquals(park2, result);
    }
}