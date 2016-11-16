package spring.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import spring.java.SpringConfig.ServiceConfig;
import spring.java.service.BlogPostService;
import spring.java.service.ServiceManager;
import spring.java.service.impl.BlogPostServiceImpl;
import spring.java.service.impl.MediumBlogPostServiceImpl;
import spring.java.service.impl.ServiceManagerImpl;
import spring.java.service.impl.WordPressBlogPostServiceImpl;

/**
 * Created by Vlad on 11/16/2016.
 */

//Instead of xml config
@ComponentScan(basePackages =("spring.java"))
@Import(value = {ServiceConfig.class})
public class JavaConfig {

    @Bean(name = "blogPostService")
    public BlogPostService blogPostService() {

        return new BlogPostServiceImpl();
    }
    @Bean(name = "wordPressBlogPostService")
    public BlogPostService wordPressBlogPostService() {

        return new WordPressBlogPostServiceImpl();
    }
    @Bean(name = "mediumBlogPostService")
    public BlogPostService mediumBlogPostService() {

        return new MediumBlogPostServiceImpl();
    }
}