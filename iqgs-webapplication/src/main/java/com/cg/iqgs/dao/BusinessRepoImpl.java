package com.cg.iqgs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cg.iqgs.exception.BusinessSegmentNotFoundException;
import com.cg.iqgs.model.BusinessSegment;
import com.cg.iqgs.model.PolicyDetails;

public class BusinessRepoImpl implements IBusinessRepo {
	PreparedStatement psmt;
	ResultSet bResultSet;
	Connection connection;

	public BusinessRepoImpl()  {
		try {
			connection=DBUtil.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public BusinessSegment addBusinessSegment(BusinessSegment businessSegment ) throws SQLException {
		
		psmt=connection.prepareStatement("insert into Business_Segment values(?,?,?)");
		psmt.setString(1, businessSegment.getBusSegId());
		psmt.setInt(2, businessSegment.getBusSegSeq());
		psmt.setString(3, businessSegment.getBusSegName());
		int count=psmt.executeUpdate();
		
		return businessSegment;
	}
	
	public BusinessSegment updateBusinessSegment(BusinessSegment businessSegment) throws SQLException {
		psmt=connection.prepareStatement("update Business_Segment set Bus_Seg_Id=?,Bus_Seg_Name=?,Bus_Seg_Seq=?" );
		psmt.setString(1, businessSegment.getBusSegId());
		psmt.setInt(2, businessSegment.getBusSegSeq());
		psmt.setString(3, businessSegment.getBusSegName());
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
		businessSegment.setBusSegSeq(bResultSet.getInt("Bus_Seg_Seq"));
		businessSegment.setBusSegName(bResultSet.getString("Bus_Seg_Name"));
		
		return businessSegment;
	}
	public boolean deleteBusinessSegment(String busSegId) throws SQLException {
		BusinessSegment oldbusinessSegment=getBusinessSegmentBybusSeqId(busSegId);
		psmt=connection.prepareStatement("delete from Business_Segment where bus_Seg_Id=?");
		psmt.setString(1, busSegId);
		int deleted=psmt.executeUpdate();
		return deleted>0;
	}
	
	public List<BusinessSegment> getAllBusinessSegment() throws SQLException {
		
		psmt=connection.prepareStatement("select * from Business_Segment");
			
		     bResultSet=psmt.executeQuery();
			
			List<BusinessSegment> businessSegments=new ArrayList<BusinessSegment>();
			while(bResultSet.next()) {
				BusinessSegment businessSegment=new BusinessSegment();
				businessSegment.setBusSegId(bResultSet.getString("Bus_Seg_Id"));
				businessSegment.setBusSegSeq(bResultSet.getInt("Bus_Seg_Seq"));
				businessSegment.setBusSegName(bResultSet.getString("Bus_Seg_Name"));
			businessSegments.add(businessSegment);
		}
			return businessSegments;
		}
}