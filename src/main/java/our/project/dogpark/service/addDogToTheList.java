package our.project.dogpark.service;

import our.project.dogpark.model.dog.Breed;
import our.project.dogpark.model.dog.addDog;
import java.util.List;

public class addDogToTheList {
    public static void addDogToList(List<addDog> dog, String name, String id, Breed breed) {
        addDog newDog = new addDog(name, id, breed);
            dog.add(newDog);
    }

}
