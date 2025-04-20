import java.util.Scanner;

public class Alphabet {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int hash[] = new int[26];
        char c;
        for(int i=0;i<str.length();i++){
             c = str.charAt(i);
             hash[c - 'a']++;

        }

        int q = sc.nextInt();

        while(q>0){
            char ch = sc.next().charAt(0);
            System.out.println(hash[ch - 'a']);
            q--;
        }
        
    }
}
