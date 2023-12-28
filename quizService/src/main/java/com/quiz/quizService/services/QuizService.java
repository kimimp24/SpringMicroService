package com.quiz.quizService.services;

import com.quiz.quizService.entities.Quiz;

import java.util.List;

public interface QuizService {
    Quiz add(Quiz quiz);
    List<Quiz> get();
    Quiz get(long id);
}
