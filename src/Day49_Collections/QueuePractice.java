package Day49_Collections;

import java.util.*;

public class QueuePractice {

    public static void main(String[] args) {
//duplicates are allowed

        Queue<Integer> priorityQueue = new PriorityQueue<>();  //order of the queue is random
        priorityQueue.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("priorityQueue = " + priorityQueue);


        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("arrayDeque = " + arrayDeque);


        Queue<Integer> LinkedList = new LinkedList<>();
        LinkedList.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("LinkedList = " + LinkedList);


    }
}
