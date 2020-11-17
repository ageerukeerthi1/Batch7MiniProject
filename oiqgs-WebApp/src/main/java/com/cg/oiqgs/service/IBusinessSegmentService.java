package com.cg.oiqgs.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.oiqgs.model.BusinessSegment;


public interface IBusinessSegmentService {
	public List<BusinessSegment> getAllBusinessSegment()throws SQLException;
	public BusinessSegment addBusinessSegment(BusinessSegment businessSegment)throws SQLException;
}
