package AlgorithmTrack.Warmup.SherlockBeast;

import java.util.Scanner;

/**
 *
 * Date started: 4/24/14
 *
 */
public class SherlockBeast {
    public static void maxDecent(int[] input)
    {

        for (int i : input)
        {


               System.out.println(generateDecent(i));


        }

    }
    public static String generateDecent(int i)
    {
        int fives = 0;
        int threes = 0;
        int digits = i;
        while (digits > 0) {
            if (digits % 3 == 0) {
                fives = digits;
                break;
            }
            digits -= 5;
        }
        threes = i - digits;
        if (digits < 0 || threes % 5 != 0) {
            return "-1";
        }
        StringBuilder sb = new StringBuilder(i);
        while ((fives -= 3) >= 0) {
            sb.append("555");
        }
        while ((threes-=5) >= 0) {
            sb.append("33333");
        }
        return sb.toString();


    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        try {
        int numberOfTerms = input.nextInt();
        if (numberOfTerms < 1 || numberOfTerms > 20)
        {
            System.out.println("Number of test cases is not between 1 <= T <= 20");
            System.exit(1);
        }
        int[] inputArray = new int[numberOfTerms];
        for (int i = 0; i < numberOfTerms; i++)
        {
            int temp = input.nextInt();
            if (temp < 1 || temp > 100000)
            {
                System.out.println("Number in test case is not between 1 <= N <= 100000");
                System.exit(1);
            }
            inputArray[i] = temp;
        }
        maxDecent(inputArray);

        } finally {
            input.close();
        }

    }
}
