import java.util.Scanner;

public class DisplayGrades {
    public static void main(String[] args) {
        //Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
        /*  Marks        Grade
            91-100         AA
            81-90          AB
            71-80          BB
            61-70          BC
            51-60          CD
            41-50          DD
            <=40          Fail  */

        System.out.println("------------------------------");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Marks : ");
        int marks = in.nextInt();

        String grade = showGrade(marks);
        System.out.println("Your Grade : " + grade);

        System.out.println("------------------------------");

    }
    static String showGrade(int marks){
        String grade;

        if (marks > 100 || marks < 0){
            return "Marks in out of range";
        }

        if (marks>=91){
            grade = "AA";
        } else if (marks>=81) {
            grade = "AB";
        } else if (marks>=71) {
            grade = "BB";
        } else if (marks>=61) {
            grade = "BC";
        } else if (marks>=51) {
            grade = "CD";
        } else if (marks>=41) {
            grade = "DD";
        } else {
            grade = "Fail";
        }

        return grade;
    }


}
