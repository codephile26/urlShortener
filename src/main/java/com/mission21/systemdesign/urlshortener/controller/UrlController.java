package com.mission21.systemdesign.urlshortener.controller;

import com.mission21.systemdesign.urlshortener.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlController {

    @Autowired
    private UrlService urlService;

    public String createShortUrl(String longUrl){
        //check if the url is valid
        // convert the url into base 62 string and store in db
        return urlService.createShortUrl(1000000);
    }
}
