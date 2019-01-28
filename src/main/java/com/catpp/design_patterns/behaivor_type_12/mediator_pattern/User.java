package com.catpp.design_patterns.behaivor_type_12.mediator_pattern;

import com.catpp.design_patterns.behaivor_type_12.mediator_pattern.mediator.ChatRoom;

/**
 * com.catpp.design_patterns.behaivor_type_12.mediator_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/22
 * @Description
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
