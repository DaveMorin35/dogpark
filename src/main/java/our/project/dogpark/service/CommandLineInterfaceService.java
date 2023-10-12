package our.project.dogpark.service;

import our.project.dogpark.model.dog.Breed;
import our.project.dogpark.model.dog.Dog;
import our.project.dogpark.model.owner.Owner;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;
public class CommandLineInterfaceService {
    Scanner scanner = new Scanner(System.in);
    DogListManipulation dogListManipulation = new DogListManipulation();
    private void displayMenuLines() {
        System.out.println("Welcome to the dog park! Please select an option:");
        System.out.println("1. show dog list");
        System.out.println("2. add new dog");
        System.out.println("3. delete dog");
        System.out.println("0. exit");
    }
    public void displayMenu() {

        while (true) {
            displayMenuLines();
            int input = scanner.nextInt();
            switch (input) {
                case 0:
                    System.out.println("exit");
                    return;

                case 1:
                    System.out.println("List of dogs:");
                    System.out.println(dogListManipulation.getDogList());
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("Please add your dogs name: ");
                    String dogName = scanner.nextLine();

                    String id = dogName + LocalTime.now().getSecond();

                    System.out.println("select the breed" + Arrays.toString(Breed.values()));
                    Breed breed = Breed.valueOf(scanner.nextLine());

                    System.out.println("add an owner:");
                    String ownerName = scanner.nextLine();
                    Owner owner= new Owner( ownerName,ownerName +LocalTime.now().getSecond());

                    Dog newDog = new Dog(dogName, id, breed, owner);
                    System.out.println((newDog));

                    if (dogListManipulation.addDog(newDog)) {
                        System.out.println("Your dog is added to the list");
                    } else {
                        System.out.println("We couldn't add your dog to the list");
                    }
                    break;
                case 3:
                    System.out.println("Add dog name to delete:");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    if(dogListManipulation.deleteDog(name)){
                        System.out.println(name + " is deleted from the list of dogs");
                    }else {
                        System.out.println("it looks like this dog is not in the list");
                    }
                    break;
                default:
                    System.out.println("invalid input");
                    break;
            }
        }
    }
}