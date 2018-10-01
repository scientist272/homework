package com.charlie.homework.controller;

import com.charlie.homework.entity.Url;
import com.charlie.homework.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/url")
public class UrlController {
    @Autowired
    private UrlService urlService;

    @RequestMapping(value = "/shortUrl",method = POST)
    public Url createNewShortUrl(@RequestBody Url url){
        return urlService.createNewShortUrl(url);
    }

    @RequestMapping(value = "/longUrl",method = POST)
    public Url returnLongUrl(@RequestBody Url url){
        String shortUrl = url.getShortUrl().replaceAll("localhost:8080/url/display/","");
        return urlService.getLongUrlWithoutAddingCount(shortUrl);
    }

}
