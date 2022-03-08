import java.util.Arrays;

public class StackArray {
    private int[] items;
    private int top = -1;
    private int count = 0; // counting items in the queue.

    public StackArray(int capacity){
        items = new int[ capacity ];
    }

    public void push(int item){
        if(isfull()){
            System.out.println("can't add to an already full stack.");
            // throw new IllegalStateException();
        }
        else if(isEmpty()){
            top = 0;
            items[top] = item;
            count++;
        }
        else {
            top++;
            items[top] = item;
            count++;
        }

    }

    public void pop(){
        if(isEmpty()){
            System.out.println("can't remove an item from an empty stack.");
        }
        else {
            top--;
            count--;
        }
    }

    public void peek(){
        System.out.println("The top element on the stack is "+ items[top]);
    }

    //printing the stack.
    public  void show(){

        int[] showStack = new int[count];
        int showcount = 0;

        for(int i = count - 1 ; i >= 0; i-- ){
            showStack[showcount] = items[i];
            showcount++;
        }

        System.out.println(Arrays.toString(showStack));

    }

    //reversing the stack.
    public  void reverse(){

        int[] reversed = new int[count];
        int reversecount = 0;

        for(int i = 0 ; i < count; i++){
            reversed[i] = items[i];
        }

        System.out.println(Arrays.toString(reversed));

    }

    public int size(){
        return count;
    }

    private boolean isfull(){
        return top == items.length - 1;
    }


    private boolean isEmpty(){
        return top == -1;
    }




}
