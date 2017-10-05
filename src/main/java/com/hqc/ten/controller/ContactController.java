package com.hqc.ten.controller;

import com.hqc.ten.bean.JsonReturn;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "contact")
public class ContactController {



    @ResponseBody
    public String Index() {
        return "index";
    }



    @RequestMapping(value = "/map")
    @ResponseBody
    public JsonReturn<Map<String, String>> Contact() {
        JsonReturn<Map<String, String>> r = new JsonReturn<Map<String, String>>();
        r.setMsg(new HashMap<String, String>());
        r.getMsg().put("tel", "021-12345");
        r.getMsg().put("email", "021@sh.com");
        r.getMsg().put("address", "北京市");
        return r;
    }


}
