package com.victortylikov.calendarapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.time.LocalDate;
import java.time.Month;
import java.util.Map;

/**
 * Created by ViktorTyulikov on 10/8/2018.
 */
@Controller
public class CalendarController {

    @RequestMapping("/")
    public String index(Map<String, Object> model){
        LocalDate currentDate = LocalDate.now();
        Month month = currentDate.getMonth();
        Integer monthLength = month.length(currentDate.isLeapYear());
        model.put("monthLength", monthLength);
        return "index";
    }

}
