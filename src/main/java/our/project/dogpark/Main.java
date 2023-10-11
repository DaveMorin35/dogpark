package our.project.dogpark;

import our.project.dogpark.model.dog.Breed;
import our.project.dogpark.model.dog.Dog;
import our.project.dogpark.service.DisplayMenu;
import our.project.dogpark.service.DogListManipulation;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       new DisplayMenu().displayMenu();
    }
}
