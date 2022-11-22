package day42_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedListQueueDataTuru {
    public static void main(String[] args) {

        Queue<String> q1=new LinkedList<>();
        q1.add("H");
        q1.add("Y");

        q1.offer("K");

        System.out.println(q1.remove());

        System.out.println(q1.remove("K"));


        System.out.println(q1.remove());
        System.out.println(q1.remove());
        q1.poll();


        System.out.println(q1);


    }
}
