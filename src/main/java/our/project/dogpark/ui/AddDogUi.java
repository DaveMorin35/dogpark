package our.project.dogpark.ui;

import our.project.dogpark.model.dog.Breed;
import our.project.dogpark.model.dog.Dog;
import our.project.dogpark.model.owner.Owner;
import our.project.dogpark.service.DogListService;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class AddDogUi {
    private final DogListService dogListManipulation;

    public AddDogUi(DogListService dogListManipulation) {
        this.dogListManipulation = dogListManipulation;
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
                case 5 -> invalidInput();
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

        System.out.print("Please add your dogs name: ");
        String dogName = scanner.nextLine();

        String id = dogName + LocalTime.now().getSecond();

        System.out.println("select the breed" + Arrays.toString(Breed.values()));
        Breed breed = Breed.valueOf(scanner.nextLine());

        System.out.println("add an owner:");
        String ownerName = scanner.nextLine();
        Owner owner = new Owner(ownerName, ownerName + LocalTime.now().getSecond());

        Dog newDog = new Dog(dogName, id, breed, owner);
        System.out.println((newDog));

        if (dogListManipulation.addDog(newDog)) {
            System.out.println("Your dog is added to the list");
        } else {
            System.out.println("We couldn't add your dog to the list");
        }
    }

    private void deleteDog() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add dog name to delete:");
        scanner.nextLine();
        String name = scanner.nextLine();
        if (dogListManipulation.deleteDog(name)) {
            System.out.println(name + " is deleted from the list of dogs");
        } else {
            System.out.println("it looks like this dog is not in the list");
        }
    }

    private void modifiedDog() {
        Scanner scanner = new Scanner(System.in);
    }

    private void showList() {
        System.out.println("List of dogs:");
        System.out.println(dogListManipulation.getDogs());
    }

    private void invalidInput() {
        System.out.println("Invalid inout");

    }
}

