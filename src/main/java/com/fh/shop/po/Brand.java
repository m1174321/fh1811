package com.fh.shop.po;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Brand implements Serializable {
    private static final long serialVersionUID = -1449150661811540579L;

    private int brandId;
    private String brandName;
    private Date dateTime;

}
