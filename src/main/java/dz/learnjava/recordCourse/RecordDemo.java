package dz.learnjava.recordCourse;

public class RecordDemo {
    public static void show() {
        PersonDto person = new PersonDto("Bentaib Ahmed", "34. Algeria : Oran");
        PersonDto person2 = new PersonDto("Bentaib Hamid", "25. Algeria : Telemcen");

        System.out.println(person.name());
        System.out.println(person.address());
        System.out.println(person.equals(person2)); // return false
        System.out.println(person2.hashCode());
    }
}
