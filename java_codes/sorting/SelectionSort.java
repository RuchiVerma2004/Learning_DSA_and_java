package learning_DSA_and_java.java_codes.sorting;

import java.util.Scanner;

class SelectionSort{

    static void selectionSort(int array[], int size){
        for(int i=0 ; i<size-1; i++){
            int minIndex = i;
            for(int j=i+1; j<size;j++){
                if(array[j]<array[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = array[i];
                array[i] =array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
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
        selectionSort(array, size);
        for(int i = 0;i<size;i++){
            System.out.print(array[i]+" ");
        }   
        sc.close();
    }
}
