package com.charlie.homework;

import com.charlie.homework.entity.Url;
import com.charlie.homework.mapper.UrlMapper;
import com.charlie.homework.service.UrlService;
import com.charlie.homework.util.LongUrlConventor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HomeworkApplicationTests {
    @Autowired
    private UrlMapper urlMapper;

    @Autowired
    private UrlService urlService;
    @Test
    public void contextLoads() {
    }

    @Test
    public void test1() {
        String longUrl = "https://blog.csdn.net/Winter_chen001/article/details/78622141";
        String[] result = LongUrlConventor.convert(longUrl, "wuxinlin");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        System.out.println();
    }

    @Test
    public void test2() {
        Url url = new Url();
        url.setLongUrl("https://blog.csdn.net/Winter_chen001/article/details/78622141");
        String shortUrl = LongUrlConventor.convert("https://blog.csdn.net/Winter_chen001/article/details/78622141", "wuxinlin")[0];
        url.setShortUrl(shortUrl);
        url.setMd5Key("wuxinlin");
        urlMapper.insertNewUrl(url);
    }

    @Test
    public void test3() {
      Url url = urlService.getLongUrlWithoutAddingCount("Rri2qa");
        System.out.println(url.getCount());
    }

    @Test
    public void test4() {
        String shortUrl = "iUniQj";
        urlMapper.addCount(shortUrl);
    }
    @Test
    public void test5(){
        Url url = new Url();
        url.setLongUrl("http://www.runoob.com/jquery/jquery-ref-selectors.html");
        String shortUrl = LongUrlConventor.convert("http://www.runoob.com/jquery/jquery-ref-selectors.html", "wuxinlin")[0];
        url.setShortUrl(shortUrl);
        url.setMd5Key("wuxinlin");
        urlService.createNewShortUrl(url);
    }
}
