package com.question.QuestionService.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long questionsId;
    private String question ;

    private String answer;
    private Long quizId;
}
