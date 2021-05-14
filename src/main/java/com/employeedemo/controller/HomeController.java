package com.employeedemo.controller;
//
///* AUTHOR: LILI MP
// * NC TRAINEE PROGRAM
// * PROJECT: CAR RENTAL SYSTEM TBW
// */
//
//import com.employeedemo.model.UserGuest;
//import com.employeedemo.service.UserGuestService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class HomeController {
//
//    @Autowired
//    private UserGuestService userGuestService;
//
//    @GetMapping("/home")
//    public String showUserGuestForm(Model model) {
//        //Create model attribute to bind form data
//        UserGuest newUserGuest = new UserGuest();
//        model.addAttribute("newUser", newUserGuest);
//        return "newUserRegistration";
//    }
//}
