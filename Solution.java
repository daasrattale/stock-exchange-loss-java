import java.util.Scanner;

/**
 * Solution
 */
public class Solution {

     public static void main(String[] args) {

          Scanner in = new Scanner(System.in);
          int n = in.nextInt();

          int[] stockValues = new int[n];

          for (int i = 0; i < n; i++) {
               stockValues[i] = in.nextInt();
          }

          int loss = 0;

          for (int i = 0; i < stockValues.length; i++) {
               for (int j = i; j < stockValues.length; j++) {
                    int diff = stockValues[j] - stockValues[i];
                    if (diff < loss) {
                         loss = diff;
                    }
               }
          }

          System.out.println(loss);
     }
}