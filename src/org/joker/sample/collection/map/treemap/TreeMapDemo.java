package org.joker.sample.collection.map.treemap;

import java.util.TreeMap;

/**
 * a demo for TreeMap
 *
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-04-30 14:13
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        System.out.println("initial size: " + treeMap.size());

        treeMap.put(1, "Hello");
        treeMap.put(2, "Joker");
        System.out.println("treeMap size: " + treeMap.size());

        System.out.println(treeMap.toString());
    }
}

