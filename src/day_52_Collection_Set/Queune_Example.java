package day_52_Collection_Set;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queune_Example {
    public static void main(String[] args) {
        Queue<String> queue=new PriorityQueue<>();
        queue.offer("Harun");
        queue.offer("Ozlem");
        queue.offer("Emre");

        System.out.println(queue);
        queue.add("ben");
        System.out.println(queue);


    }


}
