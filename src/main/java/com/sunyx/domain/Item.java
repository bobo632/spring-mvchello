package com.sunyx.domain;

import java.util.Date;

/**
 * Created by sunyx on 2019/1/25.
 */
public class Item {
    private Integer id;
    private String name;
    private Double price;
    private Date createTime;
    private String detail;

    public Item(Integer id, String name, Double price, Date createTime, String detail) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.createTime = createTime;
        this.detail = detail;
    }

    public Item() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", createTime=" + createTime +
                ", detail='" + detail + '\'' +
                '}';
    }
}
