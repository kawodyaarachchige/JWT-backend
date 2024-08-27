package lk.ijse.se10.jwt.service;

import lk.ijse.se10.jwt.dto.UserDto;

public interface UserService {
    int saveUser(UserDto userDto);
    UserDto searchUser(String username);
}
