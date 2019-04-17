package com.example.demo.newPackage;

import com.example.demo.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EvaluatorController {

    @Autowired
    private EvaluatorService EService;

    //return all quizzes stored in database
    @RequestMapping("/allQuiz")
    public List<Quiz> getAllqQuizzes()
    {
        return EService.getAllQuizzes() ;
    }

    //return quizzes in database based on a quiz type that is passed as a parameter
    @RequestMapping("/skillType/{type}")
    public List<Quiz> getQuizzesByType(@PathVariable String type)
    {
        return EService.getQuizzesByType(type);
    }

}
