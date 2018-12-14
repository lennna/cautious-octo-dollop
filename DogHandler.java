import java.util.Scanner;

public class DogHandler {

    private DogList dogList = new DogList();
    private Scanner input = new Scanner(System.in);

    public void run() {
        initialize();
        runCommandLoop();

    }


    private void initialize() {
        System.out.println("Welcome to Kennel!");
    }

    private void runCommandLoop() {
        listCommands();
        while (true) {

            String selection;
            selection = input.nextLine();


            switch (selection) {
                case "register new dog":

                   registerNewDog();
                    //lagra allt i en arraylist
                    break;
                case "increase age":
                    System.out.println("namn: ");

                    increaseAge();
                    //ska öka hundens ålder här, koppla till arraylist och klassen
                    break;
                case "list dogs":
                    System.out.println("shortest taillenght: ");

                    listDogs();
                    // hämta alla hundar i listan och skriva ut de som har längre svanslängd
                    break;
                case "remove dog":
                    System.out.println("namn:" );
                    removeDog();
                    //ta bort hunden
                    break;
                case "exit":
                    System.out.println("exit");
                    exitProgram();
                    //radera allt
                    return;
                default:
                    System.out.println("error");
                    break;

            }
        }
    }

    private void exitProgram() {
        input.close();
    }

    private void removeDog() {

        //ta bort hund
    }

    private void listDogs() {
        //
    }

    private void increaseAge() {
        //Öka ålder på hund
    }

    private void registerNewDog() {
         System.out.println("name: ");
         String name = input.nextLine();
         System.out.println("breed: ");
         String breed = input.nextLine();
         System.out.println("age: ");
         Integer age = input.nextInt();
         System.out.println("weight: ");
         Integer weight = input.nextInt();
    }

    private void listCommands() {
        System.out.println("Choose option: ");
        System.out.println("Register new dog");
        System.out.println("Increase age");
        System.out.println("List dogs");
        System.out.println("Remove dog");
        System.out.println("Exit");
    }


    public static void main(String[] args) {
        DogHandler program = new DogHandler();
        program.run();
    }


}
