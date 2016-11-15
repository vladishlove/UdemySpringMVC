package spring.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.java.service.BlogPostService;
import spring.java.service.impl.BlogPostServiceImpl;

/**
 * Created by Vlad on 11/16/2016.
 */

//Instead of xml config
@ComponentScan(basePackages =("spring.java"))
public class JavaConfig {

    @Bean
    public BlogPostService blogPostService() {
        return new BlogPostServiceImpl();
    }
}