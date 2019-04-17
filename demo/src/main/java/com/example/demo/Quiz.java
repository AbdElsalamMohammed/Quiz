package com.example.demo;

import java.util.ArrayList;

public class Quiz {

    private String title;
    private String skill_type;
    private int pass_score;
    private int num_questions;
    private int duration;
   // private ArrayList<Question> questions;

    public Quiz(String title, String skill_type, int pass_score, int num_questions, int duration) {
        this.title = title;
        this.skill_type = skill_type;
        this.pass_score = pass_score;
        this.num_questions = num_questions;
        this.duration = duration;
       // this.questions = questions;
    }

    public Quiz(){}

    public String getSkill_type() {
        return skill_type;
    }

    public void setSkill_type(String skill_type) {
        this.skill_type = skill_type;
    }

    public int getNum_questions() {
        return num_questions;
    }

    public void setNum_questions(int num_questions) {
        this.num_questions = num_questions;
    }

//    public ArrayList<Question> getQuestions() {
//        return questions;
//    }
//
//    public void setQuestions(ArrayList<Question> questions) {
//        this.questions = questions;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPass_score() {
        return pass_score;
    }

    public void setPass_score(int pass_score) {
        this.pass_score = pass_score;
    }
}
