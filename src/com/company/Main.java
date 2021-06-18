// https://en.wikipedia.org/wiki/Linked_list
// https://www.runoob.com/java/java-linkedlist.html
// https://stackoverflow.com/questions/322715/when-to-use-linkedlist-over-arraylist-in-java#:~:text=LinkedList%20is%20fast%20for%20adding,depth%2C%20as%20does%20Linked%20List

package com.company;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> inventory = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            inventory.addFirst(1);
            inventory.add(2);
            System.out.println(inventory);
        }

        for (int i = 0; i < 10; i++) {
            inventory.removeFirst();
            inventory.remove();
            System.out.println(inventory);
        }
    }
}
