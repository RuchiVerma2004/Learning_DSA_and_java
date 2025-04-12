import java.util.Scanner;
class Pattern1{

    public static void square(int row){
        for (int i = 1; i<=row; i++){
            for (int j = 1; j<=row; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        square(row);
        sc.close();
    }
}