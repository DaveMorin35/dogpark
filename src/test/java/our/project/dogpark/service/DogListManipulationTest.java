package our.project.dogpark.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import our.project.dogpark.model.dog.Breed;
import our.project.dogpark.model.dog.Dog;
import our.project.dogpark.model.owner.Owner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class DogListManipulationTest {

    DogListService dogListManipulation = new DogListService(new ArrayList<>());

    Dog dog1 = new Dog("Max", "1", Breed.Retriever, new Owner("Dora", "d13"));

    @Test
    void addDog() {

        boolean result = dogListManipulation.addDog(dog1);
        Assertions.assertTrue(result);
    }

    @Test
    void getDogList() {
        dogListManipulation.addDog(dog1);

        Collection<Dog> result = dogListManipulation.getDogs();
        Assertions.assertTrue(result.contains(dog1));
    }
}