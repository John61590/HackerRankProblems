import java.util.Scanner;

/**
 * Date started: 4/24/14
 *
 * Note: This code isn't really good code golf and doesn't receive much points.
 * Most of the top submissions for this are done in Perl.
 * Java is much too verbose of a language to achieve a top score in code golf competitions.
 */


public class LeibnizPi {
    public static void main(String[] args)
    {
         Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        if (n > 100)
        {
            System.exit(1);
        }
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
        {
           int t = in.nextInt();
            if (t > 100000000)
            {
               System.exit(1);
            }
           a[i] = t;
        }
        for (int x : a)
        {
            sum(x);
        }

    }
    public static void sum(int n)
    {
        double s = 0;
        for (int i = 0; i < n; i++)
        {
            s = s + ((Math.pow(-1, i)) / ((2 * i) + 1));
        }
        System.out.println(String.format("%.15g%n", s));
    }
}
