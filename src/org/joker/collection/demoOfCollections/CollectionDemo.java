package org.joker.collection.demoOfCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * a demo for ArrayList, LinkedList, HashMap, HashSet
 *
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-04-16 18:40
 */
public class CollectionDemo {
    public static void main(String[] args) {
        //ArrayList底层通过数组实现，可以实现随机快速存储，有index
        ArrayList<Integer> arrayList1 = new ArrayList();
        arrayList1.add(1);
        arrayList1.add(2);
        System.out.println(arrayList1.indexOf(2));
        System.out.println("ArrayList add elements:" + arrayList1);
        //LinkedList底层通过双向链表实现，元素有序,通过add方法添加元素，元素有index
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(3);
        System.out.println("index of element 1:" + linkedList.indexOf(1));
        System.out.println("LinkdedList add elements:" + linkedList);
        //HashMap通过键值对存储，通过put添加元素
        HashMap<Integer, String> hashMap = new HashMap<>(4);
        hashMap.put(0, "first");
        hashMap.put(1, "second");
        hashMap.put(5, "sixth");
        System.out.println("hashMap.size:" + hashMap.size());
        System.out.println("0:" + hashMap.get(0) + "\n1:" + hashMap.get(1) + "\n5:" + hashMap.get(5));

        //HashSet无序，没有index属性
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("abc");
        hashSet.add("xyz");
        System.out.println(hashSet.contains("xyz"));
    }
}

