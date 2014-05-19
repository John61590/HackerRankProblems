import java.util.Scanner;

/**
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
public class FizzBuzz {

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        try {
            int numberOfTerms = input.nextInt();
            if (numberOfTerms > Math.pow(10, 7))
            {
                System.out.println("Number of test cases is not between N < 10^7");
                System.exit(1);
            }
            for (int i = 1; i <= numberOfTerms; i++)
            {
                if (i%3 == 0 && i%5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i%3 == 0 && i%5 != 0) {
                    System.out.println("Fizz");
                } else if (i%5 == 0 && i%3 != 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }

        } finally {
            input.close();
        }
    }
}
