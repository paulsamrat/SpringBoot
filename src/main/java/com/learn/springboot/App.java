package com.learn.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.learn.springboot.entity.Animal;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext appCtx = SpringApplication.run(App.class, args);
        final Animal obj = appCtx.getBean(Animal.class);
        obj.hello();
    }
}
