import java.util.*;
public class SecondLargest {

    public static int bruiteForce(int array[]){
        Arrays.sort(array);
        for(int i =array.length-2;i>0;i--){
            if(array[i] != array[i+1]){
                return array[i];
            }
        }
        return -1;
    }

    public static int betterApproach(int array[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>largest){largest = array[i];}

        }
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<array.length;i++){
            if(array[i] != largest && array[i]>secondLargest){
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }

    public static int best(int array[]){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<array.length;i++){
            if(array[i]>largest){
                secondLargest=largest;
                largest = array[i];
            }else if(array[i]>secondLargest && array[i]!=largest){
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }
    public static void main(String args[]){
        int array [] = {1,2,3,5,46,6,7,23,45,68};
        int secondLargest1 = bruiteForce(array);
        System.out.println("Second Largest Element in the array using bruiteForce is: " + secondLargest1);  
        int secondLargest2 = betterApproach(array);
        System.out.println("Second Largest Element in the array using betterApproach is: " + secondLargest2);
        int secondLargest3 = best(array);
        System.out.println("Second Largest Element in the array using best approach is: " + secondLargest3);
    }
}
