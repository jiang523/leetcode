package com.showsand.leetcode.offer;

/**
 *在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 **/
public class P4二维数组中的查找 {
}
class Solution4{
    public boolean findNumberIn2DArray(int[][] matrix, int target) {

        int xLen = matrix.length;

        if (xLen == 0){
            return false;
        }

        int yLen = matrix[0].length;

        if (yLen == 0){
            return false;
        }

        for (int i=0;i<xLen;i++){
            if (matrix[i][0] > target){
                return false;
            }
            for (int j=0;j<yLen;j++){
                if (matrix[i][j] > target){
                    break;
                }
                if (matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
