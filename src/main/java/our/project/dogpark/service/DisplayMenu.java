package our.project.dogpark.service;

import our.project.dogpark.model.dog.Breed;
import our.project.dogpark.model.dog.Dog;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayMenu {
    Scanner scanner = new Scanner(System.in);

    private void displayMenuLines() {
        System.out.println("1. visit list");
        System.out.println("2 . show dog list");
        System.out.println("3.add new dog");
        System.out.println("4. delete dog");
        System.out.println("0. exit");
    }

    DogListManipulation dogListManipulation = new DogListManipulation();

    public void displayMenu() {

        while (true) {
            displayMenuLines();
            int input = scanner.nextInt();
            switch (input) {
                case 0:
                    System.out.println("exit");
                    return;

                case 1:
                    System.out.println("this a list");

                    break;
                case 2:
                    System.out.println("this is a dog list");
                    System.out.println(dogListManipulation.getDogList());
                    break;

                case 3:
                    scanner.nextLine();
                    System.out.print("select dog name: ");
                    String dogName = scanner.nextLine();
                    System.out.println();
                    System.out.print("select dog id:");
                    String id = scanner.nextLine();
                    System.out.println("breed from the list" + Arrays.toString(Breed.values()));
                    Breed breed = Breed.valueOf(scanner.nextLine());
                    Dog newDog = new Dog(dogName, id, breed);
                    System.out.println((newDog));
                    dogListManipulation.addDog(newDog);

                    break;

                case 4:
                    System.out.println("Dog name to delete:");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    dogListManipulation.deleteDog(name);
                    break;

                default:
                    System.out.println("invalid input");
                    break;
            }
        }
    }
}
