package com.employeedemo.controller;

/* AUTHOR: LILI MP
 * NC TRAINEE PROGRAM
 * PROJECT: CAR RENTAL SYSTEM TBW
 */

import com.employeedemo.model.UserGuest;
import com.employeedemo.service.UserGuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserGuestController {

    @Autowired
    private UserGuestService userGuestService;

    @GetMapping("/home")
    public String viewHomePage(Model model) {
        model.addAttribute("listClient", userGuestService.findAllUserGuest());
        return "userguestregistration";
    }

    @GetMapping("/userRegistration")
    public String showUserGuestForm(Model model) {
        //Create model attribute to bind form data
        UserGuest newUserGuest = new UserGuest();
        model.addAttribute("newUser", newUserGuest);
        return "newUserRegistration";
    }

    @PostMapping("/saveUserGuest")
    public String saveUserGuest(@ModelAttribute("newUser") UserGuest newUserGuest) {
        //Save UserGuest to database
        userGuestService.saveUserGuest(newUserGuest);
        return "redirect:/home/selectACar";
    }

}
