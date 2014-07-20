import java.util.Scanner;

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
