package our.project.dogpark.model;

import our.project.dogpark.model.dog.Dog;
import java.time.LocalDateTime;

public class Visit {
    private String id;
    private Dog dog;
    private Playground playground;
    private LocalDateTime timestamp;

        public Visit(String id, Dog dog, Playground playground, LocalDateTime timestamp) {
            this.id = id;
            this.dog = dog;
            this.playground = playground;
            this.timestamp = timestamp;
        }

    public Visit(Dog dog) {
        this.dog = dog;
    }

    public Visit(String id) {
        this.id = id;
    }

    public Visit(Playground playground) {
        this.playground = playground;
    }

    public Visit(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Playground getPlayground() {
        return playground;
    }

    public void setPlayground(Playground playground) {
        this.playground = playground;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
