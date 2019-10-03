package com.rc.bean;


import lombok.Data;

/**
 * @description: 汉堡包实体类
 * @author: 江毅东
 * @createDate: 2019/9/29
 * @version: 1.0
 */

@Data
public class Hamburger {
    private String name; //名字
    private String price; //价格
    private String sauce; //调料

    public Hamburger(String name,String price,String sauce){
        this.name = name;
        this.price = price;
        this.sauce = sauce;
    }
}
