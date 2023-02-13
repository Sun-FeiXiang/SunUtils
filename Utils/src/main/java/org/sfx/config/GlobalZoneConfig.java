package org.sfx.config;

import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.time.ZoneOffset;
import java.util.TimeZone;

/**
 * @author Felix
 * @description 全局时区配置
 * @date 2023-2-10 16:59
 **/
@Configuration
public class GlobalZoneConfig {
    @PostConstruct
    void started() {
        //时区设置：中国上海（东八区）
        TimeZone.setDefault(TimeZone.getTimeZone(ZoneOffset.of("+1")));
    }
}


