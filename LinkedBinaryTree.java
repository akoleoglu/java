public class LinkedBinaryTree<T> implements TreeADT<T>
{
    protected BinaryTreeNode<T> root; 

    public LinkedBinaryTree()
    {
        root = null;
        
    }
    
    public LinkedBinaryTree(T element) 
    {
        root = new BinaryTreeNode<T>(element);
    }
    
    public LinkedBinaryTree(T element, LinkedBinaryTree<T> left, LinkedBinaryTree<T> right) 
    {
        root = new BinaryTreeNode<T>(element);
        
        //NOTE: Okay if either 'root' are null.
        root.setLeft(left.root);
        root.setRight(right.root);
    }
    
    public BinaryTreeNode<T> getRootNode()
    {
        if(root == null)
            throw new RuntimeException("Empty tree.");
        
        return root;
    }
    
    public T getRootElement() 
    {
        if(root == null)
            throw new RuntimeException("Empty tree.");
        
        return root.getElement();
    }
    
    //TODO: Implement "getLeft" method.
    
    public LinkedBinaryTree<T> getLeft() {
    	if(getRootElement() != null) {
    		left = 
    	}
    
    		
    	
    }
    
    //TODO: Implement "getRight" method.
    public T getRight() {
    	
    }

    //TODO: Implement "isEmpty" method.
    public T isEmpty() {
    	
    }
    //TODO: Implement "size" method.
    public int size() {
    	
    }
    
    /*
     *  TODO: Implement "getHeight" method.
     *  
     *  TIP: Create a [private] helper function that utilizes recursion.
     *       For example, "private int height(BinaryTreeNode<T> node);"
     */
    
    public int getHeight() {
    	private int height(BinaryTreeNode<T>) {
    		
    	}
    	
    }

    //TODO: Implement "contains" method.
    
    public T contains() {
    	
    }

    public T find(T target) 
    {
        BinaryTreeNode<T> current = findNode(target, root);
        
        if (current == null)
            throw new RuntimeException("Element " + target + " in NOT in LinkedBinaryTree.");
        
        return (current.getElement());
    }
    
    private BinaryTreeNode<T> findNode(T target, BinaryTreeNode<T> next)
    {
        if (next == null) 
            return null;
        
        if (next.getElement().equals(target))
            return next;
        
        BinaryTreeNode<T> temp = findNode(target, next.getLeft());
        
        if (temp == null)
            temp = findNode(target, next.getRight());
        
        return temp;
    }
}