package dz.learnjava.collectionsCourse.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add(0, "?");
        Collections.addAll(list, "a", "b", "c", "a");
        list.set(1, "b+");
        list.remove(0);
        System.out.println(list.get(0));
        System.out.println(list.indexOf("a"));
        System.out.println(list.indexOf("c+")); // return -1 because it doesn't exist
        System.out.println(list.lastIndexOf("c+"));
        System.out.println(list.subList(0, 2));


    }
}
