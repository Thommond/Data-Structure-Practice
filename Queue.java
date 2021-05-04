import java.util.*;

class TheQueue {

private int max_size;
private Queue<Integer> queue;

public Queue(int size) {
    max_size = size;
    queue = new Queue<Integer>(size);
}

  public void push(int i) {
          queue.add(0, i);
  }

  public int pop() {
      if (!queue.isEmpty()) {
          int i = queue.get(0);
          queue.remove();
          return i;
      } else {
          return -1;// Or any invalid value
      }
  }

  public int peek() {
      if (!queue.isEmpty()) {
          return queue.peek();
      } else {
          return -1;// Or any invalid value
      }
  }

  public boolean isEmpty() {
      return queue.isEmpty();
    }

  public boolean isFull() {

      if (queue.size() == max_size) {
        return true;
      } else {
        return false;
      }
  }

  public int count() {
      if (queue.isEmpty())
          return 0;
      else
          return queue.size();
  }

  public int change(int index, int num) {

    if (queue != null && index >= 0 && index < queue.size()) {
      return queue.set(index, num);
    } else {
      return -1; // or any other invalid
    }

  }

  public void display() {
    for(int i = 0; i < queue.size(); i++) {
             System.out.println(Integer.toString(queue.get(i)));
         }
  }

  public static void main(String args[]) {

    TheQueue q = new TheQueue(3);
    q.isEmpty();
    q.push(1);
    q.push(2);
    q.push(3);
    q.isFull();
    q.peek();
    q.pop();
    q.count();
    q.change(1, 5);
    q.display();
    q.push(3);



  }


}
