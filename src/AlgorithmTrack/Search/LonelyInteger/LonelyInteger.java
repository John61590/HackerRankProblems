package Search.LonelyInteger;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by john on 7/19/14.
 */
public class LonelyInteger {
    static int lonelyinteger(int[] a) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (Integer i : a)
        {
            if (!hashMap.containsKey(i))
            {
                hashMap.put(i, 1);
            } else {
                int num = hashMap.get(i);
                hashMap.put(i, num + 1);
            }
        }
        for (Integer s : hashMap.keySet())
        {
            if (hashMap.get(s) == 1)
            {
                //found the number that occurs only once
                return s;
            }
        }
        return 0;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");

        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }

        res = lonelyinteger(_a);
        System.out.println(res);

    }
}
