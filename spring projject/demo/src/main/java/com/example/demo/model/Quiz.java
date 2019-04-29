package com.example.demo.model;


import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "quiz")
public class Quiz {

    @Id
    @GeneratedValue
    private int id;

    @Column(name="qtitle" ,nullable = false)
    private String title;

    @Column(name="qskill" ,nullable = false)
    private String skill_type;

    @Column(name="qpass" ,nullable = false)
    private int pass_score;

    @Column(name="qsize" ,nullable = false)
    private int num_questions;

    @Column(name="qduration" ,nullable = false)
    private int duration;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL)
    private Set<Question> questions ;


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
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
