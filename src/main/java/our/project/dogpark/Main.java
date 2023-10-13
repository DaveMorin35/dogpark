package our.project.dogpark;

import our.project.dogpark.model.dog.Dog;
import our.project.dogpark.service.DisplayMenu;
import our.project.dogpark.service.DogListManipulation;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        new DisplayMenu(new DogListManipulation(new ArrayList<>())).displayMenu();
    }
}
