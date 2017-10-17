package com.kanshu.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhoulin on 2017/10/17.
 */
@Controller
@EnableAutoConfiguration
public class IndexController {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
