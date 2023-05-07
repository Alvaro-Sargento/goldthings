package goldthings.services;


import goldthings.dto.UserDto;
import goldthings.models.User;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);
}
