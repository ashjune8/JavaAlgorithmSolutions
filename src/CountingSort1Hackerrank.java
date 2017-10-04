import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class CountingSort1Hackerrank {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner in = new Scanner(System.in);
        long numbers = in.nextLong();

        HashMap<Long,Long> dict = new HashMap<>();
        long input;

        for (long i =0; i<numbers;i++){
            input = in.nextLong();
            if(!dict.containsKey(input)){
                dict.put(input,1L);
            }
            else{
                dict.put(input,dict.get(input)+1L);
            }

        }

        for (long i =0; i< 100;i++){
            if (dict.containsKey(i)){
                System.out.print(dict.get(i) + " ");
            }
            else System.out.print(0L + " ");
        }
    }

}
