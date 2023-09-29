package dz.learnjava.collectionsCourse.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
//        collection.add("a");
//        collection.add("b");
//        collection.add("c");
        Collections.addAll(collection, "a", "b", "c");

        collection.remove("a");

        System.out.println(collection);
        System.out.println(collection.size());

        // Clear the collection
        collection.clear();
        System.out.println(collection.isEmpty());

        var containsB = collection.contains("b");
        System.out.println(containsB);

        var objectArray = collection.toArray(); // return array of objects
        var stringArray = collection.toArray(new String[0]); // return array of strings
        stringArray[1].toLowerCase();

        //Comparing between collections
        Collection<String> other = new ArrayList<>();
        other.addAll(collection);
        System.out.println(collection.equals(other));

    }
}
