package edu.problems.algoexpert.bst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class BSTTraversalTest {

    @Test
    public void testCase1() {
        BSTTraversal.BST root = new BSTTraversal.BST(10);
        root.left = new BSTTraversal.BST(5);
        root.left.left = new BSTTraversal.BST(2);
        root.left.left.left = new BSTTraversal.BST(1);
        root.left.right = new BSTTraversal.BST(5);
        root.right = new BSTTraversal.BST(15);
        root.right.right = new BSTTraversal.BST(22);

        List<Integer> inOrder =
                Arrays.asList(new Integer[] {1, 2, 5, 5, 10, 15, 22});
        List<Integer> preOrder =
                Arrays.asList(new Integer[] {10, 5, 2, 1, 5, 15, 22});
        List<Integer> postOrder =
                Arrays.asList(new Integer[] {1, 2, 5, 5, 22, 15, 10});

        Assert.assertTrue(
                BSTTraversal.inOrderTraverse(root, new ArrayList<Integer>()).equals(inOrder)
        );
        Assert.assertTrue(
                BSTTraversal.preOrderTraverse(root, new ArrayList<Integer>()).equals(preOrder)
        );
        Assert.assertTrue(BSTTraversal.postOrderTraverse(root, new ArrayList<Integer>())
                .equals(postOrder));
    }
}
