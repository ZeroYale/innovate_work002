package com.rc.material;

import com.rc.store.impl.HamburgerStoreImpl;
import org.junit.Test;

/**
 * @description: 测试类
 * @author: 江毅东
 * @createDate: 2019/9/29
 * @version: 1.0
 */
public class HamburgerApplication {

    HamburgerStoreImpl hamburgerStoreImpl = new HamburgerStoreImpl();

    @Test
    public void HamburgerEat_here(){
        hamburgerStoreImpl.eat_here();
    }

    @Test
    public void HamburgerPack(){
        hamburgerStoreImpl.pack();
    }
}
