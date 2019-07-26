package com.flaya.dubbo.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

@Slf4j
@Service(version = "${demo.service.version}")
public class DefaultDemoService implements IDemoService {

    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String pay(String money) {
        log.info(serviceName);
        return serviceName;
    }
}
