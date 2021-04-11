//create a TreeNode class -- similar to ListNode
public class IntTreeNode {
    //3 instance variables
    public int data;
    public IntTreeNode left;
    public IntTreeNode right;

    //3 constructors

    //default constructor -- create a leaf
    public IntTreeNode(){
        this(0, null, null);
    }

    //one parameter constructor -- create a leaf
    public IntTreeNode(int data){
        this(data, null,null);
    }

    //3 parameters constructor
    public IntTreeNode(int data, IntTreeNode left, IntTreeNode right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    //

}
