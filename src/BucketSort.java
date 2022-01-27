import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public void sort ( int[] array , int numberOfBuckets){
        List<Integer> x = new ArrayList<>();
        // creating a bucket
        List<List<Integer>> buckets = new ArrayList<>();
        for(int i = 0; i < numberOfBuckets; i++)
            buckets.add(new ArrayList<>());

        for (int item : array)
            buckets.get(item / numberOfBuckets).add(item);

        int i = 0;
        for( var bucket : buckets) {
            Collections.sort(bucket);
            for(var item : bucket)
                array[i++] = item;

        }

    }
}
