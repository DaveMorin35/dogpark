package our.project.dogpark.service;

import our.project.dogpark.model.dog.Dog;

import java.util.Collection;

public class DogListService {
    private final Collection<Dog> dogs;

    public DogListService(Collection<Dog> dogs) {
        this.dogs = dogs;
    }


    public boolean addDog(Dog dog) {
        return dogs.add(dog);
    }

    public boolean deleteDog(String name) {
        Dog dogToRemove = null;
        for (Dog dog : dogs) {
            if (dog.name().equals(name)) {
                dogToRemove = dog;
            }
        }
        return dogs.remove(dogToRemove);
    }

    public Collection<Dog> getDogs() {
        return dogs;
    }
}