package com.showsand.leetcode.offer;

import java.util.Stack;

/**
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
 * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 *
 **/
public class P9两个栈实现队列 {
}

class CQueue {

    //负责新增
    Stack<Integer> stack1;

    //负责弹出
    Stack<Integer> stack2;
    boolean flag;


    public CQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    public void appendTail(int value) {
         stack1.add(value);
    }

    public int deleteHead() {
        if (!stack2.isEmpty()){
            return stack2.pop();
        }
        Integer value = null;
        while (!stack1.isEmpty() && (value = stack1.pop())!=null){
            stack2.add(value);
        }
        if (stack2.isEmpty()){
            return -1;
        }
        return stack2.pop();


    }

}
