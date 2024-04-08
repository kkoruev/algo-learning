package edu.problems.algoexpert.bst;

import org.junit.Assert;
import org.junit.Test;

public class BSTTest {

    @Test
    public void testCase1() {
        BST root = new BST(10);
        root.left = new BST(5);
        root.left.left = new BST(2);
        root.left.left.left = new BST(1);
        root.left.right = new BST(5);
        root.right = new BST(15);
        root.right.left = new BST(13);
        root.right.left.right = new BST(14);
        root.right.right = new BST(22);

        root.insert(12);
        Assert.assertEquals(12, root.right.left.left.value);

        root.remove(10);
        Assert.assertFalse(root.contains(10));
        Assert.assertEquals(12, root.value);

        Assert.assertTrue(root.contains(15));
    }

    @Test
    public void testCase2() {
        BST root = new BST(10);
        root.insert(5);
        root.insert(15);
        root.remove(5);
        root.remove(15);
        root.remove(10);

        Assert.assertFalse(root.contains(5));
        Assert.assertFalse(root.contains(15));
        Assert.assertTrue(root.contains(10));

    }

    @Test
    public void testCase3() {
        BST root = new BST(10);
        root.insert(5);
        root.insert(15);
        root.remove(10);

        Assert.assertFalse(root.contains(10));
        Assert.assertTrue(root.contains(15));
        Assert.assertTrue(root.contains(5));
    }

    @Test
    public void testCase5() {
        BST root = new BST(1);
        root.insert(-2);
        root.insert(-3);
        root.insert(-4);
        root.remove(1);

        Assert.assertFalse(root.contains(1));
    }
}
