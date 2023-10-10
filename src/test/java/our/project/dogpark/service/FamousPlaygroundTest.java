package our.project.dogpark.service;

import org.junit.jupiter.api.Test;

import our.project.dogpark.model.dog.Dog;
import our.project.dogpark.model.dog.Breed;
import our.project.dogpark.model.Playground;

class FamousPlaygroundTest {

    @Test
    void findFamousPlayground() {

        Dog dog1 = new Dog("Max", "1", Breed.Beagle);
        Dog dog2 = new Dog("Bella", "2", Breed.Retriever);
        Dog dog3 = new Dog("Tom", "3", Breed.Bulldog);

        Playground playground1 = new Playground("Spartakus", 50);
        Playground playground2 = new Playground("Suite", 20);
        Playground playground3 = new Playground("Cat", 30);
    }
}