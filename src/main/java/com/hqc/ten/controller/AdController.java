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
@RequestMapping(value = "/ad")
public class AdController {
    @Autowired
    IAdService adService;


    @RequestMapping(value = "detail", method = RequestMethod.GET)
    public @ResponseBody
    Ad reg() {
        return this.adService.Find(3);
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public @ResponseBody
    JsonReturn add() {
        JsonReturn r = new JsonReturn<String>();

        Ad model = new Ad();
        model.setName("桃花诺");
        model.setCreated_at(111);
        model.setExpire(0);
        model.setIs_use(1);
        model.setOrder(0);
        model.setPosition_id("default");
        model.setUrl("https://m.94yaomei.com");
        if (this.adService.Add(model) <= 0) {
            r.setStatus(500);
            r.setMsg("内部服务器错误");
        }
        r.setMsg("success");
        return r;
    }


    @RequestMapping(value = "all", method = RequestMethod.GET)
    public @ResponseBody
    JsonReturn all() {
        JsonReturn<List<Ad>> r = new JsonReturn<List<Ad>>();

        r.setMsg(this.adService.All());
        return r;

    }
}