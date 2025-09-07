import java.util.Scanner;
public class MaxMinimumAndCircumferenceOfCircle {
    public static void main(String[] args) {

    // Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 3 numbers : ");

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        max(num1, num2, num3);
        min(num1, num2, num3);

    // Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
        System.out.print("Enter Radius : " );
        float radius = in.nextInt();

        float ans = circumference(radius);
        System.out.println("Circumference of circle : " + ans);

    }
        static void max(int n1,int n2,int n3){
        int max;
            if(n1>n2 && n1>n3){
                max = n1;
            } else if (n2>n1 && n2>n3) {
                max = n2;
            } else {
                max = n3;
            }
            System.out.println("Maximum : "+ max);
        }

        static void min(int m1, int m2, int m3){
            int min;
            if(m1<m2 && m1<m3){
                min = m1;
            } else if (m2<m1 && m2<m3) {
                min = m2;
            } else {
                min = m3;
            }
            System.out.println("Minimum : "+ min);
        }

        static float circumference(float radius){
        float cir;
            cir = (float) (2 * 3.14 * radius);
            return cir;
        }
}