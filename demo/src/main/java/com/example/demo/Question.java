package com.example.demo;

import java.util.ArrayList;

public class Question {
    private String question_description;
    private ArrayList<String> wrong_answers;
    private String correct_answer;

    public Question(String question_description, ArrayList<String> wrong_answers, String correct_answer) {
        this.question_description = question_description;
        this.wrong_answers = wrong_answers;
        this.correct_answer = correct_answer;
    }

    public Question(){}

    public String getQuestion_description() {
        return question_description;
    }

    public void setQuestion_description(String question_description) {
        this.question_description = question_description;
    }

    public ArrayList<String> getWrong_answers() {
        return wrong_answers;
    }

    public void setWrong_answers(ArrayList<String> wrong_answers) {
        this.wrong_answers = wrong_answers;
    }

    public String getCorrect_answer() {
        return correct_answer;
    }

    public void setCorrect_answer(String correct_answer) {
        this.correct_answer = correct_answer;
    }
}
