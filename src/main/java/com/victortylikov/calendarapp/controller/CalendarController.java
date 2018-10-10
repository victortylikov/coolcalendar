package com.victortylikov.calendarapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.DayOfWeek;
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
        LocalDate prevMonth = currentDate.minusMonths(1);
        Integer currentMonthLength = currentDate.getMonth().length(currentDate.isLeapYear());
        Integer prevMonthLength = prevMonth.getMonth().length(currentDate.isLeapYear());

       // DayOfWeek nameDayForLastDayOfPrevMonth = prevMonth.withDayOfMonth(prevMonthLength);
        LocalDate firstDateOfMonth = currentDate.withDayOfMonth(1);
        DayOfWeek dayForFirstDay = firstDateOfMonth.getDayOfWeek();


        System.out.println("First Date Of Month " + firstDateOfMonth.toString());
        System.out.println("Name of first month day " + dayForFirstDay.getValue());
        model.put("monthLength", currentMonthLength);
        model.put("dayForFirstDay", dayForFirstDay.getValue());
        return "index";
    }

}
