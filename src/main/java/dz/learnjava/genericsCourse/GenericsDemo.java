package dz.learnjava.genericsCourse;

public class GenericsDemo {

    public static void show() {

        // Problem: we can not add other objects
        var list = new List();
        list.add(1);

        // First solution: List of objects
        var listObject = new ListObject();
        listObject.add(1); //the compiler will convert it to Integer.valueOf(1)
        listObject.add("hello");
        listObject.add(new User());

        // Second solution: use Generic Classes
        var genericList = new GenericList<User>();
        genericList.add(new User());

        // Create Generic types that work with primitives
        GenericList<Integer> numbers = new GenericList<>();
        numbers.add(1); // Called Boxing
        int number = numbers.get(0); // Called Unboxing
        System.out.println( );
    }
}
