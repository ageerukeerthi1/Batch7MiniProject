package com.cg.iqgs.model;

public class PolicyDetails {
	private long policyNumber;
	private String questionId;
	private String answer;
	
	public PolicyDetails() {
		
	}

	public long getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(long policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public PolicyDetails(long policyNumber, String questionId, String answer) {
		super();
		this.policyNumber = policyNumber;
		this.questionId = questionId;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "PolicyDetails [policyNumber=" + policyNumber + ", questionId=" + questionId + ", answer=" + answer
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answer == null) ? 0 : answer.hashCode());
		result = prime * result + (int) (policyNumber ^ (policyNumber >>> 32));
		result = prime * result + ((questionId == null) ? 0 : questionId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PolicyDetails other = (PolicyDetails) obj;
		if (answer == null) {
			if (other.answer != null)
				return false;
		} else if (!answer.equals(other.answer))
			return false;
		if (policyNumber != other.policyNumber)
			return false;
		if (questionId == null) {
			if (other.questionId != null)
				return false;
		} else if (!questionId.equals(other.questionId))
			return false;
		return true;
	}
	
	
	
    
}
