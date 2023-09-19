package dz.learnjava;


public class StringCourse {
    public static void main(String[] args) {

//        String message = new String("Hello world"); // there is a shorter way
//        to initialize string variables

        String message = "Hello Java World" + "!!!";
        System.out.println(message);

        // String useful methods
        System.out.println(message.endsWith("!!"));    // True
        System.out.println(message.startsWith("!!"));  // False
        System.out.println(message.length());
        System.out.println(message.indexOf("h"));
        System.out.println(message.replace("!!!", "*"));
        System.out.println(message); // The message can not be changed because the String vars are immutable
        System.out.println(message.toLowerCase());
        System.out.println(message.trim());


        // Escape Sequences (special characters)
        String message2 = "Hello \"Java\" World";
        String url = "c:\\Windows\\...";
        System.out.println(message2);

    }
}
