import java.util.Scanner;

public class SolutionOptimized {
     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int n = in.nextInt();

          int[] stockValues = new int[n];

          for (int i = 0; i < n; i++) {
               stockValues[i] = in.nextInt();
          }

          int loss = 0;
          int max = Integer.MIN_VALUE;

          for (int i = 0; i < stockValues.length; i++) {
               if (max < stockValues[i]){
                    max = stockValues[i];
               }

               if (stockValues[i]- max < loss){
                    loss = stockValues[i]- max;
               }
          }

          System.out.println(loss);
     }
     
}
