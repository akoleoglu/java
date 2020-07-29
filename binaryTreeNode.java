public class BinaryTreeNode<T>
{
    protected T element;
    protected BinaryTreeNode<T> left, right;

    public BinaryTreeNode(T obj)
    {   
        this(obj, null, null);   
    }
    
    public BinaryTreeNode(T obj, LinkedBinaryTree<T> leftSubTree, 
                                 LinkedBinaryTree<T> rightSubTree) 
    {
        element = obj;
        
        if (leftSubTree == null)
            left = null;
        else
            left = leftSubTree.getRootNode();
        
        if (rightSubTree == null)
            right = null;
        else
            right = rightSubTree.getRootNode();
    }
    
    public T getElement() 
    { 
        return element; 
    }
    
    public BinaryTreeNode<T> getLeft()
    { 
        return left; 
    }
    
    public void setLeft(BinaryTreeNode<T> node)
    { 
        left = node; 
    }
    
    public BinaryTreeNode<T> getRight()
    { 
        return right; 
    }
    
    public void setRight(BinaryTreeNode<T> node) 
    { 
        right = node; 
    }

    //NOTE: This function will always work out, 
    //regardless of whether the node is a root, leaf, etc.
    public int numChildren() 
    {
        int result = 0;

        //Will recursively check every left and right side child until
        //we reach the leaf nodes. Everytime this function is called, 
        //'result' will essentially increase by one, for each non-null child.
        if (left != null)
            result += 1 + left.numChildren();

        if (right != null)
            result += 1 + right.numChildren();

        return result;
    }
}