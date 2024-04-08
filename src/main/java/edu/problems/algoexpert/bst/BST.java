package edu.problems.algoexpert.bst;

public class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
        this.value = value;
    }

    public BST insert(int value) {
        BST currentNode = this;
        while (true) {
            if (currentNode.value > value) {
                if (currentNode.left != null) {
                    currentNode = currentNode.left;
                } else {
                    currentNode.left = new BST(value);
                    break;
                }
            } else {
                if (currentNode.right != null) {
                    currentNode = currentNode.right;
                } else {
                    currentNode.right = new BST(value);
                    break;
                }
            }
        }
        return this;
    }

    public boolean contains(int value) {
        if (this.value > value) {
            if (this.left == null) {
                return false;
            }
            return this.left.contains(value);
        } else if (this.value < value) {
            if (this.right == null) {
                return false;
            }
            return this.right.contains(value);
        } else {
            return true;
        }
    }

    public BST remove(int value) {
        if (this.left == null && this.right == null) {
            return this;
        }
        BST currentNode = this;
        BST parent = this;
        while (currentNode != null) {
            if (currentNode.value > value) {
                parent = currentNode;
                currentNode = currentNode.left;
            } else if (currentNode.value < value) {
                parent = currentNode;
                currentNode = currentNode.right;
            } else {
                BST nodeToDelete = currentNode;

                if (currentNode.left == null && currentNode.right == null) {
                    if (parent.value > currentNode.value) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                    break;
                }
                if (currentNode.right == null) {
                    currentNode = currentNode.left;
                    nodeToDelete.left = currentNode.left;
                    nodeToDelete.value = currentNode.value;
                    break;
                }
                parent = currentNode;
                currentNode = currentNode.right;
                if (currentNode.left == null) {
                    nodeToDelete.right = currentNode.right;
                    nodeToDelete.value = currentNode.value;;
                    break;
                }
                while (currentNode.left != null) {
                    parent = currentNode;
                    currentNode = currentNode.left;
                }
                parent.left = null;
                nodeToDelete.value = currentNode.value;;
                break;
            }
        }
        return this;
    }
}
