package com.catpp.design_patterns.composite_entity_pattern.coarse_grained;

import com.catpp.design_patterns.composite_entity_pattern.dependent.DependentObject1;
import com.catpp.design_patterns.composite_entity_pattern.dependent.DependentObject2;

/**
 * com.catpp.design_patterns.composite_entity_pattern.coarse_grained
 *
 * @Author cat_pp
 * @Date 2019/1/25
 * @Description 粗粒度对象
 */
public class CoarseGrainedObject {

    DependentObject1 do1 = new DependentObject1();
    DependentObject2 do2 = new DependentObject2();

    public void setData(String data1, String data2){
        do1.setData(data1);
        do2.setData(data2);
    }

    public String[] getData(){
        return new String[] {do1.getData(),do2.getData()};
    }
}
