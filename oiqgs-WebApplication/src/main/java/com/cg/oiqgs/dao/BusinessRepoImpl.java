package com.cg.oiqgs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cg.oiqgs.exception.BusinessSegmentNotFoundException;
import com.cg.oiqgs.model.BusinessSegment;
import com.cg.oiqgs.model.PolicyDetails;

public class BusinessRepoImpl implements IBusinessRepo {
	PreparedStatement psmt;
	ResultSet bResultSet;
	Connection connection;

	public BusinessRepoImpl() throws SQLException {
		connection=DBUtil.createConnection();
	}
	public BusinessSegment addBusinessSegment(BusinessSegment businessSegment ) throws SQLException {
		
		psmt=connection.prepareStatement("insert into Business_Segment values(?,?,?)");
		psmt.setString(1, businessSegment.getBusSegId());
		psmt.setString(2, businessSegment.getBusSegName());
		psmt.setInt(3, businessSegment.getBusSegSeq());
		
		
		int count=psmt.executeUpdate();
		return businessSegment;
	}
	
	public List<BusinessSegment> getAllBusinessSegment() throws SQLException {
		
		psmt=connection.prepareStatement("select * from Business_Segment");
			
			bResultSet=psmt.executeQuery();
			
			List<BusinessSegment> s=new ArrayList<BusinessSegment>();
			while(bResultSet.next()) {
			BusinessSegment businessSegment=new BusinessSegment();
			businessSegment.setBusSegId(bResultSet.getString("bus_Seg_Id"));
			businessSegment.setBusSegName(bResultSet.getString("bus_Seg_Name"));
			businessSegment.setBusSegSeq(bResultSet.getInt("bus_Seg_Seq"));
			s.add(businessSegment);
		}
			return s;
		}
	
	public BusinessSegment updateBusinessSegment(BusinessSegment businessSegment) throws SQLException {
		psmt=connection.prepareStatement("update Business_Segment set Bus_Seg_Id=?,Bus_Seg_Name=?,Bus_Seg_Seq=?" );
		psmt.setString(1, businessSegment.getBusSegName());
		psmt.setString(2, businessSegment.getBusSegId());
		psmt.setInt(3, businessSegment.getBusSegSeq());	
		int count=psmt.executeUpdate();
		return businessSegment;
	}
	
	public BusinessSegment getBusinessSegmentBybusSeqId(String bus_Seq_Id) throws SQLException {
		psmt=connection.prepareStatement("select * from Business_Segment where Bus_Seg_Id=?");
		psmt.setString(1, bus_Seq_Id);
		bResultSet=psmt.executeQuery();
		if(!bResultSet.next()) {
			throw new BusinessSegmentNotFoundException("Busines_Segment with ID ["+bus_Seq_Id+"] does not exist");
		}
		BusinessSegment businessSegment=new BusinessSegment();
		businessSegment.setBusSegId(bResultSet.getString("Bus_Seg_Id"));
		businessSegment.setBusSegName(bResultSet.getString("Bus_Seg_Name"));
		businessSegment.setBusSegSeq(bResultSet.getInt("Bus_Seg_Seq"));
		return businessSegment;
	}
	public boolean deleteBusinessSegment(String busSegId) throws SQLException {
		BusinessSegment oldbusinessSegment=getBusinessSegmentBybusSeqId(busSegId);
		psmt=connection.prepareStatement("delete from Business_Segment where bus_Seg_Id=?");
		psmt.setString(1, busSegId);
		int deleted=psmt.executeUpdate();
		return deleted>0;
	}
}