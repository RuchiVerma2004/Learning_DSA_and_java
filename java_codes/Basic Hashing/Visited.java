import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Visited {

    public static void search(int array[], int n){
        boolean visited[] = new boolean[n];
        for(int i=0;i<array.length;i++){
            if(visited[i] == true){
                continue;
            }
            int count =1;
            for(int j =i+1; j<array.length;j++){
                if(array[i]==array[j]){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println("count of " + array[i] + " is: " + count);
        }
        
    }

    public static void mapUsing(int array[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<array.length;i++){
            if(map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }else{
                map.put(array[i],1);
            }
        }

         for (Map.Entry<Integer,Integer> entry : map.entrySet())
    {
        System.out.println(entry.getKey() + " " + entry.getValue());
    }


    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of elemment is the array:");
        int n = sc.nextInt();

        int array[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter Element:");
            array[i] = sc.nextInt();
        }

        search(array,n);
        System.out.println("using HashMap");
        mapUsing(array);
        sc.close();
    }
}
