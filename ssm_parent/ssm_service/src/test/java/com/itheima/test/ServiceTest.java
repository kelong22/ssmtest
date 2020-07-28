package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

/**
 * @author wangxin
 * @version 1.0
 */
public class ServiceTest {

    public static void main(String[] args) {
        //spring容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-service.xml");
        ItemsService itemsService = (ItemsService) applicationContext.getBean("itemsServiceImpl");
        List<Items> list = itemsService.list();//商品列表
        if(list != null && list.size()>0){
            System.out.println("商品列表........"+list.size());
        }

        Items items = new Items();
        items.setName("苹果手机66");
        items.setPrice(19000f);
        items.setCreatetime(new Date());
        itemsService.save(items);
    }
}
