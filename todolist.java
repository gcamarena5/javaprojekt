import java.util.Scanner;
import java.util.LinkedList;
public class App {
    public static void main(String[] args) throws Exception {

        LinkedList<String> tasks = new LinkedList<String>();
        Scanner userInput = new Scanner(System.in);
        int menuChoice = 0;
        int elementChoice = 0;
        String taskInput;
        System.out.println("Welcome to my to-do list program!");

        do{
        System.out.println("Choose from a list of options: ");
        System.out.println("1.Add Task\n2.Remove Task\n3.Display Current Tasks\n4.Quit");
        menuChoice = userInput.nextInt();
        switch(menuChoice)
        {
            case 1: 
                System.out.println("Insert task:\n");
                userInput.nextLine();
                taskInput = userInput.nextLine();
                tasks.add(taskInput);
                System.out.println("Task successfully added!");
                break;
            case 2:
            System.out.println("Current tasks are: ");
            System.out.println(tasks);
            System.out.println("Choose which element to remove.");
            elementChoice = userInput.nextInt();
            tasks.remove(elementChoice);
            break;

            case 3:
            System.out.println("Current tasks are: ");
            System.out.println(tasks);
            break;
            


        }
        }while(menuChoice != 4);
        System.out.println("Thank you for using my program!");
        

    }
}
