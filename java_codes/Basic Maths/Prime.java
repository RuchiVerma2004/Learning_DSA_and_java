import java.util.Scanner;

public class Prime {

    public static void checkPrime(int num){
        for(int i=2;i<Math.sqrt(num); i++){
            if(num%i == 0){
                System.out.println("number is not prime");
                return;
            }
        }
        System.out.println("number is prime");
    }
    
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter number: ");
    int num = sc.nextInt();
    checkPrime(num);
    sc.close();
}

}
