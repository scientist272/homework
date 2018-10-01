package com.charlie.homework.controller;


import com.charlie.homework.entity.Url;
import com.charlie.homework.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/url")
public class PageController {
    @Autowired
    private UrlService urlService;
    @RequestMapping("/page")
    public String page(){
        return "page";
    }

    @RequestMapping("/display/{shortUrl}")
    public String display(@PathVariable("shortUrl") String shortUrl){
        String longUrl = urlService.getLongUrlAndAddCount(shortUrl);
        String redirect = "redirect:"+longUrl;
        return redirect;
    }
}
