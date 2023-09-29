package dz.learnjava.collectionsCourse.iterable;

public class IterableInterface {

    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("a");
        list.add("b");
        for (var item: list.items){
            System.out.println(item);
        } // The problem here ==> that if we make a changes in "items", it will affect the others

        var list1 = new GenericList<String>();
        list1.items[0] = "a";
        System.out.println(list1.items.length);

        // The Iterable Interface
        var list2 = new GenericListIterable<String>();
        var iterator = list2.iterator();
        // [a, b, c]
        //  ^
        while(iterator.hasNext()) {
            var current = iterator.next();
            System.out.println(current);
        }

        for(var item: list2) {
            System.out.println(item);
        }
        // Have the same bytecode as the While loop
        // The benefit of implementing Iterable is it allows us to iterate over an
        // object without knowing anything about its internal implementation

    }


}
