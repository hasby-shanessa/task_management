package utils;

import Models.User;

public class ConsoleMenu {
    public static void displayMenu(User currentUser){
        System.out.println();
        System.out.println("****************************************************************");
        System.out.println("|                JAVA TASK MANAGEMENT SYSTEM                    |");
        System.out.println("****************************************************************");
        System.out.println();
        System.out.println("Current User: " + currentUser.getDisplayHeader());
        System.out.println();
        System.out.println("Main Menu:");
        System.out.println("1. Manage Projects");
        System.out.println("2. Manage Tasks");
        System.out.println("3. View Status Reports");
        System.out.println("4. Switch User");
        System.out.println("5. Exit");
        System.out.println();
    }

    public static int getMainMenuChoice(){
        return ValidationUtils.readIntInRange("Enter your choice: ",1,5);
    }
    //display project menu
    public static void displayProjectMenu(){
        System.out.println();
        System.out.println("****************************************************************");
        System.out.println("|                      PROJECT MANAGEMENT                       |");
        System.out.println("****************************************************************");
        System.out.println();
        System.out.println("1. View All Projects");
        System.out.println("2. Create New Project");
        System.out.println("3. View Project Details");
        System.out.println("4. Delete Project");
        System.out.println("5. Back to Main Menu");
        System.out.println();

    }
    public static int getProjectMenuChoice(){
        return ValidationUtils.readIntInRange("Enter your choice: ",1,5);
    }

    //display project catalog
    public static void displayProjectCatalogHeader(int totalProjects){
        System.out.println();
        System.out.println("****************************************************************");
        System.out.println("|                        PROJECT CATALOG                       |");
        System.out.println("****************************************************************");
        System.out.println();
        System.out.println("1. View All Projects (" + totalProjects + ")");
        System.out.println("2. Software Projects Only");
        System.out.println("3. Hardware Projects Only");
        System.out.println("4. Back to Project Menu");
        System.out.println();
    }
    public static int getCatalogFilterChoice(){
        return ValidationUtils.readIntInRange("Enter your choice: ",1,4);
    }
}
