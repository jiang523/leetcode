package com.showsand.leetcode.offer;

import java.util.HashMap;
import java.util.Map;

/**
 给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，
 返回 true ；否则，返回 false 。

 单词必须按照字母顺序，通过相邻的单元格内的字母构成，
 其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。

 **/
public class P12矩阵中的路径 {
}
class Solution12 {
    int x=0;
    int y = 0;
    public boolean exist(char[][] board, String word) {
        this.x = board.length;
        if (x == 0){
            return false;
        }
        this.y = board[0].length;
        if (y == 0){
            return false;
        }
        for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                if (board[i][j] != word.charAt(0)){
                    continue;
                }
                boolean res = help(i, j, word, board);
                if (res){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean help(int i,int j,String word,char[][] board){
        if (word.length()==0){
            return true;
        }
        if (i >=x || i<0 || j<0 || j>=y){
            return false;
        }
        char value = board[i][j];
        if (value != word.charAt(0)){
            return false;
        }
        word = word.substring(1,word.length());
        //确保递归时不会访问到当前元素
        board[i][j] = '/';
        boolean res =  help(i,j-1,word,board)
                || help(i,j+1,word,board)
                || help(i+1,j,word,board)
                || help(i-1,j,word,board);
        //将当前元素改回原来的值
        board[i][j] = value;
        return res;
    }

    public static void main(String[] args) {
        final Solution12 solution12 = new Solution12();
       // char[][] board = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        char[][] board = new char[][]{{'a'}};
        System.out.println(solution12.exist(board,"ab"));
    }
}
