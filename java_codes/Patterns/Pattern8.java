import java.util.Scanner;

class Pattern8{

    public static void downwordsTriangle(int row){
        for(int i=row; i>0; i--){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        downwordsTriangle(row);
        sc.close();
    }
}