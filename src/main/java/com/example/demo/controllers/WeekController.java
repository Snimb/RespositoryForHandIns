package com.example.demo.controllers;

import com.example.demo.services.CalculateDayOfWeek;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WeekController {
    CalculateDayOfWeek weekCalc = new CalculateDayOfWeek();

    @ResponseBody
    @GetMapping("erdetfredag")

    public String WeekController() {
        System.out.println("Er det Fredag?");
        if (weekCalc.computerAndReturnDayOfWeek(8, 14, 2021 / 100, 2021 % 100) == 5) {
            return "Ja";
        } else return "Nej";
    }
}
