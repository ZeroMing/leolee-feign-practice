package com.up366.service;

import feign.Param;
import feign.RequestLine;

/**
 * @author: 1336942608@qq.com
 * @version:
 * @date: 2020年03月19 23时16分
 */
public interface UserService {

    @RequestLine("GET /login/{username}/{password}")
    public String loginAction(
            @Param("username") String username,
            @Param("password") String password);

    @RequestLine("GET /user/{userid}")
    public String getById(
            @Param("userid") Integer userid);
}
