package com.wewtapi.cons;

import com.wewtapi.mapper.StuMapper;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Testcons {

    @Autowired
    StuMapper sm;

    @RequestMapping("/ttt")
    public List homeCon(HttpServletRequest request) {
        System.out.println(sm.stu_list());
        List stus = sm.stu_list();
        return stus;
    }



}
