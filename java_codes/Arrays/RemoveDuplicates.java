public class RemoveDuplicates {
    public static void main(String args[]){
        int array[] = {1,1,2,2,2,3,4};
        int n = array.length;

        int i = 0;
        for(int j = 1;j<array.length;j++){
            if(array[j] != array[i]){
                i++;
                
                array[i]=array[j];
               
            }
        }
        System.out.println(i+1);
    }
}
