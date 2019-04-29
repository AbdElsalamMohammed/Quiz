package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "question_choices")
public class Question_choices {
    @Id
    @GeneratedValue
    private int choiceId ;

    @Column(name="is_right_choice" ,nullable = false)
    private boolean isRightChoice;

    @Column(name="choice" ,nullable = false)
    private String choice;

    @ManyToOne
    @JoinColumn(nullable = false)
    //foreign key
    private Question question;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public int getChoiceId() {
        return choiceId;
    }

    public void setChoiceId(int choiceId) {
        this.choiceId = choiceId;
    }



    public boolean isRightChoice() {
        return isRightChoice;
    }

    public void setRightChoice(boolean rightChoice) {
        isRightChoice = rightChoice;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }
}
