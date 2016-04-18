package com.tortuesoft.dto;
/**
 * Data Transfer Object for MultiChoice Question
 * @author binh
 *
 */
public class MultiChoicesQuestion extends AbstractQuestion {

	/**
	 * Default constructor
	 */
	public MultiChoicesQuestion(){
		setQuestionType(QUESTION_TYPE_MCQ);
	}
}
