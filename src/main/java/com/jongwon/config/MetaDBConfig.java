package com.jongwon.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
public class MetaDBConfig {

//    충돌 방지
    @Primary
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource-meta")
    public DataSource metaDBSource() {

        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean
    public PlatformTransactionManager metaTranscationManager(){

        return new DataSourceTransactionManager(metaDBSource());
    }
}
