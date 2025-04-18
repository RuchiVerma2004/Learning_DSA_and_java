import java.util.Scanner;


public class ReverseArray {

    public static void reverse(int array[], int start, int end){
        if(start >= end){
            return;
        }
        // swap the elements
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        
        reverse(array, start+1, end-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i = 0; i<n ; i++ ){
            array[i] = sc.nextInt();

        }
        System.out.print("array before reversing: ");
        for(int i:array){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("array after reversing: ");
        reverse(array,0,n-1);
        for(int i:array){
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}
