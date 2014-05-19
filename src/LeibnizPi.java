import java.util.Scanner;

/**
 * Date started: 4/24/14
 *
 * Copyright 2014 John Bohne
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
