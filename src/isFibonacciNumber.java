import java.util.Scanner;
import java.math.BigDecimal;

import java.math.RoundingMode;
/**
 *
 * Date started: 4/24/24
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
public class isFibonacciNumber {
    // A utility function that returns true if x is perfect square

        private static BigDecimal zero = BigDecimal.valueOf(0);

        private static BigDecimal one = BigDecimal.valueOf(1);

        private static BigDecimal two = BigDecimal.valueOf(2);

        private static BigDecimal four = BigDecimal.valueOf(4);

        private static BigDecimal five = BigDecimal.valueOf(5);


        public static boolean isFibonacci(BigDecimal num) {

            if (num.compareTo(zero) <= 0) {

                return false;

            }


            BigDecimal base = num.multiply(num).multiply(five);

            BigDecimal possibility1 = base.add(four);

            BigDecimal possibility2 = base.subtract(four);



            return (isPerfectSquare(possibility1) || isPerfectSquare(possibility2));

        }


        public static boolean isPerfectSquare(BigDecimal num) {

            BigDecimal squareRoot = one;

            BigDecimal square = one;

            BigDecimal i = one;

            BigDecimal newSquareRoot;

            int comparison = -1;


            while (comparison != 0) {

                if (comparison < 0) {

                    i = i.multiply(two);

                    newSquareRoot = squareRoot.add(i).setScale(0, RoundingMode.HALF_UP);

                } else {

                    i = i.divide(two);

                    newSquareRoot = squareRoot.subtract(i).setScale(0, RoundingMode.HALF_UP);

                }


                if (newSquareRoot.compareTo(squareRoot) == 0) {

                    return false;

                }


                squareRoot = newSquareRoot;

                square = squareRoot.multiply(squareRoot);

                comparison = square.compareTo(num);

            }


            return true;

        }



    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numberOfTerms = input.nextInt();
        if (numberOfTerms < 1 || numberOfTerms > 1000000)
        {
            System.out.println("Number of test cases is not between 1 <= T <= 10^5");
            System.exit(1);
        }
        for (int i = 0; i < numberOfTerms; i++)
        {
           double temp = input.nextDouble();


            if (temp < 1 || temp > Math.pow(10, 10))
            {
                System.out.println("Number in test case is not between 1 <= N <= 10^10");
                System.exit(1);
            }
           if (isFibonacci(BigDecimal.valueOf(temp)))
           {
               System.out.println("IsFibo");
           } else {
               System.out.println("IsNotFibo");
           }
        }

    }
}
