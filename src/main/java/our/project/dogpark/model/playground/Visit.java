package our.project.dogpark.model.playground;

import our.project.dogpark.model.dog.Dog;
import our.project.dogpark.model.playground.Playground;

import java.time.LocalDateTime;

public record Visit(String ID, Dog dog, Playground playground, LocalDateTime localDateTime) {
}
