import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
---------------===========> Bucket Sort <===========----------
 * * ALGORITHMS-
 --------------
* put all elements in b no. of bucket
* sort them individually
* take out and merge them

*/

public class BucketSort {
    static void bucketSort(float[] arr){
        int n = arr.length;
        // buckets
        ArrayList<Float> [] buckets = new ArrayList[n];
        // create empty buckets
        for (int i = 0; i < n; i++){
            buckets[i]= new ArrayList<>(n);
        }
   // add elements to buckets
        for (float v : arr) {
            int bucketIndex = (int) v + n;
            buckets[bucketIndex].add(v);
        }
        // sort each buckets individually
        for (ArrayList<Float> bucket : buckets) {
            Collections.sort(bucket);
        }
        // merge all buckets to get final sorted array
        int index = 0;
        for (ArrayList<Float> currBucket : buckets) {
            for (Float aFloat : currBucket) {
                arr[index++] = aFloat;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] arr= new float[n];
        bucketSort(arr);
        for (float val: arr){
            System.out.print(val + " ");
        }
    }
}
