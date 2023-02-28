import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'commonChild' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

   public static int commonChild(String text1, String text2) {
    // Write your code here
    int l = text1.length();
    int l2 = text2.length();
    int ans;
    int arr[][] = new int[l + 1][l2 + 1];

    for (int i = l - 1; i >= 0; i--) {

        for (int j = l2 - 1; j >= 0; j--) {

            if (text1.charAt(i) == text2.charAt(j)) {
                arr[i][j] = 1 + arr[i + 1][j + 1];
            } else {
                arr[i][j] = Math.max(arr[i + 1][j], arr[i][j + 1]);
            }
        }
    }
    ans=arr[0][0];
    return ans;
}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = bufferedReader.readLine();

        String s2 = bufferedReader.readLine();

        int result = Result.commonChild(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
