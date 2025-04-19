import java.util.Scanner;

public class Fibonacci {
    public static void fibonacci(int n){
        if(n==0){
            System.out.print(n + " ");
            return;
        }else{
            int fib[] = new int[n+1];
            fib[0] = 0;
            fib[1] = 1;

            for(int i=2;i<=n;i++){
                fib[i] = fib[i-1] + fib[i-2];
            }

            System.out.print("fibbonachi number:"+fib[n]);
        }

    }

    public static int fibonacciRec(int n){
        if(n==0){
            return 0;
        }else if(n ==1){
            return 1;
        }

        return fibonacciRec(n-1) + fibonacciRec(n-2);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();
        fibonacci(n);
        System.out.println();
        System.out.print("fibonacci number: " + fibonacciRec(n));
        System.out.println();
        
        sc.close();
}
}