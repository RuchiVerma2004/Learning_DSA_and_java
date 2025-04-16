import java.util.Scanner;


public class Divisors {

    public static void divisors(int num){
        System.out.print("divisors of" +num+ " are: ");
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num%i ==0){
                System.out.print(i+" ");
                if(i!=num/i){
                    System.out.print(num/i+" ");
                }
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int num = sc.nextInt();

        divisors(num);
        sc.close();
    }

}
