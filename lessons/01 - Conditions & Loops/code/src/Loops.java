import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // print n numbers ( For Loop )
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number to print : ");
        int input = in.nextInt();

        for(int count = 1 ; count <= input; count++){
            System.out.println("For Loop" + count);
        }

        System.out.println();

        // print n numbers ( While Loop )
        int count1 = 1;
        while (count1<=input){
            System.out.println("while Loop " + count1);
            count1++;
        }

        System.out.println();

        // print n numbers ( doWhile Loop )
        int count2 = 1;
        do{
            System.out.println("doWhile Loop " + count2);
            count2++;
        }while (count2<=input);
    }
}
