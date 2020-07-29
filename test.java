
public class Test {

    public static void main(String[] args) 
    {
        LinkedBinaryTree<String> tree1 = new LinkedBinaryTree("Second");
        LinkedBinaryTree<String> tree2 = new LinkedBinaryTree("Third");
        
        //Creating a [3rd] tree using the 1st tree as the left-hand-side subtree and the 2nd tree
        //as the right-hand-side subtree. Thus this [new] tree should have 3 nodes / elements.
        LinkedBinaryTree<String> tree3 = new LinkedBinaryTree("First", tree1, tree2);
        //System.out.println(tree3.size());
        
        //Accessing nodes / elements of our third tree (using various methods).
        System.out.println("Root = " + tree3.getRootElement());
        System.out.println("L = " + tree3.getRootNode().getLeft().getElement());
        System.out.println("R = " + tree3.getRootNode().getRight().getElement());
        
        //Should return 'true' since this element is found within 'tree3's right subtree.
        System.out.println(tree3.contains("Third"));
        
        //Should return 'false' given that this element isn't 'tree3's root element 
        //nor is it in either of the left and right side subtrees.
        System.out.println(tree3.contains("Fourth"));
    }


}