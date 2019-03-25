package homework1;

public class FibonacciForLoop {
    public static int fibLoop(int fibNum){
        int fib1 = 1;
        int fib2 = 1;
        int fib3 = 0;
        if (fibNum == 0){
            return 0;
        }
        if (fibNum == 1){
            return 1;
        } else {
            for (int counter = 3; counter <= fibNum; counter++) {
                fib3 = fib1 + fib2;
                fib1 = fib2;
                fib2 = fib3;
            }
        }return fib3;
    }
    public static void main(String [] arg){
        System.out.println(fibLoop(7));
    }
}