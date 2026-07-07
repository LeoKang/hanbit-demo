package com.example.demo.controller;

import com.example.demo.model.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
public class ExpressionController {
    private final List<Member> members = List.of(
            new Member("윤서준", "SeojunYoon@hanbit.co.kr", 10),
            new Member("윤광철", "KwangcheolYoon@hanbit.co.kr", 43),
            new Member("공미영", "MiyoungKong@hanbit.co.kr", 28),
            new Member("김도윤", "DoyunKim@hanbit.co.kr", 11)
    );

    @GetMapping("/object")
    public String getMember(Model model) {
        model.addAttribute("member", members.get(0));
        return "expression/object";
    }

    @GetMapping("/calendars")
    public String getCalendars(Model model) {
        Date date = Calendar.getInstance().getTime();
        model.addAttribute("date", date);
        return "expression/calendar";
    }
}
