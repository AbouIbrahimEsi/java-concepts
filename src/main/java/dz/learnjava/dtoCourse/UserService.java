package dz.learnjava.dtoCourse;

import java.util.List;
import java.util.stream.Collectors;

//@Service
public class UserService {

    // private final UserMapper userMapper;
    private UserMapper userMapper = new UserMapper();
    UserModel userModel = new UserModel(12, "Halim", "Ali", "h_ali",
            "demo_password", 27, List.of("admin", "staff", "manager"));

    UserDto userDto = userMapper.apply(userModel);

    public List<UserDto> getAllUsers() {
        List<UserModel> userModelList = List.of(
                new UserModel(785, "Halim", "Ali", "h_ali", "25621", 27, List.of("admin", "staff", "manager")),
                new UserModel(245, "Chouaib", "Nedjm", "c_nedjm", "4523", 35, List.of("staff", "manager")),
                new UserModel(356, "kamel", "Samir", "kl_samir", "45872", 42, List.of("manager"))
        );

        // How to use Functional Interface in mapping
        return userModelList
                .stream()
                .map(userMapper)
                .collect(Collectors.toList());
    }

}
