package com.quiz.quizService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableFeignClients
public class QuizServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizServiceApplication.class, args);
	}

}
