package com.victortylikov.CoolCalendar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ViktorTyulikov on 9/26/2018.
 */

@RestController
public class CalendarController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}