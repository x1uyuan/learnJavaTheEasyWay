package org.joker.sample.collection.set.treeset;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * a demo for TreeSet
 * 底层结构为红黑树（特殊的二叉查找树）,具有排序功能
 *
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-04-30 13:27
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        System.out.println("TreeSet初始化容量大小：" + treeSet.size());

        //元素添加：
        treeSet.add("my");
        treeSet.add("name");
        treeSet.add("joker");
        treeSet.add("hello");
        treeSet.add("world");
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("3");
        System.out.println("TreeSet容量大小：" + treeSet.size());
        System.out.println("TreeSet元素顺序为：" + treeSet.toString());

        //增加for循环遍历：
        for (String str : treeSet) {
            System.out.println("遍历元素：" + str);
        }

        //迭代器遍历：升序 1, 2, 3, hello, joker, my, name, world
        Iterator<String> iteratorAesc = treeSet.iterator();
        while (iteratorAesc.hasNext()) {
            String str = iteratorAesc.next();
            System.out.println("遍历元素升序：" + str);
        }

        //迭代器遍历：降序
        Iterator<String> iteratorDesc = treeSet.descendingIterator();
        while (iteratorDesc.hasNext()) {
            String str = iteratorDesc.next();
            System.out.println("遍历元素降序：" + str);
        }

        //元素获取:实现NavigableSet接口
        //获取TreeSet头节点
        String firstEle = treeSet.first();
        System.out.println("TreeSet头节点为：" + firstEle);

        // 获取指定元素之前的所有元素集合：(不包含指定元素)
        SortedSet<String> headSet = treeSet.headSet("joker");
        System.out.println("joker：" + headSet.toString());

        //获取给定元素之间的集合：（包含头，不包含尾）
        SortedSet subSet = treeSet.subSet("1", "joker");
        System.out.println("1--joker：" + subSet.toString());

        //集合判断：
        boolean isEmpty = treeSet.isEmpty();
        System.out.println("TreeSet是否为空：" + isEmpty);
        boolean isContain = treeSet.contains("who");
        System.out.println("TreeSet是否包含who元素：" + isContain);

        //元素删除：
        boolean jokerRemove = treeSet.remove("joker");
        System.out.println("joker" + jokerRemove);

        //集合中不存在的元素，删除返回false
        boolean whoRemove = treeSet.remove("who");
        System.out.println("who元素是否被删除" + whoRemove);

        //删除并返回第一个元素：如果set集合不存在元素，则返回null
        String pollFirst = treeSet.pollFirst();
        System.out.println("删除的第一个元素：" + pollFirst);

        //删除并返回最后一个元素：如果set集合不存在元素，则返回null
        String pollLast = treeSet.pollLast();
        System.out.println("删除的最后一个元素：" + pollLast);

        treeSet.clear();//清空集合:
    }
}

