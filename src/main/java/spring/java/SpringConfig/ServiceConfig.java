package spring.java.SpringConfig;

import com.sun.media.jfxmedia.logging.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.java.service.EmailService;
import spring.java.service.ServiceManager;
import spring.java.service.impl.EmailServiceImpl;
import spring.java.service.impl.ServiceManagerImpl;

/**
 * Created by Vlad on 11/16/2016.
 */
@Configuration
public class ServiceConfig {

    @Bean
    public EmailService emailService() {
        EmailService emailService = new EmailServiceImpl();

        return emailService;
    }
    @Bean
    public ServiceManager serviceManager() {
        return new ServiceManagerImpl();
    }
}
