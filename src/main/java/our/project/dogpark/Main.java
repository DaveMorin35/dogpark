package our.project.dogpark;

import our.project.dogpark.model.dog.Breed;
import our.project.dogpark.ui.AddDogUi;
import our.project.dogpark.model.dog.addDog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static final addDog[] dogs = {
            new addDog("Marcelo", "1", Breed.Beagle),
            new addDog("Maria", "2", Breed.Retriever),
            new addDog("Peter", "3", Breed.Bulldog),
    };

    public static void main(String[] args) {
        List<addDog> dogList = new ArrayList<>(Arrays.asList(dogs));

        AddDogUi dogUi = new AddDogUi(dogList);
        dogUi.run();
    }
}
