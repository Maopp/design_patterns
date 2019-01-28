package com.catpp.design_patterns.behaivor_type_12.command_pattern.command.call;

import com.catpp.design_patterns.behaivor_type_12.command_pattern.command.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * com.catpp.design_patterns.behaivor_type_12.command_pattern.command.call
 *
 * @Author cat_pp
 * @Date 2019/1/22
 * @Description 命令调用类
 */
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
