package our.project.dogpark;

import our.project.dogpark.model.dog.Dog;
import our.project.dogpark.service.DogListService;
import our.project.dogpark.ui.AddDogUi;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        Collection<Dog> dogCollection = new ArrayList<>();
        DogListService dogListService = new DogListService(dogCollection);
        AddDogUi addDogUi = new AddDogUi(dogListService);

        addDogUi.run();
    }
}


