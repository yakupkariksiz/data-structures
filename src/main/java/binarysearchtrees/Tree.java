package binarysearchtrees;

class Tree {
    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subTreeRoot, int value) {
        if (subTreeRoot == null) {
            return subTreeRoot;
        }

        if (value < subTreeRoot.getData()) {
            subTreeRoot.setLeft(delete(subTreeRoot.getLeft(), value));
        } else if (value > subTreeRoot.getData()) {
            subTreeRoot.setRight(delete(subTreeRoot.getRight(), value));
        } else {
            // Cases 1 and 2: node to delete has 0 or 1 child(ren)
            if (subTreeRoot.getLeft() == null) {
                return subTreeRoot.getRight();
            } else if (subTreeRoot.getRight() == null) {
                return subTreeRoot.getLeft();
            }

            // case 3: node to delete has 2 children

            // Replace the value in the subtreeRoot node with the smallest value from the right subtree
            subTreeRoot.setData(subTreeRoot.getRight().min());
            subTreeRoot.setRight(delete(subTreeRoot.getRight(), subTreeRoot.getData()));
        }
        return subTreeRoot;
    }

    public int min() {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return root.min();
    }

    public int max() {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        return root.max();
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }

    public void traversePreOrder() {
        if (root != null) {
            root.traversePreOrder();
        }
    }
}
