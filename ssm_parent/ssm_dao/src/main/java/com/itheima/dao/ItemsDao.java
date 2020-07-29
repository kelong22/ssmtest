package com.itheima.dao;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * @author 周盼龙
 * @date 2020/2/23 20:45
 */
public interface ItemsDao {

    /***
     * 查询所有
     * @return
     */
    List<Items> list();

    /***
     * 保存操作
     * @param items
     * @return
     */
    int save(Items items);


    /**
     * 删除操作
     * @param items
     */
    void delete(Items items);
    
     /**
     *增加操作
     */
    int add(Items items);
    
}
