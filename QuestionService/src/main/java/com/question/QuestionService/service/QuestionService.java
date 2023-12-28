package com.question.QuestionService.service;

import com.question.QuestionService.entities.Question;

import java.util.List;

public interface QuestionService {
    Question create(Question question);
    List<Question> getQuestion();
    Question getQuestion(Long id);

    List<Question>getQuestionsOfQuiz(Long id);
}
