import java.util.Scanner;

public class RevNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to reverse : ");
        int value = sc.nextInt();
        int reverseNum = 0 ;

        while(value>0){
            int rem = value % 10;
            reverseNum = reverseNum * 10 + rem;
            value = value/10;
        }
        System.out.println("Reverse number : " + reverseNum);
        System.out.println();
    }
}
