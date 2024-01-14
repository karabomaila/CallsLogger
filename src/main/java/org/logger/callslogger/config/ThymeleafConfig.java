package org.logger.callslogger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring6.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

@Configuration
public class ThymeleafConfig {


//    @Bean
//    public ClassLoaderTemplateResolver templateResolver(){
//        ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
//        resolver.setPrefix("templates/");
//        resolver.setSuffix(".html");
//        resolver.setCacheable(false);
//        resolver.setTemplateMode(TemplateMode.HTML);
//        resolver.setCharacterEncoding("UTF-8");
//        return resolver;
//    }

//    @Bean
//    public SpringTemplateEngine templateEngine(){
//        SpringTemplateEngine engine = new SpringTemplateEngine();
//        engine.setTemplateResolver(templateResolver());
//        engine.setEnableSpringELCompiler(true);
////        engine.addDialect(new SpringSecurityDialect());
////        engine.addDialect(new LayoutDialect());
//        return engine;
//    }

//    @Bean
//    public SpringResourceTemplateResolver springResourceTemplateResolver() {
//        return new SpringResourceTemplateResolver();
//    }

//    @Bean
//    public ViewResolver thymeleafViewResolver(){
//        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
//        resolver.setTemplateEngine(templateEngine());
//        resolver.setCharacterEncoding("UTF-8");
//        resolver.setViewNames(new String[] {"*.html"});
//
//        return resolver;
//    }
}
