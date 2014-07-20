/**
 * Created by john on 4/24/14.
 */
import java.util.*;
public class QuickSort1 {

    private static <T extends Comparable<T>> void partition(T[] table, int first, int last)
    {
        //put the median of table[first], table[middle], table[last] into table[first], and use this value as pivot
        bubbleSort3(table, first, last);
        //swap first element with median
        swap(table, first, (first + last) / 2);

        T pivot = table[first];
        int up = first;
        int down = last;
        do {
            /* Invariant: All items in table[first ... up - 1] <= pivot and All items in table[down + 1 ... last] > pivot
             */
            while ((up < last) && (pivot.compareTo(table[up]) >= 0))
            {
                up++;
            }
            //assert: up equals last or table[up] > pivot
            while (pivot.compareTo(table[down]) < 0)
            {
                down--;
            }
            //assert: down equals first or table[down] <= pivot
            if (up < down)   //if up is to the left of down
            {
                //exchange table[up] and table[down]
                swap(table, up, down);
            }
        } while (up < down); //repeat while up is left of down
        //Exchange table[first] and table[down] thus putting the pivot value where it belongs
        swap(table, first, down);
        printArray(table);
    }
    private static <T extends Comparable<T>> void bubbleSort3(T[] table, int first, int last)
    {
        int middle = (first + last) / 2;
        /* Perform bubble sort on table[first], table[middle], table[last] */
        if (table[middle].compareTo(table[first]) < 0)
        {
            swap(table, first, middle);
        }
        //assert: table[first] <= table[middle]
        if (table[last].compareTo(table[middle]) < 0)
        {
            swap(table, middle, last);
        }
        //assert: table[last] is the largest value of the three
        if (table[middle].compareTo(table[first]) < 0)
        {
            swap(table, first, middle);
        }

    }
    private static <T extends Comparable<T>> void swap(T[] table, int i, int j)
    {
        T temp = table[i];
        table[i] = table[j];
        table[j] = temp;
    }

    static <T> void printArray(T[] ar) {
        for(T n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] ar = new Integer[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        partition(ar, 0, ar.length - 1);
    }
}