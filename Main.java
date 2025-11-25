import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("============================================================");
        System.out.println("||           Welcome Our Task Management System            ||");
        System.out.println("============================================================\n");

        //Display options

        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean isRunning = true;

        while(isRunning){
            System.out.println("Main Menu: ");
            System.out.println("************************************");
            System.out.println("1. Manage Projects");
            System.out.println("2. Manage Tasks");
            System.out.println("3. View Status Reports");
            System.out.println("4. Switch User");
            System.out.println("5. Exit");
            System.out.println("************************************\n");

            // Get choices
            System.out.print("Enter your choice (1 - 6): ");

            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Manage Projects");
                    break;

                case 2:
                    System.out.println("Manage Tasks");
                    break;

                case 3:
                    System.out.println("View Status Reports");
                    break;

                case 4:
                    System.out.println("Switch User");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    isRunning = false;
                    break;

                default:
                    System.out.print ("Please enter a valid choice (1 - 6) : ");


            }
        }

    }

    static void addProject(){

    }
}
