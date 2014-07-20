import java.util.*;

/**
 * Created by john on 4/23/14.
 */
public class CountingSort1 {
    public static void countingSort(int[] input)
    {
        LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<Integer, Integer>();
        for (int i : input)
        {
//            System.out.println("i is " + i + " and treemap contains is " + hashMap.containsKey(1));
            if (hashMap.containsKey(i))
            {
                int count = hashMap.get(i);

                hashMap.put(i, (count + 1));
            } else {
            hashMap.put(i, 0);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        try {
        int numberOfTerms = input.nextInt();
            if (numberOfTerms < 100 || numberOfTerms > 1000000)
            {
                System.out.println("Number of test cases is not between 1 <= T <= 10^5");
                System.exit(1);
            }
            int[] inputArray = new int[numberOfTerms];
            for (int i = 0; i < numberOfTerms; i++)
            {
                int temp = input.nextInt();


                if (temp < 0 || temp > 100)
                {
                    System.out.println("Number in test case is not between 1 <= N <= 10^10");
                    System.exit(1);
                }
                inputArray[i] = temp;
            }
            countingSort(inputArray);

        } finally {
            input.close();
        }
    }
}
