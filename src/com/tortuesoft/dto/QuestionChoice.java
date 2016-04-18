package com.tortuesoft.dto;

public class QuestionChoice {
	int choiceId;
	int questionId;
	String choiceNo;
	boolean correctChoice;
	public int getChoiceId() {
		return choiceId;
	}
	public void setChoiceId(int choiceId) {
		this.choiceId = choiceId;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getChoiceNo() {
		return choiceNo;
	}
	public void setChoiceNo(String choiceNo) {
		this.choiceNo = choiceNo;
	}
	public boolean isCorrectChoice() {
		return correctChoice;
	}
	public void setCorrectChoice(boolean correctChoice) {
		this.correctChoice = correctChoice;
	}

}
