package com.cg.oiqgsWebAppProj.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import com.cg.oiqgsWebAppProj.model.Accounts;
import com.cg.oiqgsWebAppProj.dao.DBUtil;
import com.cg.oiqgsWebAppProj.exception.AccountNotFoundException;
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
		psmt=conn.prepareStatement("insert into Accounts values(?,?,?,?,?,?,?)");
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
	public Accounts getAccountByNumber(long accountNumber) throws SQLException {
		psmt=conn.prepareStatement("select * from Accounts where accountNumber=?");
		psmt.setLong(1, accountNumber);
		rsAccounts=psmt.executeQuery();
		if(!rsAccounts.next()) {
			throw new AccountNotFoundException("Account with Number ["+accountNumber+"] does not exist");
		}
		Accounts account=new Accounts();
		account.setAccountNumber(rsAccounts.getLong("accountNumber"));
		account.setInsuredName(rsAccounts.getString("insuredName"));
		account.setInsuredStreet(rsAccounts.getString("insuredStreet"));
		account.setInsuredCity(rsAccounts.getString("insuredCity"));
		account.setInsuredState(rsAccounts.getString("insuredState"));
		account.setInsuredZip(rsAccounts.getLong("insuredZip"));
		account.setBusinessSegment(rsAccounts.getString("businessSegment"));
		return account;
	}
	
	@Override
	public Accounts updateAccount(Accounts account) throws SQLException{
		// TODO Auto-generated method stub
		Accounts oldStudent=getAccountByNumber(account.getAccountNumber());
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
		account.setAccountNumber(rsAccounts.getLong("accountNumber"));
		account.setInsuredName(rsAccounts.getString("insuredName"));
		account.setInsuredStreet(rsAccounts.getString("insuredStreet"));
		account.setInsuredCity(rsAccounts.getString("insuredCity"));
		account.setInsuredState(rsAccounts.getString("insuredState"));
		account.setInsuredZip(rsAccounts.getLong("insuredZip"));
		account.setBusinessSegment(rsAccounts.getString("businessSegment"));
		accounts.add(account);
	}
		return accounts;
	}
}
