import java.util.Scanner;

class Pattern21{
    public static void print(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                if(i==1 || i==row || j==1 || j==row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
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