package com.rc.factory;

import com.rc.bean.Hamburger;

/**
 * @description:  工厂，汉堡制作的逻辑实体类
 * @author: 江毅东
 * @createDate: 2019/9/29
 * @version: 1.0
 */
public interface IHamburgerFactory {

    void bake();  //烘培
    void cut();  //制作
    void box();  //装饰
    Hamburger createHamburger(); //创建对象
}
