import java.util.Scanner;

class Count{

    // bruteforce approach
    public static int bruiteforce(int n){
        int count = 0;
        while(n >0){
            count++;
            n /= 10;
        }

        return count;
    }


    // optimized approach
    // log10(n) + 1 gives the number of digits in n
    public static int optimized(int n){
        return (int)(Math.log10(n)+1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int n = sc.nextInt();
        int count = bruiteforce(n);
        int count2 = optimized(n);
        System.out.println("bruteforce count: " + count);
        System.out.println("optimized count: " + count2);
    }
}