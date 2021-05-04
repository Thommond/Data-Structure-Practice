import java.util.*;

import java.util.ArrayList;
import java.util.List;

class IntegerStack {

private int max_size;
private List<Integer> stack;

public IntegerStack(int size) {
    max_size = size;
    stack = new ArrayList<Integer>(size);
}

/* method to push the stack */
public void push(int i) {
        stack.add(0, i);
}

/* method to pop the stack */
public int pop() {
    if (!stack.isEmpty()) {
        int i = stack.get(0);
        stack.remove(0);
        return i;
    } else {
        return -1;// Or any invalid value
    }
}

/* method to peek at the stack */
public int peek() {
    if (!stack.isEmpty()) {
        return stack.get(0);
    } else {
        return -1;// Or any invalid value
    }
}

/* determine if the stack is empty */
public boolean isEmpty() {
    return stack.isEmpty();
}

/* determine if the stack is full */
public boolean isFull() {
    //go through all your stack and see if there are things not set to get if it's full.
    if (stack.size() == max_size) {
      return true;
    } else {
      return false;
    }
}

/* determine the size of the stack */
public int count() {
    if (stack.isEmpty())
        return 0;
    else
        return stack.size();
}

/* changing a selected value based on index */
public int change(int index, int num) {

  if (stack != null && index >= 0 && index < stack.size()) {
    return stack.set(index, num);
  } else {
    return -1; // or any other invalid
  }

}

public void display() {
  for(int i = 0; i < stack.size(); i++) {
           System.out.println(Integer.toString(stack.get(i)));
       }
}

public static void main(String args[]) {

  IntegerStack st = new IntegerStack(3);
  st.isEmpty();
  st.push(1);
  st.push(2);
  st.push(3);
  st.isFull();
  st.peek();
  st.pop();
  st.count();
  st.change(1, 5);
  st.display();
  st.push(3);



}

}
