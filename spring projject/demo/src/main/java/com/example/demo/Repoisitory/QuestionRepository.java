package com.example.demo.Repoisitory;

import com.example.demo.model.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Integer> {
  Page<Question> findByQuizId(int quizId, Pageable pageable);
   Optional<Question> findByQuestionIdAndQuizId(int questionId, int quizId);
}
