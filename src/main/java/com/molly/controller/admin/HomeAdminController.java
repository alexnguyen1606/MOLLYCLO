package com.molly.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/home")
public class HomeAdminController {
    @GetMapping
    public String index(){
        return "home-admin";
    }
}
