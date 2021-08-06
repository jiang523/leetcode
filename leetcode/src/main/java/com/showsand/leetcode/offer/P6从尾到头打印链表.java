package com.showsand.leetcode.offer;

import com.showsand.leetcode.util.ListNode;

import java.util.Collections;
import java.util.Stack;

/**
 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 * @author jiangwc33446
 * */
public class P6从尾到头打印链表 {
}
class Solution6 {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head!=null){
            stack.add(head.val);
            head = head.next;
        }
        int[] array = new int[stack.size()];
        for (int i=0;i<array.length;i++){
            array[i] = stack.pop();
        }
        return array;
    }
}


