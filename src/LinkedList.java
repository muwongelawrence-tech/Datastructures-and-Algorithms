import java.util.NoSuchElementException;

public class LinkedList {
    //it can grow and shrink automatically
    // look up by value O(n)
    // insert at end O(1)
    //insert at beginning O(1)
    //insert in the middle O(n)
    //Delete at end O(n)
    //Delete at beginning O(1)
    //Delete in the middle O(n)
    //Linked lists don't waste memory.

   //creating a private node class.
    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    // adding an item ata the end of the linked list.
    public void addLast(int item){
        // create a new node and give it the passed value
         var node = new Node(item);

         if(isEmpty())
             first = last = node;
         else {
             last.next = node;
             last = node;
         }

         size++;
    }

    // adding an item ata the beginning of the linked list.
    public void addFirst(int item){
        // create a new node and give it the passed value
        var node = new Node(item);

        if(isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }

        size++;
    }

    public int indexOf(int item){
        int index = 0;
        var current= first;

        while(current != null){
            if(current.value == item) return index;
            current = current.next;
            index++;

        }

        return -1;
    }

    public boolean contains(int item){
      return indexOf(item) != -1;
    }

    //Deleting an item at the beginning of an array.
    // [10 --> 20 --> 30]
    // it becomes [20 --> 30]
    public void removeFirst(){
       if(isEmpty())
           throw new NoSuchElementException();

       // if the linkedlist contains only one element.
       if(first == last){
           first = last = null;
       }
       else {
           var second = first.next;
           // removing the link between 10 and 20 (10 --> 20)
           first.next = null;
           first = second;
       }

       size--;

    }

    // removing the last item in the linkedlist.
    //[10 --> 20 --> 30]
    // after the operation it becomes [10 --> 20 ]
    public void removeLast(){

        if(isEmpty())
            throw new NoSuchElementException();

        if(first == last){
           first = last = null;
        }
        else {
            //get the previous node before the last node.
            var previous = getPrevious(last);
            last = previous;
            // reclaiming memory by the gabagge collector
            last.next = null;
        }

        size--;

    }

    // returns the size of the linkedlist
    public int size() {
        return size;
    }

    //converting a linkedlist to an array.
    public int[] toArray(){
        int[] array = new int[size];
        var current = first;
        var index = 0;
        while(current != null){
            array[index++] = current.value;
            current = current.next;
        }

        return array;
    }

//    how to reverse a linkedlist
    public void reverse(){
        if(isEmpty()) return;

        // changing the direction of the links.
        var previous = first;
        var current = first.next;

        while(current != null){
             var next = current.next;
             current.next = previous;
            previous = current;
             current = next;
        }

        last = first;
        last.next = null;
        first = previous;

    }

    // finding the kth node from the end of the linked list
    // in one pass.

    public int  getKthFromTheEnd(int k){

        if(isEmpty())
            throw new IllegalStateException();

        var a = first;
        var b = first;
        for(int i = 0; i < k-1; i++){
            b = b.next;
           if(b == null)
               throw new IllegalArgumentException();

        }

        while(b != last){
             a = a.next;
             b = b.next;
        }

        return a.value;
    }
    private Node getPrevious(Node node){
        var current = first;

        while(current != null ){
            if(current.next == node) return current;
            current = current.next;

        }
         return null;
    }

    private boolean isEmpty(){
        return first == null;
    }

}
