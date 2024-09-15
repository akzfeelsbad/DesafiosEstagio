import java.util.Scanner;

public class FibonacciChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um número para verificar se  ele pertence à sequência de Fibonacci: ");
        int number = scanner.nextInt();


        if (isFibonacci(number)) {
            System.out.println(number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(number + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    public static boolean isFibonacci(int number) {

        if (number < 0) {
            return false;
        }

 
        if (number == 0 || number == 1) {
            return true;
        }

 
        int a = 0;
        int b = 1;
        int fib = a + b;


        while (fib <= number) {
            if (fib == number) {
                return true;
            }
            a = b;
            b = fib;
            fib = a + b;
        }


        return false;
    }
}
