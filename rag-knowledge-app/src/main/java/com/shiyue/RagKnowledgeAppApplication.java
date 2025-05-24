package com.shiyue;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Configurable
public class RagKnowledgeAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(RagKnowledgeAppApplication.class, args);
    }

}
