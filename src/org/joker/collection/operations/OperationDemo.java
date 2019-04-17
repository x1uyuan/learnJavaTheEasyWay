package org.joker.collection.operations;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合取交集，并集，差集，去重复集
 *
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-04-17 10:41
 */
public class OperationDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        // 并集
//        list1.addAll(list2);
        // 交集
//        list1.retainAll(list2);
        // 差集
//        list1.removeAll(list2);
        // 无重复并集
        list2.removeAll(list1);
        list1.addAll(list2);
        for (Integer i : list1) {
            System.out.println(i);
        }

        long end = System.currentTimeMillis();
        System.out.println("程序运行时间： " + (end - start) + "ms");
    }
}

