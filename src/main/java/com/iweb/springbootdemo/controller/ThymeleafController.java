package com.iweb.springbootdemo.controller;

import com.iweb.springbootdemo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author yangyi
 * @date 2019/8/31 10:01
 */
@Controller
public class ThymeleafController {
    @GetMapping("helloThy")
    public String helloThy(Map<String, Object> map) {
        map.put("msg", "我不是helloThy");
        //boot可以直接转发到templates目录下，默认后缀名是.html
        return "index";
    }

    @GetMapping("list")
    public String list(Map<String, Object> map, HttpSession session) {
        User user = new User(1, "李雷", 100);
        User user1 = new User(2, "韩梅梅", 0);
        User user2 = new User(3, "韩梅西", 60);
        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user1);
        list.add(user2);
        map.put("users", list);

        session.setAttribute("user", user);
        return "index";
    }
}
