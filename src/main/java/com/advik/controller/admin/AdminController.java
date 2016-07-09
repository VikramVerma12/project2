package com.advik.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.advik.service.RolesService;
import com.advik.service.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
    private UserService userService;

    @Autowired
    private RolesService rolesService;

    @RequestMapping
    public String adminPage(){
        return "admin";
    }

}
