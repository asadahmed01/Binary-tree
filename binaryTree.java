
public class binaryTree {

  // Node class
  private class Node {
    int value;
    Node left;
    Node right;

    public Node(int val) {
      this.value = val;
    }

    @Override
    public String toString() {
      return "Node = " + value;
    }

  }

  private Node root;

  public void insert(int val) {
    // if the tree is empty
    if (root == null) {
      root = new Node(val);
      return;
    }
    var temp = root;
    while (true) {
      if (val < temp.value) {
        if (temp.left == null) {
          temp.left = new Node(val);
          break;
        }
        temp = temp.left;
      }

      else {
        if (temp.right == null) {
          temp.right = new Node(val);
          break;
        }
        temp = temp.right;
      }
    }
  }

}
