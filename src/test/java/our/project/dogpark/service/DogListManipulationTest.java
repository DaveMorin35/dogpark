package our.project.dogpark.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import our.project.dogpark.model.dog.Breed;
import our.project.dogpark.model.dog.Dog;
import our.project.dogpark.model.owner.Owner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DogListManipulationTest {

    DogListManipulation dogListManipulation = new DogListManipulation();

    Dog dog1 = new Dog("Max", "1", Breed.RETRIEVER, new Owner("Dora", "d13"));

    @Test
    void addDog() {

        boolean result = dogListManipulation.addDog(dog1);
        Assertions.assertTrue(result);
    }

    @Test
    void deleteDog() {
       // dogs.add(dog1);
       // boolean result = dogListManipulation.deleteDog("Max");

       // Assertions.assertTrue(result);

    }

    @Test
    void getDogList() {
        dogListManipulation.addDog(dog1);

        List<Dog> result = dogListManipulation.getDogList();
        Assertions.assertTrue(result.contains(dog1));
    }
}