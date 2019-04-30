package org.joker.sample.collection.util.collections;

import java.util.*;

/**
 * a demo for unmodified Collection
 *
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-04-16 14:53
 */
public class CollectionsUnmodifiedDemo {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(-5);
        arrayList.add(7);
        arrayList.add(3);
        arrayList.add(-9);
        arrayList.add(-7);
        HashSet<Integer> integers1 = new HashSet<>();
        integers1.add(1);
        integers1.add(3);
        integers1.add(2);
        Map scores = new HashMap();
        scores.put("语文", 80);
        scores.put("Java", 82);

        //Collections.emptyXXX();创建一个空的、不可改变的XXX对象
        List<Object> list = Collections.emptyList();
        System.out.println(list);
        //[]
        Set<Object> objects = Collections.emptySet();
        System.out.println(objects);
//        //[]
        Map<Object, Object> objectObjectMap = Collections.emptyMap();
        System.out.println(objectObjectMap);
//        //{}
//
//        //Collections.singletonXXX();
        List<ArrayList<Integer>> arrayLists = Collections.singletonList(arrayList);
        System.out.println(arrayLists);
//        //[[-1, 3, 3, -5, 7, 4, -9, -7]]
//        //创建一个只有一个元素，且不可改变的Set对象
        Set<ArrayList<Integer>> singleton = Collections.singleton(arrayList);
        System.out.println(singleton);
//        //[[-1, 3, 3, -5, 7, 4, -9, -7]]
        Map<String, String> nihao = Collections.singletonMap("1", "nihao");
        System.out.println(nihao);
//        //{1=nihao}
//
//        //unmodifiableXXX();创建普通XXX对象对应的不可变版本
        List<Integer> integers = Collections.unmodifiableList(arrayList);
        System.out.println(integers);
//        //[-1, 3, 3, -5, 7, 4, -9, -7]
        Set<Integer> integers2 = Collections.unmodifiableSet(integers1);
        System.out.println(integers2);
//        //[1, 2, 3]
        Map<Object, Object> objectObjectMap2 = Collections.unmodifiableMap(scores);
        System.out.println(objectObjectMap2);
        //{Java=82, 语文=80}

        //添加出现异常：java.lang.UnsupportedOperationException
        try {
            list.add(1);
            arrayLists.add(arrayList);
            integers.add(1);
        } catch (Exception e){
            System.out.println("------------------------------------------");
            e.printStackTrace();
//            System.out.println();
            System.out.println("\n------------------------------------------");
        } finally {
            System.out.println("This is finally!");
        }

        long end=System.currentTimeMillis();
        System.out.println("程序运行时间： "+(end-start)+"ms");
    }
}

