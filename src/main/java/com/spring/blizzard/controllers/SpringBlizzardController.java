package com.spring.blizzard.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created on 6/14/2017
 */

@RestController
public class SpringBlizzardController {

    @RequestMapping("/user")
    public Principal user(Principal principal) {
        return principal;
    }
}
