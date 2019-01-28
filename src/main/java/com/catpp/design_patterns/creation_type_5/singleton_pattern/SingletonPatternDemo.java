package com.catpp.design_patterns.creation_type_5.singleton_pattern;

/**
 * com.catpp.design_patterns.creation_type_5.singleton_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/16
 * @Description
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {
        for (int i = 0;i < 10;i++) {
            SingleObject singleObject = SingleObject.getIntance();
            // 对象的地址是一样的哦。。
            System.err.println(singleObject);
            singleObject.showMessage();
        }
    }
}
