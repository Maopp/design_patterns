package com.catpp.design_patterns.behaivor_type_12.state_pattern.state_pattern_ins;

/**
 * com.catpp.design_patterns.behaivor_type_12.state_pattern.state_pattern_ins
 *
 * @Author cat_pp
 * @Date 2019/1/23
 * @Description
 */
public class StatePatternInsDemo {

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(Context.PREPARE);
        context.prepare();
        context.play();
        context.exit();
    }
}
