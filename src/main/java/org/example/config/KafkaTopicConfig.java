package org.example.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    // class responsible for creating topics
    @Bean
    public NewTopic amigoscodeTopic(){
        return TopicBuilder.name("amigoscode").build();
    }


}
