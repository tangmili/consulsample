/**
 * Truderal.com.cn Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */
package com.james.controller;

import com.james.dto.res.ResPonse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author militang
 * @version Id: SampleController.java, v 0.1 17/9/1 上午11:23 militang Exp $$
 */
@RestController
public class SampleController {
    @RequestMapping("/hi")
    public ResPonse home() {
        ResPonse resPonse = new ResPonse();
        resPonse.setResMsg("Hello ,World");
        return resPonse;
    }
}