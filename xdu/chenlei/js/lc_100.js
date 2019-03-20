    
/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} p
 * @param {TreeNode} q
 * @return {boolean}
 */
var isSameTree = function(p, q) {
    
    // 几种特殊情况先判断
    if(p == null && q == null){
        return true;
    }else if(p != null && q == null){
        return false;
    }else if(p == null && q != null){
        return false;
    }else{

        // 判断val是否相等
        if(p.val != q.val){
            return false;
        }

        // 递归遍历所有子节点 并判断val是否相等
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
};