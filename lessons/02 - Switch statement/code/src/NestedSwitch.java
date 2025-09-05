import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------------------------------");

        System.out.print("Enter Employee Id : ");
        int EmpId = sc.nextInt();

        System.out.print("Enter department : ");
        String department = sc.next().toUpperCase();

        switch (EmpId){
            case 1:
                System.out.println("Manish Sharma");
                break;
            case 2:
                System.out.println("Krish Sharma");
                break;
            case 3:
                switch (department){
                    case "CE":
                        System.out.println("Computer Department");
                        break;
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    default:
                        System.out.println("Enter valid department");
                }
                break;
            default:
                System.out.println("Enter valid Employee Id");
        }

        System.out.println("--------------------------------------------------");

    }
}
