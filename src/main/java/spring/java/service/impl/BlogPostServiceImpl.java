package spring.java.service.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spring.java.domain.BlockPost;
import spring.java.service.BlogPostService;

/**
 * Created by Vlad on 11/16/2016.
 */
public class BlogPostServiceImpl implements BlogPostService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BlogPostServiceImpl.class);

    @Override
    public void saveBlockPost(BlockPost blockPost) {
        LOGGER.debug("BlogPostServiceImpl: save point is called");
    }
}
