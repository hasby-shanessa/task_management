import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("============================================================");
        System.out.println("||           Welcome Our Task Management System            ||");
        System.out.println("===========================================================\n");

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
                    Scanner project_input = new Scanner(System.in);
                    int projectChoice;
                    boolean projectRunning = true;

                    while(projectRunning){
                        System.out.println("Filter Options");
                        System.out.println("************************************");
                        System.out.println("1. Add New Models.Project");
                        System.out.println("2. View All Projects");
                        System.out.println("3. Software Projects Only");
                        System.out.println("4. Hardware Projects Only");
                        System.out.println("5. Search By Budget Range");
                        System.out.println("6. Return to Main Menu");
                        System.out.println("7. Exit");
                        System.out.println("************************************\n");
                        System.out.print("Enter your choice (1 - 6): ");

                        projectChoice = project_input.nextInt();

                        switch (projectChoice){
                            case 1:
                                System.out.println("Add New Models.Project");
                                Scanner add_project_name = new Scanner(System.in);
                                System.out.print("Enter your project Name: ");
                                String projectName = add_project_name.nextLine();
                                Scanner add_project_description = new Scanner(System.in);
                                System.out.print("Add your project description: ");
                                String projectDescription = add_project_description.nextLine();
                                Scanner add_project_type = new Scanner(System.in);
                                System.out.print("Enter your project type: ");
                                String projectType = add_project_type.nextLine().toUpperCase();
                                Scanner add_teamSize = new Scanner (System.in);
                                System.out.print("Enter your team size: ");
                                int teamSize = add_teamSize.nextInt();
                                Scanner add_project_budget = new Scanner(System.in);
                                System.out.print("Enter the budget of your project: ");
                                double projectBudget = add_project_budget.nextDouble();

//                                Models.Project newProject = new Models.Project(projectName, projectDescription, projectType, teamSize, projectBudget);
                                break;

                            case 2:
                                System.out.println("User wants to view their projects");
                                break;

                            case 3:
                                System.out.println("User wants to view software projects only");
                                break;

                            case 4:
                                System.out.println("User wants to view hardware projects only");
                                break;

                            case 5:
                                System.out.println("User wants to search project by budget range");
                                break;

                            case 6:
                                System.out.println("Return to Main Menu");

                            case 7:
                                System.out.println("Exiting...");
                                projectRunning = false;
                                break;

                            default:
                                System.out.print ("Please enter a valid choice (1 - 6) : ");
                        }
                    }
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
