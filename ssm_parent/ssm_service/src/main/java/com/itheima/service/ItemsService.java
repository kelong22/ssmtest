package com.itheima.service;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * @author wangxin
 * @version 1.0
 */
public interface ItemsService {
    /**
     * 查询所有商品的方法
     */
    public List<Items> list();

    /**
     * 保存操作
     */
    public int save(Items items);
}
