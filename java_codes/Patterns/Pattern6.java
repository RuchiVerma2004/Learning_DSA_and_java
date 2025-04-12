import java.util.Scanner;

class Pattern6{

    public static void upsideDownHalfTriangle(int row){
        for(int i=row; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        upsideDownHalfTriangle(row);
        sc.close();
    }
} 
