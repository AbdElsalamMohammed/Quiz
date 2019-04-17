package com.example.demo.newPackage;

import com.example.demo.Quiz;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
 class EvaluatorService {

        private List<Quiz> database= Arrays.asList(
                new Quiz("software","problem solving", 10 , 20 ,15 ),
                new Quiz("artificial intelligence","problem solving", 10 , 20 ,15 ),
                new Quiz("parallel processing","critical thinking", 30 , 100 ,30 ),
                new Quiz("technical writing","critical thinking", 10 , 20 ,15 ),
                new Quiz("graphics","practical", 100 , 50 ,75 ),
                new Quiz("algorithms","practical", 150 , 70 ,12 )
                );


    List<Quiz> getAllQuizzes() {
        return database;
    }


    List<Quiz> getQuizzesByType(String type) {
         return database.stream().filter(t->t.getSkill_type().equals(type)).collect(Collectors.toList());
    }
}
