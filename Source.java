import java.util.ArrayList;

class Node<T> {
    T val;
    Node<T> next;
    
    public Node(T val) {
      this.val = val;
      this.next = null;
    }
  }
  
  class Source {
    public static <T> Node<T> reverseList(Node<T> head) {
        Node prev = null; // in order to reverse a linked list, we need a previous node, current node, and next node
        Node curr = head;
        Node next = null;
        while(curr != null) { // starting with the curr node, which is the head node
            next = curr.next;  // increment next
            curr.next = prev; //  next is set to previous in order to keep prev as the initial value
            prev = curr; // previous is set to current
            curr = next; // current = next
        }
        // as we go through the nodes, we are storing the previous node,
        head = prev;
      return head;
    }
    
    public static void main(String[] args) {
        Node<String> x = new Node<>("x");
        Node<String> y = new Node<>("y");
    
        x.next = y; // x -> y
    
        reverseList(x); // y -> x

        // Printing solution
        Node<String> head = Source.reverseList(x);

        Node<String> a = new Node<>("a"); // next = b, curr.next = null, prev = a, curr = b;
        Node<String> b = new Node<>("b"); // next = c, curr.next = a, prev b, curr = c;
        Node<String> c = new Node<>("c"); // next = d, curr.next = b, prev = c, curr = d;
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
// a -> b -> c -> d -> e -> f

        Node<String> head2 = Source.reverseList(a);// f -> e -> d -> c -> b -> a

        while (head != null) {
            System.out.print(head.val);
            head = head.next;            
        }
        System.out.println();
        while (head2 != null) {
            System.out.print(head2.val);
            head2 = head2.next;
        }
    }
  }