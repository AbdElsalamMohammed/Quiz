package com.example.demo.Repoisitory;

import com.example.demo.model.Question_choices;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QuestionChoicesRepository extends JpaRepository<Question_choices,Integer> {

   Page<Question_choices> findByQuestionQuestionId(int questionId, Pageable pageable);
   Optional<Question_choices> findByChoiceIdAndQuestionQuestionId(int choiceId, int questionId);

}
