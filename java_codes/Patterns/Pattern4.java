import java.util.Scanner;

class Pattern4{

    public static void upsideHalfTriangleNumberRow(int row){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        upsideHalfTriangleNumberRow(row);
        sc.close();
    }
} 
