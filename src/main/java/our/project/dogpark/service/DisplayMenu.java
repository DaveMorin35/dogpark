package our.project.dogpark.service;

import our.project.dogpark.model.dog.Breed;
import our.project.dogpark.model.dog.Dog;
import our.project.dogpark.model.owner.Owner;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;
public class DisplayMenu {
    Scanner scanner = new Scanner(System.in);
    DogListManipulation dogListManipulation = new DogListManipulation();
    private void displayMenuLines() {

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
                    System.out.println("this is a dog list");
                    System.out.println(dogListManipulation.getDogList());
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("select dog name: ");
                    String dogName = scanner.nextLine();

                    String id = dogName + LocalTime.now().getSecond();

                    System.out.println("write the breed from the list please" + Arrays.toString(Breed.values()));
                    Breed breed = Breed.valueOf(scanner.nextLine());
                    System.out.println("who is owner,write the name or noOwner");
                    String ownerName = scanner.nextLine();
                    Owner owner= new Owner( ownerName,ownerName+LocalTime.now().getSecond());

                    Dog newDog = new Dog(dogName, id, breed,owner);
                    System.out.println((newDog));

                    if (dogListManipulation.addDog(newDog)) {
                        System.out.println("new Dog is in the list added");
                    }
                    break;
                case 3:
                    System.out.println("Dog name to delete:");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    if(dogListManipulation.deleteDog(name)){
                        System.out.println("dog "+name+" is deleted");
                    }else {
                        System.out.println("dog is not find");
                    }
                    break;
                default:
                    System.out.println("invalid input");
                    break;
            }
        }
    }
}