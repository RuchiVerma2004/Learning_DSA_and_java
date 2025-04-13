import java.util.Scanner;

class Pattern15{
    public static void print(int row){
        char ch = 'A';
        for(int i=row;i>0;i--){
            ch = 'A';
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }}
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of rows: ");
            int row = sc.nextInt();
            print(row);
            sc.close();
        }
    }
