import java.util.Arrays;

public class ArrayQueue {
    private int[] items;
    private int rear = -1;
    private int front = -1;
    private int count = 0; // counting items in the queue.

    public ArrayQueue(int capacity){
        items = new int[ capacity ];
    }

    public void enqueue(int item){
        if(isfull()){
            System.out.println("can't add to an already full queue.");
//            throw new IllegalStateException();
        }
        else if(isEmpty()){
            front = 0;
            rear = 0;
            items[rear] = item;
            count++;
        }
        else {
            rear++;
            items[rear] = item;
            count++;
        }

    }

    public void dequeue(){
            if(isEmpty()){
                System.out.println("can't remove an item from an empty queue.");
            }
            else if(front == rear){
                front = -1;
                rear = -1;
                count--;
            }
            else {
                front++;
                count--;
            }
    }

    //reversing the queue.
    public  void reverse(){

        int[] reversed = new int[count];
        int reversecount = 0;

        for(int i = count - 1 ; i >= 0; i-- ){
            reversed[reversecount] = items[i];
            reversecount++;
        }

        System.out.println(Arrays.toString(reversed));

    }

    public int size(){
        return count;
    }

    private boolean isfull(){
        return rear == items.length - 1;
    }


    private boolean isEmpty(){
        return front == -1 && rear == -1;
    }

   @Override
    public String toString(){
        return Arrays.toString(items);
   }
}
