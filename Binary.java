// For binary tree nodes
class Node {
  int val;
  Node left, right;

  public Node(int item) {
    val = item;
    left = null;
    right = null;

  }
}

// For implementation of the nodes previous created.

class Binary {

  Node root;

  public void postOrder(Node node) {

    if (node != null) {

      postOrder(node.left);
      postOrder(node.right);
      System.out.print(" " + node.val);

    }
  }

  public void preOrder(Node node) {

    if (node != null) {

      System.out.print(" " + node.val);
      preOrder(node.left);
      preOrder(node.right);
    }
  }

  public void inOrder(Node node) {

    if (node != null) {

      inOrder(node.left);
      System.out.print(" " + node.val);
      inOrder(node.right);
    }
  }

  public static void main(String[] args) {

    // create an object of Binary
    Binary r = new Binary();

    // create nodes of the tree
    r.root = new Node(1);
    r.root.left = new Node(2);
    r.root.right = new Node(3);
    r.root.left.left = new Node(4);
    r.root.right.left = new Node(5);
    r.root.left.left.left = new Node(6);
    r.root.right.right = new Node(3);

    System.out.println("Here are the orders.");

    System.out.println("\nPre-order\n");
    r.preOrder(r.root);

    System.out.println("\nPost-order\n");
    r.postOrder(r.root);

    System.out.println("\nIn-order\n");
    r.inOrder(r.root);
  }
}
