package com.catpp.design_patterns.creation_type_5.prototype_pattern;

/**
 * com.catpp.design_patterns.creation_type_5.prototype_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/16
 * @Description 接口类
 */
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    protected abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object clone = null;
        clone = super.clone();
        return clone;
    }
}
