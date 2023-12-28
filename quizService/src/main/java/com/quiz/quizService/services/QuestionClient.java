package com.quiz.quizService.services;

import com.quiz.quizService.entities.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

//@FeignClient(url = "http://localhost:8082", value = "Question-Client" )
@FeignClient(name = "QUESTION-SERVICE")
public interface QuestionClient {
    @GetMapping("/question/quiz/{id}")
    List<Question> getQuestionsOfQuiz(@PathVariable Long id);
}
