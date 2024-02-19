package collectionFramework;

public class TreeNode<E> {
    protected E element;
    protected TreeNodes<E> left;
    protected TreeNodes<E> right;

    public TreeNode(E e) {
        element = e;
    }
}
