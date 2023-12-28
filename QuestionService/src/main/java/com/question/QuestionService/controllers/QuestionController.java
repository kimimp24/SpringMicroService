package com.question.QuestionService.controllers;

import com.question.QuestionService.entities.Question;
import com.question.QuestionService.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping()
    public Question addQuestion(@RequestBody Question question){
        return questionService.create(question);
    }

    @GetMapping
    public List<Question> get(){
        return questionService.getQuestion();
    }
    @GetMapping("/{id}")
    public Question get(@PathVariable Long id){
        return questionService.getQuestion(id);
    }
    @GetMapping("/quiz/{id}")
    public List<Question> getQuestionsByQuizId(@PathVariable Long id){
        return questionService.getQuestionsOfQuiz(id);
    }
}
