package io.jyotirmay.distributor_retail.event.config;

import com.rabbitmq.client.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventConfig {

    @Bean
    public void connectionFactory() {

    }

    @Bean
    public RabbitTemplate configureRabbitTemplate(ConnectionFactory connectionFactory) {

        return null;
    }

}
