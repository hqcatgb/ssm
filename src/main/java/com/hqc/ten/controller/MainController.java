package com.hqc.ten.controller;

import com.hqc.ten.bean.JsonReturn;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MainController {


    @RequestMapping(value = "/")
    public String Index() {
        return "index";
    }



}
