package Anagram;

import java.util.Scanner;

/**
 * Created by john on 7/18/14.
 */
public class Anagram {
    public static void isAnagram(String[] array)
    {
           for (String s : array)
           {
               int count[] = new int[26];
               int sum = 0;
               int length = s.length();
               if (length % 2 != 0)
               {
                   System.out.println("-1");
               } else {
                   String first = s.substring(0, (length / 2));
                   String second = s.substring((length / 2), length);

                   for (char c : first.toCharArray())
                   {
                        count[c - 'a']++;
                   }
                   for (char c : second.toCharArray())
                   {
                       count[c - 'a']--;
                   }
                   for (int i = 0; i < 26; i++)
                   {
                        sum += mod(count[i]);
                   }
                   sum /= 2;
                   System.out.println(sum);


               }
           }
    }
    public static int mod(int x)
    {
        if (x < 0)
        {
            return (-1) * x;
        } else {
            return x;
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        try {
            int numberOfTerms = input.nextInt();
            String[] inputArray = new String[numberOfTerms];
            for (int i = 0; i < numberOfTerms; i++)
            {
                String temp = input.next();
                inputArray[i] = temp;
            }
            isAnagram(inputArray);

        } finally {
            input.close();
        }
    }
}
