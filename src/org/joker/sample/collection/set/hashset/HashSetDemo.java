package org.joker.sample.collection.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * a demo for HashSet
 * 当获取HashSet中某个元素时，只能通过遍历集合的方式进行equals()比较来实现
 *
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-04-30 13:09
 */
public class HashSetDemo {
    public static void main(String[] args) {
        //创建HashSet集合：
        Set<String> hashSet = new HashSet<>();
        System.out.println("HashSet初始容量大小："+hashSet.size());

        //元素添加：
        hashSet.add("my");
        hashSet.add("name");
        hashSet.add("is");
        hashSet.add("joker");
        hashSet.add(",");
        hashSet.add("hello");
        hashSet.add("world");
        hashSet.add("!");
        System.out.println("HashSet容量大小："+hashSet.size());

        //迭代器遍历：
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
        //增强for循环
        for(String str:hashSet){
            if("joker".equals(str)){
                System.out.println("你就是我想要的元素:"+str);
            }
            System.out.println(str);
        }

        //元素删除：
        hashSet.remove("joker");
        System.out.println("HashSet元素大小：" + hashSet.size());
        hashSet.clear();
        System.out.println("HashSet元素大小：" + hashSet.size());

        //集合判断：
        boolean isEmpty = hashSet.isEmpty();
        System.out.println("HashSet是否为空：" + isEmpty);
        boolean isContains = hashSet.contains("hello");
        System.out.println("HashSet是否为空：" + isContains);
        // 添加重复元素,只保留一个元素
        // hashSet大小：1
        hashSet.add("joker");
        hashSet.add("joker");
        System.out.println("hashSet大小：" + hashSet.size());
    }
}

