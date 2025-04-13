import java.util.Scanner;

class Pattern20{
    public static void  print(int row){
        int c;
        for(int i=1; i<=2*row-1;i++ ){
            if(i<=row){
                c=i
;
            }else{
                c=2*row-i;
            }
            for(int j=1;j<=c;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(row-c);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=c;j++){
                System.out.print("*");
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