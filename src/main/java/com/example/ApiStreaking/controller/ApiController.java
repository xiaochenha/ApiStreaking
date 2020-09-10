package com.example.ApiStreaking.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/join_membership")
    public String joinMembership(@RequestParam String coinAddress){
        log.info("注册会员："+coinAddress);
        return coinAddress;
    }

}
