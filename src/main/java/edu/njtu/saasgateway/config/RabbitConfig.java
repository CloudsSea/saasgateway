package edu.njtu.saasgateway.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RabbitMQ配置
 *
 * @author Levin
 * @since 2018/4/11 0011
 */
@Configuration
public class RabbitConfig {

    public static final String DEFAULT_PIC_QUEUE = "dev.pic.register.default.queue";
    public static final String MANUAL_PIC_QUEUE = "dev.pic.register.manual.queue";

    @Bean
    public Queue defaultBookQueue() {
        // 第一个是 QUEUE 的名字,第二个是消息是否需要持久化处理
        return new Queue(DEFAULT_PIC_QUEUE, true);
    }

    @Bean
    public Queue manualBookQueue() {
        // 第一个是 QUEUE 的名字,第二个是消息是否需要持久化处理
        return new Queue(MANUAL_PIC_QUEUE, true);
    }
}