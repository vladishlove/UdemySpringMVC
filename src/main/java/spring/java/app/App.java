package spring.java.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import spring.java.domain.BlogPost;
import spring.java.domain.DataSource;
import spring.java.service.BlogPostService;
import spring.java.service.EmailService;
import spring.java.service.ServiceManager;

/**
 * Created by Vlad on 11/16/2016.
 */
public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);


    public static void main(String[] args) {
        BlogPost blogPost = new BlogPost();
        ApplicationContext ctx = new AnnotationConfigApplicationContext(spring.java.config.JavaConfig.class);
        BlogPostService blogPostService = ctx.getBean("blogPostService", BlogPostService.class);

        blogPost.setId(1L);
        blogPost.setTitle("Some title for post");
        blogPostService.saveBlogPost(blogPost);
        DataSource dataSource = ctx.getBean(DataSource.class);
        EmailService emailService = ctx.getBean(EmailService.class);
        emailService.sendEmail();
        System.out.println(dataSource);
        LOGGER.debug("ds url = " + dataSource.getUrl());
        LOGGER.debug("ds uName = " + dataSource.getUserName());
        LOGGER.debug("ds pass = " + dataSource.getPassword());

        System.out.println("------------------");
        ServiceManager manager = ctx.getBean(ServiceManager.class);
        manager.sendBlogPost(blogPost);

        ((ConfigurableApplicationContext) ctx).close();
    }
}