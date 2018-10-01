package com.charlie.homework.service;

import com.charlie.homework.entity.Url;

public interface UrlService {
    public Url createNewShortUrl(Url url);
    public String getLongUrlAndAddCount(String shortUrl);
    public Url getLongUrlWithoutAddingCount(String shortUrl);
}
