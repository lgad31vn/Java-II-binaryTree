/* Nam Phu Nguyen (Logan)
   IT220-JAVA II 
   Programing Assignment
 */ 

public class IntTree {
    //one instance variable
    private IntTreeNode overAllRoot;

    //create an IntTree constructor that initializes the overallRoot
    public IntTree(IntTreeNode root){
        overAllRoot = root;
    }

    //add a method that will print the contents of the tree in preOrder
    public void printPreOrder(){
        //call a recursive method
        preOrder(overAllRoot);
    }

    //method preOrder -- data left right
    private void preOrder(IntTreeNode root ){
        //base case
        if(root == null) {
            return;
        }
        //print root's data
        System.out.print(root.data+ " ");

        //recurse left
        preOrder(root.left);
        //recurse right
        preOrder(root.right);
    }
    //method PostOrder
    private void postOrder(IntTreeNode root){
        //base case
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+ " ");
    }

    public void printPostOrder(){
        postOrder(overAllRoot);
    }

    //method InOrder
    private void inOrder(IntTreeNode root){
        //base case
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data+ " ");
        inOrder(root.right);
    }
    public void printInOrder(){
        inOrder(overAllRoot);
    }



    // set pattern pass in the topmost node in the tree
    // overallRoot
    public int getNumLevels()
    {
        return getNumLevels(overAllRoot);

    }
    // current is constantly changing node locations
    private int getNumLevels(IntTreeNode current)
    {
        // what is the base case
        if (current == null)
            return 0;

        int thisLevel = 1;
        // recurse left
        int leftLevels = getNumLevels(current.left);
        // recurse right
        int rightLevels = getNumLevels(current.right);

        if(leftLevels > rightLevels)
            return thisLevel + leftLevels;
        else
            return thisLevel + rightLevels;
    }
    // make public - private pair to sum up all nodes
    public int sumAll()
    {
        return sum(overAllRoot);

    }
    private int sum(IntTreeNode current)
    {
        // what is base
        if (current == null)
            return 0;

        int thisSum = current.data;
        int leftSum = sum(current.left);
        int rightSum = sum(current.right);

        return thisSum + leftSum + rightSum;

        // return current.data + sum(current.left) + sum(current.right);
    }

    //method getNumNodes
    private int getNumNodes(IntTreeNode current){
        // what is base
        if (current == null)
            return 0;
        return 1 + getNumNodes(current.left) + getNumNodes(current.right);
    }
    public int getNumNodes(){
        return getNumNodes(overAllRoot);
    }
}//end of IntTree



