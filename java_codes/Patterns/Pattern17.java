import java.util.Scanner;

class Pattern17{
    public static void print(int row){
        for(int i=1;i<=row;i++){
            char ch = 'A';
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j<i){
                    System.out.print(ch);
                    ch++;
                }else{
                    System.out.print(ch);
                    ch--;
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