/**
 * Truderal.com.cn Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */
package com.james.component;

import java.net.URI;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

/**
 * @author militang
 * @version Id: RefreshConfigServerProperties.java, v 0.1 17/9/4 下午4:35 militang Exp $$
 */
@Component
@Slf4j
public class RefreshConfigServerProperties {

    @Autowired
    private RestTemplate restTemplate;

    //@Value()
    @Value("${server.port}")
    private String       svrport;

    //@Scheduled(cron = "5 * * * * ?")
    @Scheduled(fixedRate = 3000)
    public void propertrefresh() {
        log.info("job   excutting {}", DateTime.now().toString());
        URI refreshrsult = restTemplate.postForLocation("http://localhost:" + svrport + "/refresh",
            null);
        log.info("URI ={}", refreshrsult);

    }

}