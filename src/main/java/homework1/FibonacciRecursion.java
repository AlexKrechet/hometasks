package homework1;

public class FibonacciRecursion {
    public static int fib(int fibomacciNum) {
        if(fibomacciNum == 0) {
            return 0;
        } else if (fibomacciNum == 1) {
            return 1;
        } else {
            return fib(fibomacciNum-1) + fib(fibomacciNum-2);
        }
    }
    public static void main(String [] arg) {
        System.out.println(fib(8));
    }

}
