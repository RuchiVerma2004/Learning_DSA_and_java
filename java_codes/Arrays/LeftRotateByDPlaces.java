import java.util.*;

public class LeftRotateByDPlaces {

    public static void reverse(int array[], int start, int end){
        while(start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end]= temp;
            start++;
            end--;
        }
    }

    public static void leftRotate(int array[], int key){
        key = key%array.length;
        reverse(array,0,key-1);
        reverse(array,key,array.length-1);
        reverse(array,0,array.length-1);
        System.out.println("After left rotation: ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

     public static void rightRotate(int array[], int key){
        key = key%array.length;
        int n = array.length -1;
        reverse(array,0,n-key);
        reverse(array,(n-key)+1,n);
        reverse(array,0,array.length-1);
        System.out.println("After right rotation: ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String args[]){
        int array[] = {1,2,3,4,5,6,7,8,9};
        int d=2;
        rightRotate(array, d);
    }
}
