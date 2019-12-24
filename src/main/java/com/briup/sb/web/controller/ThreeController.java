package com.briup.sb.web.controller;

import com.briup.sb.bean.Message;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThreeController {
    @PostMapping("/add")
    public String add() {
        return "学生添加成功";

    }
}
