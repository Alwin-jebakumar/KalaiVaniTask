package com.SpringFormApplication.springForm.service;
;
import com.SpringFormApplication.springForm.dto.UserDto;
import com.SpringFormApplication.springForm.model.User;


public interface UserService {

  User save(UserDto userDto);

}
