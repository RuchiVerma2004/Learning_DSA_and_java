import java.util.*;

public class LeftRotate {

    public static void main(String args[]){
        int array[] = {1,2,3,4,5,6};
        int i = array[0];
        for(int j=1; j<array.length;j++){
            array[j-1]=array[j];
        }
        array[array.length-1] = i;
        System.out.println("After left rotation: ");    
        for(int j=0; j<array.length;j++){
            System.out.print(array[j]+" ");
        }
    }

}
    

