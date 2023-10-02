package dz.learnjava.exceptionsCourse;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo {
    public static void showException() {
        sayHello(null);
    }

    public static void show() {
        FileReader reader = null;
        try {
            reader = new FileReader("file.txt"); // Example of Checked Exceptions
            System.out.println("File opened successfully !!!");
            var value = reader.read();
            new SimpleDateFormat().parse("");
        }
//        catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
        catch (IOException | ParseException e) { // with this way we can combine two catches in one place
//            throw new RuntimeException(e);
            System.out.println("Could not read data.");
        }
//        catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
        finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } // should handle it in External resources
            }
        }

        // FileNotFoundException is a derivative of IOException




    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }

}
