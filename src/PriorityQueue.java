import java.util.Arrays;

public class PriorityQueue {

    private int[] items = new int[5];
    private int count;

    public void add (int item){
        if( isFull() )
            throw new IllegalStateException();


       var i = shiftITemsToInsert(item);

        items[i] = item;
        count++;
    }

    // implementing the remove method.
    public int remove(){
        if(isEmpty())
            throw new IllegalStateException();

        return items[--count];
    }

    public int shiftITemsToInsert(int item){
        int i;
        for(i = count - 1; i >= 0; i--){
            if(items[i] > item)
                items[i + 1] = items[i];
            else
                break;
        }

        return i + 1;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull(){
        return count == items.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

}
