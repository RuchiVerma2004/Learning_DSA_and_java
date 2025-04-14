import java.util.Scanner;

public class Reverse {
    public static int reverse(int n){
        int reverse_num = 0;
        while(n >0){
            int last_num = n%10;
            reverse_num = reverse_num*10 +last_num;
            n /= 10;
        }
        return reverse_num;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int reverse_num = reverse(n);
        System.out.println("Reversed number: " + reverse_num);
        sc.close();
}
}
