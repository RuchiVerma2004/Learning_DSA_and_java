import java.util.*;

class LargestEle{
    public static int bruiteforce(int array[]){
        Arrays.sort(array);
        return array[array.length-1];
    }

    public static int betterApproach(int array[]){

        int largest = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>largest){
                largest = array[i];
            }
        }

        return largest;
    }


    public static void main(String args[]){
        int array[] = {1,2,3,5,46,6,7,23,45,68,};
        int largestEle;
        largestEle = bruiteforce(array);
        System.out.println("Largest Element in the array using bruiteforce is: " + largestEle);

        int lastestEle1 =betterApproach(array);
        System.out.println("Largest Element in the array using betterApproach is: " + lastestEle1);
    }
}