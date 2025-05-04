package learning_DSA_and_java.java_codes.sorting;

import java.util.Scanner;

class QuickSort{

    static int partition(int array[], int low, int high){
        int pivot = array[low];
        int i = low, j =high;
        while(i<j){
            while(array[i]<=pivot && i<high ){
                i++;
            }
            while(array[j]>pivot && j>low){
                j--;
            }
            if(i<j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[low];
        array[low] = array[j];
        array[j] = temp;
        return j;
    }


    static void quickSort(int array[],int low, int high){
        if(low >= high){
            return;
        }

        int partition = partition (array,low,high);
        quickSort(array,low,partition-1);
        quickSort(array,partition+1,high);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        quickSort(arr, 0, n - 1);
        System.out.println("Array after sorting: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}