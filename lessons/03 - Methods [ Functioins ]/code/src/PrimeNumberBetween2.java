import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumberBetween2 {
    public static void main(String[] args) {
        // Write a function that returns all prime numbers between two given numbers.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st & nth for Prime : ");
        int st = in.nextInt();
        int en = in.nextInt();
        ArrayList<Integer> res = allPrime(st, en);
        System.out.println(res);
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static ArrayList<Integer> allPrime(int startNo, int lastNo){
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = startNo; i<=lastNo; i++){
            boolean result = isPrime(i);
            if (result){
                primes.add(i);
            }
        }
        return primes;
    }
}
