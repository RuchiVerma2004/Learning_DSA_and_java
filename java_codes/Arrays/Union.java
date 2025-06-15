import java.util.*;

public class Union {

    public static void union(int array1[], int array2[]){
       
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<array1.length;i++){
            set.add(array1[i]);
        }
        for(int i=0;i<array2.length;i++){
            set.add(array2[i]);
        }

        for(int num:set){
            System.out.print(num+" ");
        }
    }

    public static void union2(int array1[], int array2[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList <Integer> list = new ArrayList<>();
        for(int i=0;i<array1.length;i++){
            if(map.containsKey(array1[i])){
                map.put(array1[i],map.get(array1[i])+1);
            }else{
                map.put(array1[i],1);
            }
        }
        for(int i=0;i<array2.length;i++){
            if(map.containsKey(array2[i])){
                map.put(array2[i],map.get(array2[i])+1);
            }else{
                map.put(array2[i],1);
            }
        }

        for(int key:map.keySet()){
            list.add(key);
        }
        for(int num:list){
            System.out.print(num+" ");
        }
     }

    public static void union3(int array1[], int array2[]){
        int right = 0;
        int left = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(right<array1.length && left<array2.length ){
            if(array1[right]<=array2[left]){
                if(!list.contains(array1[right])){
                    list.add(array1[right]);
                }
                right++;
            }else{
                if(!list.contains(array2[left])){
                    list.add(array2[left]);
                }
                left++;
            }
        }

        while(right<array1.length){
            if(!list.contains(array1[right])){
                list.add(array1[right]);
            }
            right++;
        }
        while(left<array2.length){
            if(!list.contains(array2[left])){
                list.add(array2[left]);
            }
            left++;
        }
        for(int num:list){
            System.out.print(num+" ");
        }

    }
    public static void main(String args[]){
        int array1[] = {1,2,3,4,5}  ;
        int array2[] = {2,3,4,4,5};
        union(array1,array2);
        System.out.println();
        union2(array1,array2);
        System.out.println();
        union3(array1,array2);
        System.out.println();

    }    
}
