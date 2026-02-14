package org.example.todoapispring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApiSpringApplication {
    /**
     * spring  have the capabilities of reading the classes
     * only if we are allowing them to read , by adding the @restcontroller
     * by the concept of beans they are able to do it.
     * @restcontroller is the behind very serialisation in the springboot
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(TodoApiSpringApplication.class, args);
    }

}
