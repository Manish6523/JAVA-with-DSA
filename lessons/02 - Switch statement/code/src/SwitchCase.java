import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.print("enter a fruit name : ");

        String fruit = sc.next();

        // ------------------------- simple -------------------------
        switch (fruit){
            case "apple":
                System.out.println("a red fruit");
                break;
            case "banana":
                System.out.println("big yellow fruit");
                break;
            case "mango":
                System.out.println("king of fruits fruit");
                break;
            case "grapes":
                System.out.println("small tiny fruit");
                break;
            default:
                System.out.println("enter valid in put");
        }

        // ------------------------- enhanced -------------------------
        System.out.print("Enter a day as number [1 2 3 4 5 6 7] : ");
        int day = sc.nextInt();

        switch (day) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");

            default -> System.out.println("enter valid in day");
        }

        System.out.println("--------------------------------------------------");

    }
}