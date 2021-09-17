import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(int a[]) {
    // Write your code here
    int[] birds = new int[6];
     for(int i=0;i<a.length;i++)
     {
       birds[a[i]]++;
     }
     int max=0;
     int maxid=0;
     for(int i=1;i<birds.length;i++)
     {
       if(birds[i]>max)
       {
         maxid=i;
         max=birds[i];
       }
     }
     return maxid;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int a[] = new int[arrCount];

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            a[i]=arrItem;
        }

        int result = Result.migratoryBirds(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
