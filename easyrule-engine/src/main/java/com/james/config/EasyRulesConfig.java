/**
 * Truderal.com.cn Inc.
 * Copyright (c) 2016-2017 All Rights Reserved.
 */
package com.james.config;

import com.james.ruleengine.springrules.DummyRule;
import org.easyrules.api.Rule;
import org.easyrules.api.RulesEngine;
import org.easyrules.core.RulesEngineBuilder;
import org.easyrules.spring.RulesEngineFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author militang
 * @version Id: EasyRulesConfi g.java, v 0.1 17/9/11 下午3:42 militang Exp $$
 */
@Configuration
public class EasyRulesConfig {

    @Bean
    public DummyRule rule() {
        return new DummyRule();
    }

    //    bean id="rule"class="samples.spring.DummyRule"scope="prototype"/>
    //    bean id="rule"class="samples.spring.DummyRule"scope="prototype"/>

    @Bean
    public RulesEngine rulesEngine() {
        RulesEngine rulesEngine = RulesEngineBuilder.aNewRulesEngine().build();//.getObject();//  rulesEngineFactoryBean
        rulesEngine.registerRule(rule());
        return  rulesEngine;
    }


}