package learning_DSA_and_java.java_codes.sorting;
import java.util.Scanner;

class BubbleSort{

    // Function to perform bubble sort
    static void bubbleSort(int array[],int size){
        for(int i=0; i<size-1; i++ ){
            for(int j = 0;j<size - 1-i; j++){
                if(array[j]<array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the sizr of Array:");
        int size = sc.nextInt();

        int array[] = new int[size];
        System.out.println("Enter the elements of Array:");
        for(int i = 0;i<size;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Array before sorting:");
        for(int i = 0;i<size;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\nArray after sorting:");
        bubbleSort(array, size);
        for(int i = 0;i<size;i++){
            System.out.print(array[i]+" ");
        }   
        sc.close();
    }
}