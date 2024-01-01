package com.wewtapi.cons;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainCon {
    //메인 홈화면 컨트롤러

    @GetMapping("/")
    public String MatchList(){

        return "test";
    }



}
