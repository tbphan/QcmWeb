package com.tortuesoft.service.data;

import java.util.List;

import com.tortuesoft.dto.AbstractQuestion;

public interface DataProvider {
	/**
	 * Return all question for given test
	 * @param _testId
	 * @return
	 */
	List<Integer> loadAllQuestions(int _testId);
	
	AbstractQuestion loadQuestion(int _questionId);

}
