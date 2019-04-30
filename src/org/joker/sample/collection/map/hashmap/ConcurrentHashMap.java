package org.joker.sample.collection.map.hashmap;

/**
 * a demo for ConcurrentHashMap
 * 分段锁： 容器中有多把锁，每一把锁锁一段数据，这样在多线程访问时不同段的数据时，就不会存在锁竞争了
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-04-30 13:57
 */
public class ConcurrentHashMap {
    public static void main(String[] args) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        concurrentHashMap.put("a", 123);
        concurrentHashMap.put(123, "abc");
        System.out.println(concurrentHashMap.get("a"));
        System.out.println(concurrentHashMap.get(123));
    }
}

