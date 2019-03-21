package com.passer._0321;

/*
Given a binary tree, flatten it to a linked list in-place.
For example, given the following tree:
    1
   / \
  2   5
 / \   \
3   4   6
The flattened tree should look like:
1
 \
  2
   \
    3
     \
      4
       \
        5
         \
          6
*/
public class Flatten {
	public void flatten(TreeNode root) {
		helper(root);
	}

	private TreeNode helper(TreeNode root) {
		if (root == null)
			return null;
		TreeNode ans = helper(root.left);
		root.left = helper(root.right);
		root.right = ans;
		ans = root;
		while (ans.right != null) {
			ans = ans.right;
		}
		ans.right = root.left;
		root.left = null;
		return root;
	}
}