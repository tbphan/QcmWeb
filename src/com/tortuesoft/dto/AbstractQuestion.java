package com.tortuesoft.dto;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractQuestion {
	int questionId;
	int testId;
	String questionNo;
	String questionText;
	String questionType;
	List<QuestionChoice> questionChoices;
	
	public static final String QUESTION_TYPE_MCQ = "MCQ";
	public static final String QUESTION_TYPE_SCQ = "SCQ";
	public int getQuestionId() {
		return questionId;
	}
	protected void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public int getTestId() {
		return testId;
	}
	protected void setTestId(int testId) {
		this.testId = testId;
	}
	public String getQuestionNo() {
		return questionNo;
	}
	protected void setQuestionNo(String questionNo) {
		this.questionNo = questionNo;
	}
	public String getQuestionText() {
		return questionText;
	}
	protected void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	public String getQuestionType() {
		return questionType;
	}
	protected void setQuestionType(String questionType) {
		this.questionType = questionType;
	}
	public List<QuestionChoice> getQuestionChoices() {
		return questionChoices;
	}
	
	public void addChoice(QuestionChoice _choice){
		if(questionChoices == null){
			questionChoices = new ArrayList<>();
		}
		questionChoices.add(_choice);
	}

}
