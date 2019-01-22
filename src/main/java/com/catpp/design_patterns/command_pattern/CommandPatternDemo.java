package com.catpp.design_patterns.command_pattern;

import com.catpp.design_patterns.command_pattern.command.call.Broker;
import com.catpp.design_patterns.command_pattern.command.impl.BuyStock;
import com.catpp.design_patterns.command_pattern.command.impl.SellStock;
import com.catpp.design_patterns.command_pattern.req.Stock;

/**
 * com.catpp.design_patterns.command_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/22
 * @Description
 */
public class CommandPatternDemo {

    public static void main(String[] args) {

        Stock stock = new Stock();

        BuyStock buyStockOrder = new BuyStock(stock);
        SellStock sellStockOrder = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
