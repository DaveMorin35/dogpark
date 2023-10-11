package our.project.dogpark.service;

import our.project.dogpark.model.dog.Dog;
import java.util.ArrayList;
import java.util.List;

public class DogListManipulation {
    ArrayList<Dog> dogs = new ArrayList<>();


    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public void deleteDog(String name) {
        Dog dogToRemove = null;
        for (Dog dog : dogs) {
            if (dog.name().equals(name)) {
                dogToRemove = dog;
            }
        }
        dogs.remove(dogToRemove);
    }

    public List<Dog> getDogList() {
        return dogs;
    }
}
