package com.cg.oiqgs.model;

public class BusinessSegment {
	private String busSegId;
	private String busSegName;
	private int busSegSeq;
	
	public BusinessSegment() {
		// TODO Auto-generated constructor stub
	}
	
	
	public BusinessSegment(String busSegId, String busSegName, int busSegSeq) {
		super();
		this.busSegId = busSegId;
		this.busSegName = busSegName;
		this.busSegSeq = busSegSeq;
	}


	public String getBusSegId() {
		return busSegId;
	}

	public void setBusSegId(String busSegId) {
		this.busSegId = busSegId;
	}

	public String getBusSegName() {
		return busSegName;
	}

	public void setBusSegName(String busSegName) {
		this.busSegName = busSegName;
	}

	public int getBusSegSeq() {
		return busSegSeq;
	}

	public void setBusSegSeq(int busSegSeq) {
		this.busSegSeq = busSegSeq;
	}

	@Override
	public String toString() {
		return "BusinessSegment [busSegId=" + busSegId + ", busSegName=" + busSegName + ", busSegSeq=" + busSegSeq
				+ "]";
	}
	
}