package com.cg.iqgs.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.iqgs.model.BusinessSegment;


public interface IBusinessSegmentService {
	public List<BusinessSegment> getAllBusinessSegment()throws SQLException;
	public BusinessSegment addBusinessSegment(BusinessSegment businessSegment)throws SQLException;
	public BusinessSegment getBusinessSegmentBybusSegId(String busSegId) throws SQLException;
	public BusinessSegment updateBusinessSegment(BusinessSegment businessSegment) throws SQLException;
	public boolean deleteBusinessSegment(String busSegId) throws SQLException;
}