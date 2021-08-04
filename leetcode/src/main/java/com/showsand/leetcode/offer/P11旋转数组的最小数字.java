package com.showsand.leetcode.offer;

/**
 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。  

 **/
public class P11旋转数组的最小数字 {
}

class Solution {
    public int minArray(int[] numbers) {

        if (numbers.length == 0){
            return 0;
        }
        int min = numbers[0];
        for (int i=0;i<numbers.length;i++){
            if (numbers[i] >= min){
                continue;
            }else {
                return numbers[i];
            }
        }
        return min;
    }
}
