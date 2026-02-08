
package com.example.sync.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class SybaseDataSourceConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.sybase")
    public HikariDataSource sybaseDataSource() {
        return new HikariDataSource();
    }

    @Bean
    public JdbcTemplate sybaseJdbcTemplate(HikariDataSource ds) {
        return new JdbcTemplate(ds);
    }
}
