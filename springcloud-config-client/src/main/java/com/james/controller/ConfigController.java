/**
 * Truderal.com.cn Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */
package com.james.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author militang
 * @version Id: HelloController.java, v 0.1 17/8/25 下午6:00 militang Exp $$
 */

@RestController
@RefreshScope
public class ConfigController {

    @Value("${neo.hello}")
    private String hello      = "www";

    @Value("${spring.cloud.config.name}")
    private String configName = "www";

    @Value("${spring.cloud.config.profile}")
    private String configDev  = "www";

    @RequestMapping("/helloconfig")
    public String from() {
        String configInfo = "configName is[" + configName + "] configProfile is[" + configDev + "]"
                            + " Test property neo.hello value is [" + hello + "]";
        return configInfo;
    }
}
