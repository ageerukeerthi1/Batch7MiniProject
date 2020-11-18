package com.cg.oiqgs.dao;

import java.sql.SQLException;
import java.util.List;

import com.cg.oiqgs.model.BusinessSegment;

public interface IBusinessRepo {
	BusinessSegment addBusinessSegment(BusinessSegment businessSegment) throws SQLException;
	List<BusinessSegment> getAllBusinessSegment() throws SQLException;
	BusinessSegment getBusinessSegmentBybusSeqId(String busSeqId) throws SQLException;
}
