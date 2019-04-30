package org.joker.sample.collection.list.vector;

import java.util.Stack;

/**
 * a demo for Stack
 *
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-04-30 13:46
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println("栈大小" + stack.size());
        System.out.println("栈初始容量" + stack.capacity());
        stack.push("hello");
        stack.push("joker");
        System.out.println("栈顶元素： " + stack.peek());
        System.out.println("栈大小" + stack.size());
        System.out.println("栈顶元素： " + stack.pop());
        System.out.println("栈大小" + stack.size());
    }


}

