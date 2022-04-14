
package com.tienda;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.templatemode.TemplateMode;

@Configuration
public class TemplateResolverConfiguration {
    //primer objeto que va a resolver las busquedas de paginas que hemos definido
    
    @Bean
    public SpringResourceTemplateResolver template_0(){
        SpringResourceTemplateResolver plantilla = new SpringResourceTemplateResolver();
        
        plantilla.setPrefix("classpath:/templates"); //direccionar a buscar al folder templates
        plantilla.setSuffix(".html");
        plantilla.setTemplateMode(TemplateMode.HTML);
        plantilla.setCharacterEncoding("UTF-8");
        plantilla.setOrder(0);
        plantilla.setCheckExistence(true);
        return plantilla;
    }
    
    @Bean
    public SpringResourceTemplateResolver template_1(){
        SpringResourceTemplateResolver plantilla = new SpringResourceTemplateResolver();
        
        plantilla.setPrefix("templates/articulo"); //direccionar a buscar al folder templates
        plantilla.setSuffix(".html");
        plantilla.setTemplateMode(TemplateMode.HTML);
        plantilla.setCharacterEncoding("UTF-8");
        plantilla.setOrder(1);
        plantilla.setCheckExistence(true);
        return plantilla;
    }
    
    @Bean
    public SpringResourceTemplateResolver template_2(){
        SpringResourceTemplateResolver plantilla = new SpringResourceTemplateResolver();
        
        plantilla.setPrefix("templates/categoria"); //direccionar a buscar al folder templates
        plantilla.setSuffix(".html");
        plantilla.setTemplateMode(TemplateMode.HTML);
        plantilla.setCharacterEncoding("UTF-8");
        plantilla.setOrder(2);
        plantilla.setCheckExistence(true);
        return plantilla;
    }
    
    @Bean
    public SpringResourceTemplateResolver template_3(){
        SpringResourceTemplateResolver plantilla = new SpringResourceTemplateResolver();
        
        plantilla.setPrefix("templates/cliente"); //direccionar a buscar al folder templates
        plantilla.setSuffix(".html");
        plantilla.setTemplateMode(TemplateMode.HTML);
        plantilla.setCharacterEncoding("UTF-8");
        plantilla.setOrder(3);
        plantilla.setCheckExistence(true);
        return plantilla;
    }
}
