import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        String result = new String();
        if (s.charAt(8)=='A'){
            if(s.charAt(0)=='1' && s.charAt(1)=='2' )
                result = "00" + s.substring(2,8);
            else result = s.substring(0,8);
        }else{
            if(s.charAt(0)=='1' && s.charAt(1)=='2' )
                result = s.substring(0,8);
            else {
                int hours = Integer.parseInt(s.substring(0,2));
                hours+=12;
                result = Integer.toString(hours) + s.substring(2,8);
            }
        }
        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
