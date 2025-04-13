import java.util.Scanner;

class Pattern18{
    public static void print(int row){
       
        for(int i=1;i<=row;i++){
            char ch = (char)(('A'+row)-i);
            for(int j=1; j<=i;j++){
                System.out.print(ch);
                ch++;
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