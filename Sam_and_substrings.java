import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'substrings' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING n as parameter.
     */

    public static int substrings(String n) {
    // Write your code here
        int length = n.length();
        int sum=0;
        //long temp=0;
        long prev=0;
        int m = 1_000_000_007;
        for(int i=0; i<length; i++){
            prev= (10*prev + (i+1) * Integer.parseInt(n.substring(i,i+1)))%m;
            sum=(int)((sum+prev)%m);
        }
        

        return sum;
        //445677619      972698438521
        //597988838
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String n = bufferedReader.readLine();

        int result = Result.substrings(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
