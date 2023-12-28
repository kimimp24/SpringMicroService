package com.question.QuestionService.service;

import com.question.QuestionService.entities.Question;
import com.question.QuestionService.repositories.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService{

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    private QuestionRepository questionRepository;
    @Override
    public Question create(Question question) {
       return questionRepository.save(question);
    }

    @Override
    public List<Question> getQuestion() {
        return questionRepository.findAll();
    }

    @Override
    public Question getQuestion(Long id) {
        return questionRepository.findById(id).orElseThrow(()->new RuntimeException("Question not found"));
    }

    @Override
    public List<Question> getQuestionsOfQuiz(Long id) {
        return questionRepository.findAllByQuizId(id);
    }
}
