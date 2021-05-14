package com.employeedemo.controller;

/* AUTHOR: LILI MP
 * NC TRAINEE PROGRAM
 * PROJECT: CAR RENTAL SYSTEM TBW
 */

import com.employeedemo.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleController {

    @Autowired
    private VehicleService employeeService;

    @GetMapping("/home/selectACar")
    public String selectACar(Model model) {
        model.addAttribute("listVehicles", employeeService.getAllVehicles());
        return "index";
    }



}
