package com.cg.iqgs.model;

public class PolicyQuestions {
	private String polQuesId;
	private int polQuesSeq;
	private String polQuesDesc;
	private String polQuesAns1;
	private String polQuesAns2;
	private String polQuesAns3;
	private String polQuesAns4;
	private int polQuesAns1Weightage;
	private int polQuesAns2Weightage;
	private int polQuesAns3Weightage;
	private int polQuesAns4Weightage;
	@Override
	public String toString() {
		return "PolicyQuestions [polQuesId=" + polQuesId + ", polQuesSeq=" + polQuesSeq + ", polQuesDesc=" + polQuesDesc
				+ ", polQuesAns1=" + polQuesAns1 + ", polQuesAns2=" + polQuesAns2 + ", polQuesAns3=" + polQuesAns3
				+ ", polQuesAns4=" + polQuesAns4 + ", polQuesAns1Weightage=" + polQuesAns1Weightage
				+ ", polQuesAns2Weightage=" + polQuesAns2Weightage + ", polQuesAns3Weightage=" + polQuesAns3Weightage
				+ ", polQuesAns4Weightage=" + polQuesAns4Weightage + "]";
	}
	public PolicyQuestions(String polQuesId, int polQuesSeq, String polQuesDesc, String polQuesAns1, String polQuesAns2,
			String polQuesAns3, String polQuesAns4, int polQuesAns1Weightage, int polQuesAns2Weightage,
			int polQuesAns3Weightage, int polQuesAns4Weightage) {
		super();
		this.polQuesId = polQuesId;
		this.polQuesSeq = polQuesSeq;
		this.polQuesDesc = polQuesDesc;
		this.polQuesAns1 = polQuesAns1;
		this.polQuesAns2 = polQuesAns2;
		this.polQuesAns3 = polQuesAns3;
		this.polQuesAns4 = polQuesAns4;
		this.polQuesAns1Weightage = polQuesAns1Weightage;
		this.polQuesAns2Weightage = polQuesAns2Weightage;
		this.polQuesAns3Weightage = polQuesAns3Weightage;
		this.polQuesAns4Weightage = polQuesAns4Weightage;
	}
	
	public PolicyQuestions() {
		super();
	}
	public String getPolQuesId() {
		return polQuesId;
	}
	public void setPolQuesId(String polQuesId) {
		this.polQuesId = polQuesId;
	}
	public int getPolQuesSeq() {
		return polQuesSeq;
	}
	public void setPolQuesSeq(int polQuesSeq) {
		this.polQuesSeq = polQuesSeq;
	}
	public String getPolQuesDesc() {
		return polQuesDesc;
	}
	public void setPolQuesDesc(String polQuesDesc) {
		this.polQuesDesc = polQuesDesc;
	}
	public String getPolQuesAns1() {
		return polQuesAns1;
	}
	public void setPolQuesAns1(String polQuesAns1) {
		this.polQuesAns1 = polQuesAns1;
	}
	public String getPolQuesAns2() {
		return polQuesAns2;
	}
	public void setPolQuesAns2(String polQuesAns2) {
		this.polQuesAns2 = polQuesAns2;
	}
	public String getPolQuesAns3() {
		return polQuesAns3;
	}
	public void setPolQuesAns3(String polQuesAns3) {
		this.polQuesAns3 = polQuesAns3;
	}
	public String getPolQuesAns4() {
		return polQuesAns4;
	}
	public void setPolQuesAns4(String polQuesAns4) {
		this.polQuesAns4 = polQuesAns4;
	}
	public int getPolQuesAns1Weightage() {
		return polQuesAns1Weightage;
	}
	public void setPolQuesAns1Weightage(int polQuesAns1Weightage) {
		this.polQuesAns1Weightage = polQuesAns1Weightage;
	}
	public int getPolQuesAns2Weightage() {
		return polQuesAns2Weightage;
	}
	public void setPolQuesAns2Weightage(int polQuesAns2Weightage) {
		this.polQuesAns2Weightage = polQuesAns2Weightage;
	}
	public int getPolQuesAns3Weightage() {
		return polQuesAns3Weightage;
	}
	public void setPolQuesAns3Weightage(int polQuesAns3Weightage) {
		this.polQuesAns3Weightage = polQuesAns3Weightage;
	}
	public int getPolQuesAns4Weightage() {
		return polQuesAns4Weightage;
	}
	public void setPolQuesAns4Weightage(int polQuesAns4Weightage) {
		this.polQuesAns4Weightage = polQuesAns4Weightage;
	}
	
	
}
