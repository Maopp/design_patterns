package com.catpp.design_patterns.behaivor_type_12.mediator_pattern.mediator;

import com.catpp.design_patterns.behaivor_type_12.mediator_pattern.User;

import java.util.Date;

/**
 * com.catpp.design_patterns.behaivor_type_12.mediator_pattern.mediator
 *
 * @Author cat_pp
 * @Date 2019/1/22
 * @Description 聊天室-中介类
 */
public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] ：" + message);
    }
}
