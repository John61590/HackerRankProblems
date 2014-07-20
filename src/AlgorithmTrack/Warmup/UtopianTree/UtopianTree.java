package AlgorithmTrack.Warmup.UtopianTree;

import java.util.Scanner;

/**
 * Date started: 4/24/14
 */
public class UtopianTree {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        try {
            int numberOfTerms = input.nextInt();
            if (numberOfTerms < 1 || numberOfTerms > 10)
            {
                System.out.println("Number of terms must be between 1 <= terms <= 10");
                System.exit(1);
            }

            for (int i = 0; i < numberOfTerms; i++)
            {
                int n = input.nextInt();
                if (n < 0 || n > 60)
                {
                    System.out.println("Number constraints are 0 <= N <= 60");
                    System.exit(1);
                }
                System.out.println(fastExp(2, (n+1)/2+1)-1-(n%2));
            }


        } finally {
            input.close();
        }
    }
    public static int fastExp(int a, int n)
    {
        if (n == 1) return a;
        if (n % 2==0) return (fastExp(a, n/2) * fastExp(a, n/2));
        else return (a*fastExp(a, (n-1)/2) * fastExp(a, (n-1)/2));
    }
}
