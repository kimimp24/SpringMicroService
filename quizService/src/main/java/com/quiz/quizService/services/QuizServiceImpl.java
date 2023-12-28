package com.quiz.quizService.services;

import com.quiz.quizService.entities.Quiz;
import com.quiz.quizService.repositories.QuizRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizServiceImpl implements QuizService{
    private QuizRepository quizRepository;
    private QuestionClient questionClient;
    public QuizServiceImpl(QuizRepository quizRepository,QuestionClient questionClient) {
        this.quizRepository = quizRepository;
        this.questionClient=questionClient;
    }

    @Override
    public Quiz add(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> get() {
       List<Quiz> quizzes = quizRepository.findAll();
       List<Quiz> q =quizzes.stream().map(quiz->{
            quiz.setQuestions(questionClient.getQuestionsOfQuiz(quiz.getId()));
            return quiz;
       }).collect(Collectors.toList());
       System.out.println(q);
        System.out.println(quizzes);
       return quizzes;
    }

    @Override
    public Quiz get(long id) {
        Quiz quiz = quizRepository.findById(id).orElseThrow(()->new RuntimeException("Quiz not found"));
        quiz.setQuestions(questionClient.getQuestionsOfQuiz(quiz.getId()));
        return quiz;
    }
}
