package com.charlie.homework.mapper;

import com.charlie.homework.entity.Url;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UrlMapper {
    @Insert("insert into url(long_url,short_url,md5_key,count) " +
            "select #{longUrl},#{shortUrl},#{md5Key},0 from dual " +
            "where not exists (" +
            "select short_url from url t where t.short_url=#{shortUrl}" +
            ")")
    public int insertNewUrl(Url url);

    @Select("select long_url from url where short_url= #{shortUrl}")
    public String getLongUrlByShortUrl(@Param("shortUrl") String shortUrl);

    @Update("update url set count=count+1 where short_url = #{shortUrl}")
    public int addCount(@Param("shortUrl") String shortUrl);

    @Select("select count from url where short_url= #{shortUrl}")
    public int getCount(@Param("shortUrl")String shortUrl);
}
