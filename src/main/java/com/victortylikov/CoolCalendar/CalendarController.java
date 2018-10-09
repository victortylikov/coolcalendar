package com.victortylikov.CoolCalendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
/**
 * Created by ViktorTyulikov on 9/26/2018.
 */

@Controller
public class CalendarController {

    @GetMapping("/")
    public String index() {
        //model.addAttribute("name", "cool name");
        return "index";
    }
}