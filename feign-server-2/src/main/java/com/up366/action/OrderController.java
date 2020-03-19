package com.up366.action;

import com.fasterxml.jackson.core.io.JsonStringEncoder;
import com.up366.service.UserService;
import feign.Feign;
import feign.Request;
import feign.Retryer;
import feign.codec.StringDecoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 1336942608@qq.com
 * @version:
 * @date: 2020年03月19 23时22分
 */
@RestController
public class OrderController {

    @GetMapping("/order/user/{userId}")
    public String orderByUser(@PathVariable("userId") Integer userId){
        UserService userService = Feign.builder()
                .decoder(new StringDecoder())
                .options(new Request.Options(1000, 3500))
                .retryer(new Retryer.Default(5000, 5000, 3))
                .target(UserService.class,"http://localhost:8888/");

        String byId = userService.getById(userId);
        return byId;
    }
}
