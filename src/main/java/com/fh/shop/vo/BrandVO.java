package com.fh.shop.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BrandVO implements Serializable {
    private static final long serialVersionUID = 4873714899554358509L;

    private String brandName;
    private Date dataTime;
}
