package day48_Collections;

import java.util.ArrayList;
import java.util.List;

/*
Arrays accept both primitives and non primitives, size is fixed

list accepts only non primitives, size is dynamic
List(I)
- ArrayList internally uses array, fastest for accessing any of the elements, the most common in any company
- LinkedList has a pointer from each element to the next element, fastest for adding and removing elements
- Vector class internally uses array, but the synchronization is thread safe
- Stack is a child class of vector, it is synchronized like vector, last in first out order

//muhtars notses:
ArrayList vs LinkedList vs Vector vs Stack:

        All of them are List (allows duplicates, has index)

        ArrayList: searching elements are faster

        LinkedList: insertion & deletion of elements are faster

        Vector: Same as ArrayList but Synchronized

        Stack: Has Last-in-first-out (LIFO) logic

 */
public class ListCollections {

    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>();



    }
}
