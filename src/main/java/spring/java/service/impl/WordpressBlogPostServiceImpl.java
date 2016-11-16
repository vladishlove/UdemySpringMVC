package spring.java.service.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spring.java.domain.BlogPost;
import spring.java.service.BlogPostService;

/**
 * Created by Vlad on 11/16/2016.
 */
public class WordPressBlogPostServiceImpl implements BlogPostService {

    private static final Logger LOGGER = LoggerFactory.getLogger(WordPressBlogPostServiceImpl.class);

    @Override
    public void saveBlogPost(BlogPost blogPost) {
        LOGGER.debug("WordPressBlogPostServiceImpl: save point is called");
    }
}
