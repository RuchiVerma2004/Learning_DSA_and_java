import java.util.*;

public class MoveAllZeros {
    public static void main(String args[]){
        int array[] = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        int n = array.length;
        boolean hasZeroes= false;
        int i;
        for(i=0; i<n; i++ ){
            if(array[i] == 0){
                hasZeroes = true;
                break;
            }
        }
        if(hasZeroes == false){
            System.out.println("therer are no zeroes i n this array.");
            return;
        }

        for(int j=i+1;j<n;j++){
            if(array[j] !=0){
                array[i]=array[j];
                i++;
                array[j] = 0;
            }
        }
        System.out.println("After moving all zeroes to the end: ");
        for(int k=0; k<n; k++){
            System.out.print(array[k]+" ");
        }
        System.out.println();


    }
}
