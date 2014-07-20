package Search.Flowers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by john on 7/19/14.
 */
public class Flowers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int flowers, friends;
        flowers = in.nextInt();
        friends = in.nextInt();

        Integer cost[] = new Integer[flowers]; //cost for each flower
        for (int i = 0; i < flowers; i++) {
            cost[i] = in.nextInt();
        }
        //sort flowers in a decreasing order because the last groups are more expensive so you want to take less
        Arrays.sort(cost, Collections.reverseOrder()); //only works on Class, not primitives
        int count = 0;
        long result = 0;
        for (int i = 0; i < flowers; i++)
        {
            result += cost[i] * (count / friends + 1);
            count++;
        }

        System.out.println(result);
    }
}
