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

       if(first == last){
           first = last = null;
            return;
       }

    var second = first.next;
    // removing the link between 10 and 20 (10 --> 20)
    first.next = null;
    first = second;

    }

    // removing the last item in the linkedlist.
    //[10 --> 20 --> 30]
    // after the operation it becomes [10 --> 20 ]
    public void removeLast(){

        if(isEmpty())
            throw new NoSuchElementException();

        if(first == last){
           first = last = null;
           return;
        }

        //get the previous node bofore the last node.
        var previous = getPrevious(last);
        last = previous;
        // reclaiming memory by the gagagge collector
        last.next = null;


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
