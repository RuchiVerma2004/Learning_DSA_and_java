import java.util.Scanner;

public class Hashing {

    public static void queryCount(int array[], int search[]){
        int count;
        for(int i=0;i<search.length;i++){
            
            count =0;
            for(int j=0; j<array.length ;j++){
                if(array[j] == search[i]){
                    count++;
                }
            }
            System.out.println("count of " + search[i] + " is: " + count);
        }
       }
    
    public static void queryCountHash(int array[], int search[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<search.length;i++){
            if(search[i]>max){
                max = search[i];
            }
        }

        int max2 = Integer.MIN_VALUE;
        for(int i=0; i<array.length;i++){
            if(array[i]>max2){
                max2 = array[i];
            }
        }
        if(max2>max){
            max = max2;
        }
        int hash[] = new int[max+1];
        for(int i=0;i<array.length;i++){
            hash[array[i]]++;
        }

        for(int i=0;i<search.length;i++){
            System.out.println("count of " + search[i] + " is: " + hash[search[i]]);
    }
}
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out .print("Enter number of element in the array:");
        int num = sc.nextInt();

        int array[] = new int[num];

        for(int i = 0; i < array.length; i++) {
            System.out.print("Enter element: ");
            array[i] = sc.nextInt();
        }

        int search[] ={2,3,5,1};
        
            
            queryCount(array,search);
            System.out.println("Using Hashing: ");
            queryCountHash(array,search);
        
        
        sc.close();
    }    

}

