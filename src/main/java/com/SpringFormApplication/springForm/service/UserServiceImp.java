package com.SpringFormApplication.springForm.service;

import com.SpringFormApplication.springForm.dto.UserDto;
import com.SpringFormApplication.springForm.model.User;
import com.SpringFormApplication.springForm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{


    @Autowired
    private UserRepository userRepository;


    @Override
    public User save(UserDto userDto) {
        User user=new User(userDto.getFullName(),userDto.getDob(),
                userDto.getEmail(),userDto.getPhNo(),userDto.getQualification(),
                userDto.getDepartment(),userDto.getYearPassout(),
                userDto.getPreferredRole(),userDto.getPreferredSalary(),
                userDto.getJobType(),userDto.getSkills(),userDto.getLocation());
        return userRepository.save(user);
    }
}
