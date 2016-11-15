package spring.java.config;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.java.domain.DataSource;

/**
 * Created by Vlad on 11/16/2016.
 */
@Configuration
public class DBConfig {

    @Bean
    public DataSource dataSource() {
        DataSource dataSource = new DataSource();
        dataSource.setPassword("1");
        dataSource.setUrl("sm url");
        dataSource.setUserName("user");
        return dataSource;
    }
}