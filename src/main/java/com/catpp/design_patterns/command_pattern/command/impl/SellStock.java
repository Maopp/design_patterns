package com.catpp.design_patterns.command_pattern.command.impl;

import com.catpp.design_patterns.command_pattern.command.Order;
import com.catpp.design_patterns.command_pattern.req.Stock;

/**
 * com.catpp.design_patterns.command_pattern.command.impl
 *
 * @Author cat_pp
 * @Date 2019/1/22
 * @Description
 */
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
