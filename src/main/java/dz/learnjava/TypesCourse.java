package dz.learnjava;

import java.awt.*;
import java.util.Date;

public class TypesCourse {
    public static void main(String[] args) {
//        int age = 30;
        byte age = 30;
        int viewsCount = 123_456_351;
        long largeViewsCount = 5_123_456_351L; // even if we declare it as long the compiler still read it
                                               // as int (by default) ==> So we add "L" in the end of the number

        System.out.println("Hello Java World !!!");
        System.out.println("\nMy age is: " + age);

        float price = 10.99F; // Java sees (by default) this number as double ==> so we have to add "F"
        char letter = 'A';
        boolean isEligible = false; // Reserved keywords in java

        // Reference Types
        Date now = new Date();
        System.out.println("The date is: " + now);

        // Primitive types VS Reference types

        // 1- Primitive types
        byte x = 1;
        byte y = x;
        x=2;
        System.out.println("The value of y is: " + y); // the value of y still:1
        // The primitive types are independent
        // The primitives types are copied by their value

        // 2- Reference types
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x =2;
        System.out.println("The value of point2 is: " + point2);
        // Reference types are copied by the references
    }
}
