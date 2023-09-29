package dz.learnjava.fundamentals;

import java.util.Scanner;

public class ReadingInputsCourse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are: " + age);

        // Strings
        System.out.print("Name: ");
//        String name = scanner.next(); // return just one token
        String name = scanner.nextLine().trim();
        System.out.println("You are: " + name);


    }
}
