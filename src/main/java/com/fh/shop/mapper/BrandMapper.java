package com.fh.shop.mapper;

import com.fh.shop.po.Brand;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

public interface BrandMapper {
    @Insert("insert into t_brand (brandName,dateTime) values (#{brandName},#{dateTime})")
    void add(Brand brand);
    @Delete("delete from t_brand where brandId=#{brandId}")
    void delete(int id);

}
