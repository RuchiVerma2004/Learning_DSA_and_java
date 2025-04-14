import java.util.Scanner;

public class Gcd {

    static int calculateGcd(int a, int b){
        while(a !=0 && b !=0){
            if(b>a){
                b = b%a;
            }else{
                a = a%b;
            }
        }
        if(a == 0){
            return b;
        }
            return a;
        
    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = calculateGcd(a,b);
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        sc.close();
    }
}
