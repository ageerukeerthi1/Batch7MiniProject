package com.cg.iqgs.dao;

import java.sql.SQLException;
import java.util.List;

import com.cg.iqgs.model.BusinessSegment;

public interface IBusinessRepo {
	BusinessSegment addBusinessSegment(BusinessSegment businessSegment) throws SQLException;
	List<BusinessSegment> getAllBusinessSegment() throws SQLException;
	BusinessSegment getBusinessSegmentBybusSeqId(String busSeqId) throws SQLException;
	BusinessSegment updateBusinessSegment(BusinessSegment businessSegment) throws SQLException;
	boolean deleteBusinessSegment(String busSegId) throws SQLException;
}
