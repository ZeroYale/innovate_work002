package com.rc.factory.impl;

import com.rc.bean.Hamburger;
import com.rc.factory.IHamburgerFactory;

/**
 * @description: 具体方法，实体类
 * @author: 江毅东
 * @createDate: 2019/9/29
 * @version: 1.0
 */
public class HamburgerFactoryImpl implements IHamburgerFactory {



    @Override
    public void bake() {
        System.out.println("烘培需要5分钟");
    }

    @Override
    public void cut() {
        System.out.println("制作需要5分钟");
    }

    @Override
    public void box() {
        System.out.println("包装需要3分钟");
    }

    @Override
    public Hamburger createHamburger() {
        return new Hamburger("香辣炸鸡汉堡","100￥","辣不死你赔钱");
    }
}
