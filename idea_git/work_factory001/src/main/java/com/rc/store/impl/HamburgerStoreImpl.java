package com.rc.store.impl;

import com.rc.bean.Hamburger;
import com.rc.factory.impl.HamburgerFactoryImpl;
import com.rc.store.IStore;

/**
 * @description:
 * @author: 江毅东
 * @createDate: 2019/9/29
 * @version: 1.0
 */
public class HamburgerStoreImpl implements IStore {

    HamburgerFactoryImpl hamburgerFactory = new HamburgerFactoryImpl();

    public HamburgerStoreImpl(){
        System.out.println(hamburgerFactory.createHamburger());
        hamburgerFactory.cut();
        hamburgerFactory.bake();
        hamburgerFactory.box();
    }

    @Override
    public void pack() {
        System.out.println("打包要加两元");
    }

    @Override
    public void eat_here() {
        System.out.println("请稍等，马上为您准备");
    }
}
