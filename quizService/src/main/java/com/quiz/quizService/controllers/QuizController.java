package com.quiz.quizService.controllers;

import com.quiz.quizService.entities.Quiz;
import com.quiz.quizService.services.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @PostMapping
    public Quiz create(@RequestBody Quiz quiz){
//        System.out.println(quiz);
//        return quiz;
        return quizService.add(quiz);
    }

    @GetMapping
    public List<Quiz> get(){
        return quizService.get();
    }

    @GetMapping("/{id}")
    public Quiz get(@PathVariable Long id){
        return quizService.get(id);
    }
}
