package our.project.dogpark.service;

import our.project.dogpark.model.dog.Dog;
import java.util.ArrayList;
import java.util.List;

public class DogListManipulation {
    ArrayList<Dog> dogs = new ArrayList<>();


    public boolean addDog(Dog dog) {

        dogs.add(dog);
        return true;
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

    public List<Dog> getDogList() {
        return dogs;
    }
}