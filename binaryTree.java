
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
    var node = new Node(val);
    // if the tree is empty
    if (root == null) {
      root = node;
      return;
    }

    var temp = root;
    while (true) {
      if (val < temp.value) {
        if (temp.left == null) {
          temp.left = node;
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

  public boolean find(int num) {
    var current = root;
    while (current != null) {
      if (num < current.value) {
        // go to the left side of the tree
        current = current.left;
      } else if (num > current.value) {
        // go the right side of the tree
        current = current.right;
      } else {
        return true;
      }
    }
    return false;

  }

}
