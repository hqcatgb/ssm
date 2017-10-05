package com.hqc.ten.controller;

import com.hqc.ten.bean.JsonReturn;
import com.hqc.ten.domain.Ad;
import com.hqc.ten.service.IAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/about")
public class AboutController {

    @RequestMapping()
    @ResponseBody
    public JsonReturn<String> About() {
        JsonReturn<String> r = new JsonReturn<String>();
        r.setMsg("本公司是上海第一家注册的公司,于1949年10.1注册!");
        return r;
    }



}