package learning_DSA_and_java.java_codes.sorting;

import java.util.Scanner;
import java.util.ArrayList;
class MergeSort{

    // Function to merge two sorted subarrays
    static void merge(int array[],int start, int mid, int end){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = start;
        int right = mid+1;

        while(left <= mid && right <=end){
            if(array[left]<array[right]){
                temp.add(array[left]);
                left++;
            }else{
                temp.add(array[right]);
                right++;
            }
        }

        while(left <= mid){
            temp.add(array[left]);
            left++;
        }
        while(right <= end){
            temp.add(array[right]);
            right++;
        }
        for(int i = start; i<=end ;i++){
            array[i] = temp.get(i-start);
        }

    }

    static void mergeSort(int array[], int start, int end ){
        if(start >= end ){
            return;
        }

        int mid  = start + (end - start)/2;
        mergeSort(array,start,mid);
        mergeSort(array,mid+1,end);
        merge(array,start,mid,end);

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
    mergeSort(array, 0, size-1);
    for(int i = 0;i<size;i++){
        System.out.print(array[i]+" ");
    }   
    sc.close();
}

}