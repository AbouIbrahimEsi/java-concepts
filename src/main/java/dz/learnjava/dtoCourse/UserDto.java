package dz.learnjava.dtoCourse;

import java.util.List;

public record UserDto (
        String firstname,
        String lastname,
        String username,
        Integer age,
        List<String> roles
) {

}
