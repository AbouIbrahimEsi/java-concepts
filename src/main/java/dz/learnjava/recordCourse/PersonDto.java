package dz.learnjava.recordCourse;

import java.util.Objects;

public record PersonDto(String name, String address) {

    // Static variables
    public static String UNKNOWN_ADDRESS = "Unknown";

    // Customize generated constructor implementation
    public PersonDto {
        Objects.requireNonNull(name);
        Objects.requireNonNull(address);
    }

    public PersonDto(String name) {
        this(name, "Unknown");
    }

    // Creating a constructor with the same arguments as the generated public constructor
//    public PersonDto(String name, String address) {
//        this.name = name;
//        this.address = address;
//    }

    // Static methods
    public static PersonDto unnamed(String address) {
        return new PersonDto("Unnamed", address);
    }


    static int countryCode;

    // static initializer
    static {
        countryCode = 1;
    }

}
