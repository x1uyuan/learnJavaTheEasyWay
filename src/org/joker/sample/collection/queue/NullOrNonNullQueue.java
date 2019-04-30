package org.joker.sample.collection.queue;

import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * a demo expalains the difference between nullable and nonNullable
 * queue when adding an element to them
 *
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-04-19 10:27
 */
class NullOrNonNullQueue {

    public static void main(String[] args) {
//        java.lang.NullPointerException
//        at java.util.AbstractQueue.add(AbstractQueue.java:95)
        try {
            ArrayBlockingQueue<String> abq = new ArrayBlockingQueue<>(5);
            String str1 = null;
            abq.add(str1);
            for (String a : abq) {
                System.out.println(a);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
//        null
//        helloWorld!
        try {
            LinkedList<String> ll = new LinkedList<>();
            String str2 = null;
            String str3 = "helloWorld!";
            ll.add(str2);
            ll.add(str3);
            for (String a : ll){
                System.out.println(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


