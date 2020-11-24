package com.cg.iqgs.model;

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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((busSegId == null) ? 0 : busSegId.hashCode());
		result = prime * result + ((busSegName == null) ? 0 : busSegName.hashCode());
		result = prime * result + busSegSeq;
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
		BusinessSegment other = (BusinessSegment) obj;
		if (busSegId == null) {
			if (other.busSegId != null)
				return false;
		} else if (!busSegId.equals(other.busSegId))
			return false;
		if (busSegName == null) {
			if (other.busSegName != null)
				return false;
		} else if (!busSegName.equals(other.busSegName))
			return false;
		if (busSegSeq != other.busSegSeq)
			return false;
		return true;
	}
	
}
