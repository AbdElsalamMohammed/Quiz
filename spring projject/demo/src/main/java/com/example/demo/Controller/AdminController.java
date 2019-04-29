package com.example.demo.Controller;

import com.example.demo.Repoisitory.QuizRepository;
import com.example.demo.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class AdminController {

    @Autowired
    private QuizRepository quizRepository;


    @PostMapping("/create")
    public Quiz createQuiz(@Valid@RequestBody Quiz quiz)
    {
        return quizRepository.save(quiz);
    }

}




