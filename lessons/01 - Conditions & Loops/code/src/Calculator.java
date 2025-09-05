import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans = 0;
        while (true){
            System.out.print("Select operator [ +, -, *, / ] : ");
        char op = sc.next().trim().charAt(0);
            if (op=='+' || op=='-' || op=='*' || op=='/'){
                System.out.print("Enter 2 number : ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op == '+') {
                    ans= num1+num2;
                    System.out.println(ans);
                }
                if (op == '-') {
                    ans = num1-num2;
                    System.out.println(ans);
                }
                if (op == '*') {
                    ans = num1*num2;
                    System.out.println(ans);
                }
                if (op == '/') {
                    if(num2!=0){
                        ans = num1/num2;
                        System.out.println(ans);
                    } else {
                        System.out.println("Can't Divide by 0");
                    }
                }
            } else if (op == 'x' || op == 'X') {
                System.out.println("-------------------");
                System.out.println("Exited / Terminated");
                System.out.println("-------------------");
                break;
            } else {
                System.out.println("invalid operator");
            }
        }

    }
}
