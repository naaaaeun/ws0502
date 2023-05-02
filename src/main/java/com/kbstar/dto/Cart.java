package com.kbstar.dto;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Cart {
    private int id;
    private String cust_id;
    private int item_id;
    private int cnt;
    private Date rdate;

    public Cart(String cust_id, int item_id, int cnt) {
        this.cust_id = cust_id;
        this.item_id = item_id;
        this.cnt = cnt;
    }

    public Cart(String cust_id, int item_id, int cnt, Date rdate) {
        this.cust_id = cust_id;
        this.item_id = item_id;
        this.cnt = cnt;
        this.rdate = rdate;
    }

    private String cust_name;
    private String item_name;
    private String item_price;
    private String item_imgname;
}
