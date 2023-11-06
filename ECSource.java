//class Node<T> {
//  T val;
//  Node<T> next;
//
//  public Node(T val) {
//    this.val = val;
//    this.next = null;
//  }
//}

import java.util.HashMap;

class ECSource {
  public static <T> boolean isUnivalueList(Node<T> head) {
//    HashMap<T, Integer> map = new HashMap<>();
//    while(head!=null) {
//        if(map.containsKey(head.val)) {
//            return false;
//        } else {
//            map.put(head.val, 0);
//        }
//        head = head.next;
//    }
//    return true;

      if(head.next == null) {
          return true;
      }
      if(head.val == head.next.val) {
          return false;
      }
      return isUnivalueList(head.next);
  }

  public static void main(String[] args) {
        Node<String> z = new Node<>("z");
        // z

        // Printing solution
        System.out.println((ECSource.isUnivalueList(z)));

      Node<Integer> u = new Node<>(2);
      Node<Integer> v = new Node<>(2);
      Node<Integer> w = new Node<>(2);
      Node<Integer> x = new Node<>(2);
      Node<Integer> y = new Node<>(2);

      u.next = v;
      v.next = w;
      w.next = x;
      x.next = y;

// 2 -> 2 -> 2 -> 2 -> 2

      System.out.println(ECSource.isUnivalueList(u)); // true
    }
}
