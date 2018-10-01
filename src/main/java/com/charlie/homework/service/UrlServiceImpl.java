package com.charlie.homework.service;

import com.charlie.homework.entity.Url;
import com.charlie.homework.mapper.UrlMapper;
import com.charlie.homework.util.LongUrlConventor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlServiceImpl implements UrlService {
    @Autowired
    private UrlMapper urlMapper;
    @Override
    public Url createNewShortUrl(Url url) {
        String shortUrl = LongUrlConventor.convert(url.getLongUrl(),url.getMd5Key())[0];
        Url newUrl = new Url();
        newUrl.setLongUrl(url.getLongUrl());
        newUrl.setMd5Key(url.getMd5Key());
        newUrl.setShortUrl(shortUrl);
        urlMapper.insertNewUrl(newUrl);
        newUrl.setShortUrl("localhost:8080/url/display/"+shortUrl);
        return newUrl;
    }

    @Override
    public String getLongUrlAndAddCount(String shortUrl) {
        String longUrl = urlMapper.getLongUrlByShortUrl(shortUrl);
        urlMapper.addCount(shortUrl);
        return longUrl;
    }

    @Override
    public Url getLongUrlWithoutAddingCount(String shortUrl) {
        String longUrl = urlMapper.getLongUrlByShortUrl(shortUrl);
        int count = urlMapper.getCount(shortUrl);
        Url url = new Url();
        url.setLongUrl(longUrl);
        url.setCount(count);
        return url;
    }
}
