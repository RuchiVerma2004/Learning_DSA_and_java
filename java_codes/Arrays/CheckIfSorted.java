import java.util.*;

public class CheckIfSorted {

    public static void checkIsSorted(int[] array){
        boolean isSorted = true;

        for(int i=1; i<array.length;i++){
            if(array[i-1]>array[i]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
    }}
    public static void main(String args[]){
        int array[] = {1,2,3,4,5,6};
        checkIsSorted(array);
    }
}

