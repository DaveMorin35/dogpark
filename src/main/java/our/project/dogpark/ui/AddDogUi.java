package our.project.dogpark.ui;

import our.project.dogpark.model.dog.Breed;
import our.project.dogpark.model.dog.addDog;
import our.project.dogpark.service.addDogToTheList;

import java.util.List;
import java.util.Scanner;

public class AddDogUi {
    private final List<addDog> library;

    public AddDogUi(List<addDog> library) {
        this.library = library;
    }


    public void run() {
        displayWelcomeMessage();

        int code = 0;

        while (code != 5) {
            displayMenu();
            code = getCode();


            switch (code) {
                case 1 -> addDog();
                case 2 -> deleteDog();
                case 3 -> modifiedDog();
                case 4 -> showList();

            }
        }
    }

    private static void displayWelcomeMessage() {
        System.out.println("Welcome to Dog park!");
        System.out.println("Please make your choice");
    }

    private static void displayMenu() {
        System.out.println("1 - Add dog");
        System.out.println("2 - Delete dog");
        System.out.println("3 - Modified dog");
        System.out.println("4 - ShowList");
        System.out.println("5 - Exit");
    }

    private static int getCode() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private void addDog() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the dog");
        String dogName = scanner.nextLine();

        System.out.println("Enter a id for the dog");
        String dogId = scanner.nextLine();

        System.out.println("Choose a breed for the dog between Retriever, Bulldog or Beagle. Enter the Breed please");
        String dogBreed = scanner.nextLine();

        try {
            Breed breed = Breed.valueOf(dogBreed);
            addDogToTheList.addDogToList(library, dogName, dogId, breed);
            System.out.println("dog add to the list");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid breed. Please choose from Retriever, Bulldog, or Beagle.");
        }
    }

    private void deleteDog() {
        Scanner scanner = new Scanner(System.in);
    }

    private void modifiedDog() {
        Scanner scanner = new Scanner(System.in);
    }

    private void showList(){
        for (addDog dog : library){
            System.out.println(dog);
        }
    }


}

