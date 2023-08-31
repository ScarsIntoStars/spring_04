package com.icia.study.service;

import org.springframework.stereotype.Service;

@Service
public class StudyService {
    public void req1(){
        System.out.println("StudyService.req1");
    }

    public void req2(String q1, String q2) {
        System.out.println("StudyService.req2");
        System.out.println("q1 = " + q1 + "q2 = " + q2);
    }
}
