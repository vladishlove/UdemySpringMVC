package spring.java.service.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import spring.java.domain.BlogPost;
import spring.java.domain.DataSource;
import spring.java.service.BlogPostService;
import spring.java.service.EmailService;

/**
 * Created by Vlad on 11/16/2016.
 */
public class BlogPostServiceImpl implements BlogPostService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BlogPostServiceImpl.class);

    @Autowired
    private DataSource dataSource;
    @Autowired
    private EmailService emailService;

    @Override
    public void saveBlogPost(BlogPost blogPost) {
        LOGGER.debug("BlogPostServiceImpl: save point is called");
        LOGGER.debug("BlogPostServiceImpl: dataSource method is called " + "DS UN: " + dataSource.getUserName());
        LOGGER.debug("BlogPostServiceImpl: emailService method is called");
        emailService.sendEmail();
    }
}