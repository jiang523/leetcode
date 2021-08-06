package com.showsand.leetcode.offer;

import com.showsand.leetcode.util.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。

 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。


 **/
public class P7重建二叉树 {
}
class Solution7 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length==0 || inorder.length == 0){
            return null;
        }
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        for (int i=0;i<preorder.length;i++){
            pre.add(preorder[i]);
            in.add(inorder[i]);
        }
        return help(pre,in);

    }
    public TreeNode help(List<Integer> preorder, List<Integer> inorder){
        if (preorder.size() == 0 || inorder.size() == 0){
            return null;
        }
        if (preorder.size() == 1){
            return new TreeNode(preorder.get(0));
        }
        int val = preorder.get(0);
        int index = inorder.lastIndexOf(val);
        TreeNode root = new TreeNode(val);
        root.left = help(preorder.subList(1,index+1),inorder.subList(0,index));
        root.right = help(preorder.subList(index+1,preorder.size()),inorder.subList(index+1,inorder.size()));
        return root;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new Solution7().buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        System.out.println(treeNode);
    }
}
