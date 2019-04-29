package com.example.demo.Controller;

import com.example.demo.model.Quiz;
import com.example.demo.Repoisitory.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EvaluatorController {

    @Autowired
    private QuizRepository quizRepository;

    //get all quizzes
    @GetMapping("/quizzes")
    public List<Quiz> getAllqQuizzes()
    {
        return quizRepository.findAll();
    }

    //get certain quizzes based on type
    @RequestMapping("/quizzes/{type}")
    public ArrayList<Quiz> getQuizzesByType(@PathVariable(value = "type") String type)
    {
        List<Quiz> allQuizzes= quizRepository.findAll();
        ArrayList<Quiz> result =new ArrayList<>();
        for(Quiz q :allQuizzes)
        {
            if(q.getSkill_type().equals(type))
                result.add(q);
        }
        return  result;
    }

}
