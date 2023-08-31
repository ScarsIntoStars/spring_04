package com.icia.study.controller;

import com.icia.study.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @Autowired
    public StudyService studyService;
    @GetMapping("/")
    public String index() {
        return "index";
    }


    @GetMapping("req1")
    public String req1(){
        studyService.req1();
        return "index";
    }

    @GetMapping("req2")
    public String req2(@RequestParam("q1") String q1, @RequestParam("q2") String q2){
        studyService.req2(q1, q2);
        return "index";
    }
}
