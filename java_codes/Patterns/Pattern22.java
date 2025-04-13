import java.util.Scanner;

class Pattern21{

    public static void print(int row){
        for(int i=1;i<2*row-1;i++){
            for(int j=1;j<=2*row-1;j++){
                int top = i-1;
                int bottom = 2*row-i-1;
                int left = j-1;
                int right = 2*row-j-1;
                int min = Math.min(Math.min(top,bottom),Math.min(left,right));
                System.out.print(row-min+" ");

            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows:");
        int row = sc.nextInt();
        print(row);
        sc.close();
    }
}