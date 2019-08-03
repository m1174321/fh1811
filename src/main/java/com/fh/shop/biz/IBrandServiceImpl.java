package com.fh.shop.biz;


import com.fh.shop.mapper.BrandMapper;
import com.fh.shop.po.Brand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("brandService")
public class IBrandServiceImpl implements IBrandService {

    @Autowired
    public BrandMapper brandMapper;

    @Override
    public void add(Brand brand) {
        brandMapper.add(brand);
    }


    @Override
    public void delete(int brandId) {
        brandMapper.delete(brandId);
    }


}
