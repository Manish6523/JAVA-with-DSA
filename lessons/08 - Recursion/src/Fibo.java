public class Fibo {
    static void main() {
        int n = 7;
        System.out.println("The " + n + "th Fibonacci number is: " + fibo(n));
    }

    static int fibo(int n){
        if (n<2) {
            return n;
        } else {
            return fibo(n-1)+fibo(n-2);
        }
    }
}
