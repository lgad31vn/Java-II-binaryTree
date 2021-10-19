/* Nam Phu Nguyen (Logan)
   IT220-JAVA II 
   Programming Assignment
 */ 

//purpose is to create binary tree
public class TreeTester {
    public static void main(String[] args) {
        // Instantiate an IntTreeNode
        IntTreeNode overallRoot = new IntTreeNode(90);
        //create left child that has 2 with its children 1, 3
        overallRoot.left = new IntTreeNode(80,new IntTreeNode(70), new IntTreeNode(85));
        //create right child that has 5
        overallRoot.right = new IntTreeNode(100, new IntTreeNode(98), new IntTreeNode(120));


        //construct an IntTree and pass in the overallRoot
        IntTree tree = new IntTree(overallRoot);

        //call inOrder
        System.out.print("In Order: ");
        tree.printInOrder();
        System.out.println();

        //call printPreOrder
        System.out.print("Pre Order: ");
        tree.printPreOrder();
        System.out.println();

        //call postOrder
        System.out.print("Post Order: ");
        tree.printPostOrder();
        System.out.println();



        // call getNumLevels
        System.out.println();
        System.out.println("numLevels = "+ tree.getNumLevels());


        //call getNumNodes
        System.out.print("numNodes = " +tree.getNumNodes());

        System.out.println();

        // call sumAll()
//      System.out.println("Sum: " + tree.sumAll());





    }
}
