import java.util.Scanner;

public class Pattern10 {
    public static void halfDimond(int row){
        int c;
        for(int i=1; i <=2*row-1;i++){
            c = i;
            if(i>row){
                c= 2*row-i;
            }
            for(int j=1; j<=c; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        halfDimond(row);
        sc.close();
    }
    
}
