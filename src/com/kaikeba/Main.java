package com.kaikeba;

import com.kaikeba.bean.User;
import com.kaikeba.service.DBService;

public class Main {
    public static void main(String[] args) {
        User user = new User("1",18,"1","1","1","1","1","1","1","1","1");
        DBService.insertUser(user);
    }
}
