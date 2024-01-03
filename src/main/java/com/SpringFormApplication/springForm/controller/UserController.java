package com.SpringFormApplication.springForm.controller;


import com.SpringFormApplication.springForm.dto.UserDto;
import com.SpringFormApplication.springForm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

@Autowired
private UserService userService;

    @GetMapping("/form")
    public String getForm(@ModelAttribute("user")UserDto userDto) {

        return "form";

    }

//    @PostMapping("/formPage")
//    public String saveUser(@ModelAttribute("user")UserDto userDto, Model model){
//        userService.save(userDto);
//        model.addAttribute("message","Registered Successfully");
//        return "form";
//    }


}
