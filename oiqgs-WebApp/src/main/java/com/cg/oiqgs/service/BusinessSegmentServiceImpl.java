package com.cg.oiqgs.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.oiqgs.dao.BusinessRepoImpl;
import com.cg.oiqgs.dao.IBusinessRepo;
import com.cg.oiqgs.model.BusinessSegment;

public class BusinessSegmentServiceImpl implements IBusinessSegmentService{
	IBusinessRepo repo;
	
	public  BusinessSegmentServiceImpl() throws SQLException {
		repo=new BusinessRepoImpl();
	}
	
	public BusinessSegment addBusinessSegment(BusinessSegment businessSegment) throws SQLException {
		
		return repo.addBusinessSegment(businessSegment);
	}

	public List<BusinessSegment> getAllBusinessSegment() throws SQLException {
		// TODO Auto-generated method stub
		return repo.getAllBusinessSegment();
	}

	public BusinessSegment getBusinessSegmentBybusSeqId(String busSeqId) throws SQLException {
		// TODO Auto-generated method stub
		return repo.getBusinessSegmentBybusSeqId(busSeqId);
	}

	public BusinessSegment updateBusinessSegment(BusinessSegment businessSegment) throws SQLException {
		// TODO Auto-generated method stub
		return repo.updateBusinessSegment(businessSegment);
	}

	public boolean deleteBusinessSegment(String busSegId) throws SQLException {
		// TODO Auto-generated method stub
		return repo.deleteBusinessSegment(busSegId);
	}

	
}
