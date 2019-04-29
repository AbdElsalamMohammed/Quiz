package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue
    private int questionId;

    @Column(name="description" ,nullable = false)
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    @ManyToOne
    @JoinColumn(nullable = false)
    @JsonIgnore
    private Quiz quiz;



//    @OneToMany(mappedBy = "questions", cascade = CascadeType.ALL)
//    private Set<Question> question_choices ;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }



    public Question(){}

    public String getQuestion_description() {
            return description;
    }




    public void setQuestion_description(String question_description) {
        this.description = question_description;
    }



}
