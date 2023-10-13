package our.project.dogpark;


public class Main {
    public static void main(String[] args) {
            new CommandLineInterface(System.in, new UniqueDogListService()).displayMenu();
    }
}


