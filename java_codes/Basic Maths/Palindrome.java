import java.util.Scanner;

public class Palindrome {
 
   
    public static void checkPalendrome(int n){
        int reverseNum = 0;
        int temp = n; // Store the original number to compare later
        while(n>0){
            int lastNum = n%10;
            reverseNum = reverseNum *10+lastNum;
            n /= 10;
        }
       
        if(temp == reverseNum){
            System.out.print("Palindrome number");
        }else{
            System.out.print("Not Palindrome number");
        }
    }

   
    
    public static void main(String args[]){
        System.out.print("enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        checkPalendrome(n);
        sc.close();
    }
}
