import java.util.Scanner;

/**
 *
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
