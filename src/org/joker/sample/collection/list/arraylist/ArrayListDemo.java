package org.joker.sample.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * a classic demo for ArrayList
 *
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-04-17 18:17
 */
public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.printf("Before add:arraylist.size() = %d\n",arrayList.size());

        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(9);
        System.out.printf("After add:arraylist.size() = %d\n",arrayList.size());

        System.out.println("Printing elements of arraylist");
        // 三种遍历方式打印元素
        // 第一种：通过迭代器遍历
        System.out.print("通过迭代器遍历:");
        Iterator<Integer> it = arrayList.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 第二种：通过索引值遍历
        System.out.print("通过索引值遍历:");
        for(int i = 0; i < arrayList.size(); i++){
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        // 第三种：for循环遍历
        System.out.print("for循环遍历:");
        for(Integer number : arrayList){
            System.out.print(number + " ");
        }
        // 换行
        System.out.println();

        // toArray用法
        // 第一种方式(最常用)
        Integer[] integer = arrayList.toArray(new Integer[0]);
        for (int i = 0; i < integer.length; i++) {
            System.out.println("integer"+"["+i+"]:"+integer[i]);
        }

        // 第二种方式(容易理解)
        Integer[] integer1 = new Integer[arrayList.size()];
        arrayList.toArray(integer1);
        for (int i = 0; i < integer1.length; i++) {
            System.out.println("integer1"+"["+i+"]:"+integer[i]);
        }

        // 抛出异常，java不支持向下转型
        //Integer[] integer2 = new Integer[arraylist.size()];
        //integer2 = arraylist.toArray();
        System.out.println();

        // 在指定位置添加元素
        arrayList.add(2,2);
        // 删除指定位置上的元素
        arrayList.remove(2);
        // 删除指定元素
        arrayList.remove((Object)3);
        // 判断arrayList是否包含5
        System.out.println("ArrayList contains 5 is: " + arrayList.contains(5));

        // 清空ArrayList
        arrayList.clear();
        // 判断ArrayList是否为空
        System.out.println("ArrayList is empty: " + arrayList.isEmpty());
    }
}

