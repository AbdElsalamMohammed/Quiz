package com.example.demo.Repoisitory;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Quiz;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends JpaRepository<Quiz,Integer> {

}
