package com.catpp.design_patterns.composite_entity_pattern.client;

import com.catpp.design_patterns.composite_entity_pattern.composite_entity.CompositeEntity;

/**
 * com.catpp.design_patterns.composite_entity_pattern.client
 *
 * @Author cat_pp
 * @Date 2019/1/25
 * @Description 使用组合实体的客户端类
 */
public class Client {

    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData(){
        for (int i = 0; i < compositeEntity.getData().length; i++) {
            System.out.println("Data: " + compositeEntity.getData()[i]);
        }
    }


    public void setData(String data1, String data2){
        compositeEntity.setData(data1, data2);
    }
}
