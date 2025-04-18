import java.util.Scanner;

public class Print {

    public static void print(String name,int n ){
        if(n == 0){
            return;
        }

        print(name,n-1);
        System.out.println(n+" : "+name);
        

    }

    public static void printNum(int n){
        if(n == 0){
            return;
        }

        printNum(n-1);
        System.out.print(n + " ");
    

    }

    public static void printRevNum(int n){
        if(n == 0){
            return;
        }
        
        System.out.print(n + " ");
        printRevNum(n-1);
      

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print("Ruchi",n);
        System.out.println("reverse order:");
        printRevNum(n);
        System.out.println("\nnormal order:");
        printNum(n);
        sc.close();
    }
}
