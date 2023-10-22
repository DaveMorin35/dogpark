package our.project.dogpark.service;

import our.project.dogpark.model.Playground;
import our.project.dogpark.model.Visit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FamousPlayground {

    public Playground findFamousPlayground(List<Visit> visits) {

        Map<Playground, Long> countByPlaygroundName = new HashMap<>();
        for (Visit visit : visits) {
            Playground playground = visit.getPlayground();
            countByPlaygroundName.put(playground, countByPlaygroundName.getOrDefault(playground, 0L) + 1);
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

