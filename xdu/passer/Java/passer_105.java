package com.passer._0322;

import java.util.HashMap;
public class PreIn {
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || inorder == null) 
            return null;
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i],i);
        }
        return buildTree(preorder,0,preorder.length - 1,inorder,0,inorder.length - 1);
    }
    public TreeNode buildTree(int[] preorder,int pStart,int pEnd,int[] inorder,int iStart,int iEnd){
        if(pStart > pEnd) return null;
        TreeNode root = new TreeNode(preorder[pStart]);
        int rootIndex = map.get(preorder[pStart]);
        int tmp = rootIndex - iStart + pStart + 1;
        root.left = buildTree(preorder,pStart + 1,tmp - 1,inorder,iStart,rootIndex - 1);
        root.right = buildTree(preorder,tmp,pEnd,inorder,rootIndex + 1,iEnd);
        return root;
    }
}
