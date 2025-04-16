import java.util.Scanner;
import java.lang.Math;

public class Armstrong {

    public static void check(int num){
        int sum = 0;
        int temp = num;
        int digits = (int)(Math.log10(num) +1);
    
        while(num >0){
            int lastDigit = num%10;
            sum+= (int)Math.pow(lastDigit,digits);
            num /= 10;
        }
        if(sum == temp){
            System.out.println(temp + " is an Armstrong number.");
        }else{
            System.out.println(temp + " is not an Armstrong number.");  
    }}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a Number:");
        int num = sc.nextInt();

        check(num);
        sc.close();
        
    }
}

