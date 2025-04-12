import java.util.Scanner;

class Pattern2{

    public static void upsideHalfTriangle(int row){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        upsideHalfTriangle(row);
        sc.close();
    }
}