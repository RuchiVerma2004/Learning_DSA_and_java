import java.util.Scanner;

class Pattern16{

    public static void print(int row){
        char ch = 'A';
        for(int i = 1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int row = sc.nextInt();
        print(row);
        sc.close();

    }
}