package dz.learnjava.dtoCourse;

import java.util.function.Function;

//@Component
public class UserMapper implements Function<UserModel, UserDto> {
    // This is a Functional Interface
    @Override
    public UserDto apply(UserModel userModel) {
        return new UserDto(
                userModel.getFirstname(),
                userModel.getLastname(),
                userModel.getUsername(),
                userModel.getAge(),
                userModel.getRoles()
        );
    }
}
