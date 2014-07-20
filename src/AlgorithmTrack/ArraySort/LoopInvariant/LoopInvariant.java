package AlgorithmTrack.ArraySort.LoopInvariant;

import java.util.*;
/**
 * Created by john on 7/19/14.
 */
public class LoopInvariant {

        public static void insertionSort(int[] A){
            for(int i = 1; i < A.length; i++){
                int value = A[i];
                while(i > 0 && A[i - 1] > value){
                    A[i] = A[i - 1];
                    i--;
                }
                A[i] = value;
            }

            printArray(A);
        }


        static void printArray(int[] ar) {
            for(int n: ar){
                System.out.print(n+" ");
            }
        }
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] ar = new int[n];
            for(int i=0;i<n;i++){
                ar[i]=in.nextInt();
            }
            insertionSort(ar);
        }
    }

