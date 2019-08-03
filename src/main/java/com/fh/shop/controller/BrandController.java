package com.fh.shop.controller;

import com.fh.shop.biz.IBrandService;
import com.fh.shop.common.SuccessResponse;
import com.fh.shop.po.Brand;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RequestMapping("/api/brand")
@RestController
public class BrandController {

    @Resource(name = "brandService")
    private IBrandService brandService;

    @PostMapping
    public SuccessResponse add(@RequestBody Brand brand) {
        brandService.add(brand);
        return SuccessResponse.success();
    }

    @DeleteMapping("/{brandId}")
    public SuccessResponse deletea(@PathVariable int brandId) {
        brandService.delete(brandId);
        return SuccessResponse.success();
    }


}
