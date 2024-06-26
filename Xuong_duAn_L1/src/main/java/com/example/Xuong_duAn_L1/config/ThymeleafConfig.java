package com.example.Xuong_duAn_L1.config;

import com.example.Xuong_duAn_L1.util.DateFormatter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ThymeleafConfig {
    @Bean
    public DateFormatter dateFormatter() {
        return new DateFormatter();
    }
}
