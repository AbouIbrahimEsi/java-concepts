package dz.learnjava.interfacesCourse;

public class FunctionalInterfaceDemo {

    // Static method
    public static void staticPrint(String message) {}

    // Instance method
    public void instancePrint(String message) {}

    // Constructor


    public FunctionalInterfaceDemo(String message) {}

    public static void show() {

        // First way to implement interfaces
        greet(new ConsolePrinter());

        // Second way to implement interfaces with: Anonymous Inner Classes
        greet(new Printer() { // Second way to implement interfaces with: Anonymous Inner Classes
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });

        // Third way to implement interfaces with: Lambda Expression
        greet(message -> System.out.println(message));

        // Method reference
        // Class/Object::method
        greet(System.out::println);

        // Create variable with LE (MR)
        Printer printer = new ConsolePrinter();
        Printer printer2 = message -> System.out.println(message);
        Printer printer3 = System.out::println;

        printer3.print("hello world");

        // Pass Static method
        greet(FunctionalInterfaceDemo::staticPrint);

        // Pass Instance method
        var demo = new FunctionalInterfaceDemo("demo");
        greet(demo::instancePrint);

        // Pass Constructor
        greet(message -> new FunctionalInterfaceDemo(message));
        greet(FunctionalInterfaceDemo::new);


    }

    public static void greet(Printer printer) {
        printer.print("Hello World !!!");
    }
}
