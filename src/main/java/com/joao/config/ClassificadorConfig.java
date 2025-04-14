package com.joao.config;

import com.joao.classificacao.Config;
import com.joao.classificacao.ClassificadorInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassificadorConfig {

    @Bean
    public ClassificadorInterface classificador() {
        return new Config();
    }
}
