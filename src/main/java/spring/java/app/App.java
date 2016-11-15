package spring.java.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.java.domain.BlockPost;
import spring.java.domain.DataSource;
import spring.java.service.BlogPostService;

/**
 * Created by Vlad on 11/16/2016.
 */
public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);


    public static void main(String[] args) {
        BlockPost blockPost = new BlockPost();
        ApplicationContext ctx = new AnnotationConfigApplicationContext(spring.java.config.JavaConfig.class);
//        BlogPostService blogPostService = ctx.getBean(BlogPostService.class);
//        System.out.println("sss");
//        blockPost.setId(1L);
//        blockPost.setTitle("Some title for post");
//        blogPostService.saveBlockPost(blockPost);
        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource);
        LOGGER.debug("ds url = " + dataSource.getUrl());
        LOGGER.debug("ds uName = " + dataSource.getUserName());
        LOGGER.debug("ds pass = " + dataSource.getPassword());

        ((ConfigurableApplicationContext) ctx).close();
    }
}
