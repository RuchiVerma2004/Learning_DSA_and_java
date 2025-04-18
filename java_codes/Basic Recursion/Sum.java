import java.util.Scanner;

public class Sum {

    public static void sum(int sum, int n){
        if(n == 0){
            System.out.println("sum: " + sum);
            return;
        }
        sum(sum+n,n-1);
        return ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();
        int sum = 0;
        sum(sum,n);
        sc.close();
    }
}
