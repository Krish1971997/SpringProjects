package com.test.quizapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.test.quizapp.dao.QuestionDao;
import com.test.quizapp.model.Question;

@Service
public class QuestionService {

	@Autowired
	QuestionDao questionDao;

	public List<Question> getAllQuestions() {
		return questionDao.findAll();
	}
	
	public ResponseEntity<String> addQuestion(Question question) {
        questionDao.save(question);
        return new ResponseEntity<>("success",HttpStatus.CREATED);
    }
	
}
