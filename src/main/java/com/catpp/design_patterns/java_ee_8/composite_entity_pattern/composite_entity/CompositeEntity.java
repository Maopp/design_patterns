package com.catpp.design_patterns.java_ee_8.composite_entity_pattern.composite_entity;

import com.catpp.design_patterns.java_ee_8.composite_entity_pattern.coarse_grained.CoarseGrainedObject;

/**
 * com.catpp.design_patterns.java_ee_8.composite_entity_pattern.composite_entity
 *
 * @Author cat_pp
 * @Date 2019/1/25
 * @Description 组合实体类
 */
public class CompositeEntity {

    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}
