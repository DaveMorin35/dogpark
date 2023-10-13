package our.project.dogpark.service;

import our.project.dogpark.model.dog.Dog;

import java.util.Collection;
import java.util.Objects;

public record DogListManipulation(Collection<Dog> dogs) {

    public boolean addDog(Dog dog) {
        dogs.add(dog);
        return true;
    }

    public boolean deleteDog(String name) {

        return dogs.remove(dogs.stream()
                .filter(dog -> dog.name().equals(name))
                .findFirst()
                .orElseThrow());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (DogListManipulation) obj;
        return Objects.equals(this.dogs, that.dogs);
    }

    @Override
    public String toString() {
        return "DogListManipulation[" +
                "dogs=" + dogs + ']';
    }

}