package com.up366.action;

import feign.Param;
import feign.RequestLine;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 1336942608@qq.com
 * @version:
 * @date: 2020年03月19 23时18分
 */
@RestController
public class UserController {

    @GetMapping("/login/{username}/{password}")
    public String loginAction(
            @PathVariable("username") String username,
            @PathVariable("password") String password){
        return username + ":" +"login success";
    }

    @GetMapping("/user/{userid}")
    public String getById(@PathVariable("userid") Integer userid){
        return "getById:"+userid;
    }

}
