Problem:
---
### Binary Tree Level Order Traversal
Given a binary tree, return the level order traversal of its nodes' values.
(ie: from left to right, level by level).

For example:
Given binary tree
[3,9,20,null,null,15,7]
    &emsp;3
   &ensp;/&ensp; \
  9&ensp;20
  &ensp;  / &ensp; \
  &ensp; 15 &ensp;7
return its level order traversal as:
[
&ensp;[3],
&ensp;[9,20],
&ensp;[15,7]
]

Code:
---
```
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<List<Integer>> listAll = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        levelOrder(root,0);
        return listAll;
    }

    public void levelOrder(TreeNode root,int depth){
        if(root == null) return;
        List<Integer> list = null;
        if(depth == listAll.size()) {
            list = new ArrayList<>();
            listAll.add(list);
        }
        else {
            list = listAll.get(depth);
        }
        list.add(root.val);
        levelOrder(root.left,depth + 1);
        levelOrder(root.right,depth + 1);
    }
}
```
