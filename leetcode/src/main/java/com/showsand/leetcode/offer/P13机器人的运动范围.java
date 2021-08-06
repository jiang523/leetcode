package com.showsand.leetcode.offer;

/**
 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。
 一个机器人从坐标 [0, 0] 的格子开始移动，
 它每次可以向左、右、上、下移动一格（不能移动到方格外），
 也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，
 机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。
 但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
 *
 * @author jiangwc33446*/
public class P13机器人的运动范围 {
}
class Solution13 {
    public int movingCount(int m, int n, int k) {
        int[][] array = new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                array[i][j] = 0;
            }
        }
        return dfs(0,0,k,array);
    }

    public int dfs(int i,int j,int k,int[][] array){
        if (i<0 || j< 0 || i>=array.length || j>=array[0].length || array[i][j] ==-1){
            return 0;
        }
        if (judge(i,j,k)){
            return 0;
        }
        //将当前节点改为已访问过
        array[i][j] = -1;

        //遍历四个维度访问到的节点数量之和相加，再加上当前节点数量
        int a = dfs(i+1,j,k,array);
        int b = dfs(i-1,j,k,array);
        int c = dfs(i,j+1,k,array);
        int d = dfs(i,j-1,k,array);
        return a+b+c+d+1;
    }

    public boolean judge(int i,int j,int k){
        return count(i) + count(j) > k;
    }
    public int count(int num){
        int a = num /100;
        int b = (num - a*100) /10;
        int c = num % 10;
        return a+b+c;
    }

    public static void main(String[] args) {
        final int i = new Solution13().movingCount(2, 3, 1);
        System.out.println(i);
    }
}
