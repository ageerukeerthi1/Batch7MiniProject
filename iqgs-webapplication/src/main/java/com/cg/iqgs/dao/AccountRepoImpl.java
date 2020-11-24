package com.cg.iqgs.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import com.cg.iqgs.model.Accounts;
import com.cg.iqgs.dao.DBUtil;
//import com.cg.iqgs.exception.AccountNotFoundException;
public class AccountRepoImpl implements AccountRepo {
	Connection conn;
	PreparedStatement psmt;
	ResultSet rsAccounts;
	public AccountRepoImpl() {
		try {
			conn=DBUtil.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	@Override
	public Accounts addAccount(Accounts account) throws SQLException {		
		psmt=conn.prepareStatement("insert into Accounts values(?,?,?,?,?,?,?,?)");
		psmt.setLong(1, account.getAccountNumber());
		psmt.setString(2, account.getInsuredName());
		psmt.setString(3, account.getInsuredStreet());
		psmt.setString(4, account.getInsuredCity());
		psmt.setString(5, account.getInsuredState());
		psmt.setLong(6, account.getInsuredZip());
		psmt.setString(7, account.getBusinessSegment());
		psmt.setString(8, account.getUserName());
		int count =psmt.executeUpdate();
		return account;
	}	
	@Override
	public Accounts getAccountByNumber(long accountNumber) throws SQLException {
		psmt=conn.prepareStatement("select * from Accounts where account_Number=?");
		psmt.setLong(1, accountNumber);
		rsAccounts=psmt.executeQuery();
		/*if(!rsAccounts.next()) {
			throw new AccountNotFoundException("Account with Number ["+accountNumber+"] does not exist");
		}*/
		Accounts account=new Accounts();
		account.setAccountNumber(rsAccounts.getLong("account_Number"));
		account.setInsuredName(rsAccounts.getString("insured_Name"));
		account.setInsuredStreet(rsAccounts.getString("insured_Street"));
		account.setInsuredCity(rsAccounts.getString("insured_City"));
		account.setInsuredState(rsAccounts.getString("insured_State"));
		account.setInsuredZip(rsAccounts.getLong("insured_Zip"));
		account.setBusinessSegment(rsAccounts.getString("business_Segment"));
		account.setUserName(rsAccounts.getString("user_name"));
		
		return account;
	}
	
	@Override
	public Accounts updateAccount(Accounts account) throws SQLException{
		// TODO Auto-generated method stub
		Accounts oldAccount=getAccountByNumber(account.getAccountNumber());
		psmt=conn.prepareStatement("update Accounts set Insured_Name=?, Insured_Street=?, Insured_City=?,Insured_State=?, Insured_Zip=?, Business_Segment=? where Account_Number=?");
		psmt.setLong(1, account.getAccountNumber());
		psmt.setString(2, account.getInsuredName());
		psmt.setString(3, account.getInsuredStreet());
		psmt.setString(4, account.getInsuredCity());
		psmt.setString(5, account.getInsuredState());
		psmt.setLong(6, account.getInsuredZip());
		psmt.setString(7, account.getBusinessSegment());
		
		psmt.executeUpdate();
		
		return account;
		
	}
	
	@Override
	public boolean deleteAccount(long accountNumber) throws SQLException{
		// TODO Auto-generated method stub
		Accounts oldAccount=getAccountByNumber(accountNumber);
		psmt=conn.prepareStatement("delete from Accounts where Account_Number=?");
		psmt.setLong(1, accountNumber);
		int deleted=psmt.executeUpdate();
		return deleted>0;
	}
     @Override
	public List<Accounts> getAllAccounts() throws SQLException {		
	psmt=conn.prepareStatement("select * from Accounts");		
	 rsAccounts=psmt.executeQuery();		
		List<Accounts> accounts=new ArrayList<>();
		while(rsAccounts.next()) {
		Accounts account=new Accounts();
		account.setAccountNumber(rsAccounts.getLong("account_Number"));
		account.setInsuredName(rsAccounts.getString("insured_Name"));
		account.setInsuredStreet(rsAccounts.getString("insured_Street"));
		account.setInsuredCity(rsAccounts.getString("insured_City"));
		account.setInsuredState(rsAccounts.getString("insured_State"));
		account.setInsuredZip(rsAccounts.getLong("insured_Zip"));
		account.setBusinessSegment(rsAccounts.getString("business_Segment"));
		accounts.add(account);
	}
		return accounts;
	}
}

