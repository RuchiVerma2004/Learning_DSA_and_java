package learning_DSA_and_java.java_codes.sorting;
import java.util.Scanner;

class InsertionSort{

    static void insertionSort(int array[], int size){
        for(int i=1; i<size;i++){
            int j= i-1;
            int temp = array[i];

            while(j>=0 && array[j]<temp){
                array[j+1] =array[j];
                j--;
            }
            array[j+1]=temp;
        }
    }

    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the size of Array:");
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
        insertionSort(array, size);
        for(int i = 0;i<size;i++){
            System.out.print(array[i]+" ");
        }
        sc.close();
    }
}