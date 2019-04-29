package com.example.demo.Controller;

import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Repoisitory.QuestionRepository;
import com.example.demo.Repoisitory.QuizRepository;
import com.example.demo.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@Controller
public class QuestionController {

   @Autowired
       private QuestionRepository questionRepository;
    @Autowired
        private QuizRepository quizRepository;

   @PostMapping("/quizzes/{quizId}/question")
    public Question createQuestion(@PathVariable(value = "quizId") Integer quizId,
                                   @Valid @RequestBody Question question)
    {
        return  quizRepository.findById(quizId).map(quiz -> {
            question.setQuiz(quiz);
            return questionRepository.save(question);

        }).orElseThrow(()-> new ResourceNotFoundException("QuizId " + quizId + " not found"));
    }
}
