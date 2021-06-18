// https://en.wikipedia.org/wiki/Linked_list
// https://www.runoob.com/java/java-linkedlist.html
// https://stackoverflow.com/questions/322715/when-to-use-linkedlist-over-arraylist-in-java#:~:text=LinkedList%20is%20fast%20for%20adding,depth%2C%20as%20does%20Linked%20List
// LinkedList is faster in add and remove, but slower in get. In brief, LinkedList should be preferred if:
// 1. There are no large number of random access of element
// 2. There are a large number of add/remove operations

package com.company;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> product = new LinkedList<>();
        product.add("Volvo");
        product.add("BMW");
        product.add("Ford");
        product.add("Mazda");
        System.out.println(product);
    }
}
