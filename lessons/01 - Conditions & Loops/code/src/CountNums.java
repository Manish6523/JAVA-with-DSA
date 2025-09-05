import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {

// Method 01
        String var = "5577845";
        char find1 = '7';
        int count1 = 0;
        for (int i = 0; i < var.length(); i++) {
            if(var.charAt(i) == find1){
                count1++;
            }
        }
        System.out.println("Count of " + find1 + " in " + var + " = " + count1);
// Method 02
        int value = 1224522;
        int find2 = 2;
        int count2 = 0;
        int temp = value;

        while(value>0){
            int digit = value % 10;
            if(digit == find2){
                count2++;
            }
            value=value/10;
        }
        System.out.println("Count of " + find2 + " in " + temp + " = " + count2);
    }
}
