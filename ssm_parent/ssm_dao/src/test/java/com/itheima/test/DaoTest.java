package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

/**
 * dao层测试
 * @author wangxin
 * @version 1.0
 */
public class DaoTest {

    public static void main(String[] args) {
        //spring容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        ItemsDao itemsDao = (ItemsDao) applicationContext.getBean("itemsDao");
        List<Items> list = itemsDao.list();//商品列表
        if(list != null && list.size()>0){
            System.out.println("商品列表的长度...."+list.size());
        }

        Items items = new Items();
        items.setName("苹果手机");
        items.setPrice(12000f);
        items.setCreatetime(new Date());
        itemsDao.save(items);
    }
}
