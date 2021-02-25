package com.dk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: echarts_demo
 * @description:
 * @author: lzl
 * @create: 2021-01-07 10:07
 **/
@Controller
@RequestMapping("index")
public class IndexController {

    @RequestMapping("toEcharts")
    public String toEcharts(){
        return "echarts";
    }

    @RequestMapping("dong")
    public String dong(){
        return "dong";
    }
    @RequestMapping("dixing")
    public String dixing(){
        return "dixing";
    }
}
