import java.util.Scanner;

public class Pattern12 {
    public static void print(int row){
        for (int i=1 ;i <=row; i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=2*(row-i);j++){
                System.out.print(" ");
            }
            for(int k = i;k>0;k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        print(row);
        sc.close();
    }
}
