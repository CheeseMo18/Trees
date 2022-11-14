import java.util.Vector;

public class Main {

    static Node root;

    public static void main(String[] args) {
        createBinaryTree();
        traverseInOrder(root);

    }

    public void add(int value){
        root = addRecursive(root,value);
    }

    private Node addRecursive(Node current, int value){
        if(current == null){
            return new Node(value);
        }
        if(value< current.value){
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right,value);
        }else {
            return current;
        }
        return current;
    }

    private static Main createBinaryTree(){
        Main bt = new Main();

        bt.add(17);
        bt.add(8);
        bt.add(4);
        bt.add(12);
        bt.add(22);
        bt.add(19);
        bt.add(14);
        bt.add(5);
        bt.add(30);
        bt.add(25);

        return bt;
    }

    public static void traverseInOrder(Node node){
        if(node!=null){
            traverseInOrder(node.left);
            System.out.println(" " + node.value);
            traverseInOrder(node.right);
        }
    }
}