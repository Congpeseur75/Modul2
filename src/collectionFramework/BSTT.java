package collectionFramework;
class TreeNodes {
    int val;
    TreeNodes left;
    TreeNodes right;

    public TreeNodes(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class BSTT {
    private TreeNodes root;

    public BSTT() {
        root = null;
    }

    public boolean delete(int val) {
        TreeNodes parent = null;
        TreeNodes current = root;

        while (current != null && current.val != val) {
            parent = current;
            if (val < current.val) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        if (current == null) {
            return false; // Element not found
        }

        if (current.left == null) {
            if (parent == null) {
                root = current.right;
            } else {
                if (val < parent.val) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            }
        } else {
            TreeNodes rightMost = current.left;
            TreeNodes parentOfRightMost = current;

            while (rightMost.right != null) {
                parentOfRightMost = rightMost;
                rightMost = rightMost.right;
            }

            current.val = rightMost.val;

            if (parentOfRightMost.right == rightMost) {
                parentOfRightMost.right = rightMost.left;
            } else {
                parentOfRightMost.left = rightMost.left;
            }
        }

        return true; // Element deleted
    }
}
