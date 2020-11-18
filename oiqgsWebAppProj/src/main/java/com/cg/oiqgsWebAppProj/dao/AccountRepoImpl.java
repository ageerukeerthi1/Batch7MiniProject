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
		psmt=conn.prepareStatement("insert into Accounts values(?,?,?,?)");
		psmt.setLong(1, account.getAccount_Number());
		psmt.setString(2, account.getInsured_Name());
		psmt.setString(3, account.getInsured_Street());
		psmt.setString(4, account.getInsured_City());
		psmt.setString(5, account.getInsured_State());
		psmt.setLong(6, account.getInsured_Zip());
		psmt.setString(7, account.getBusiness_Segment());
		psmt.executeUpdate();
		return account;
	}	
	@Override
	public Accounts getAccountByNumber(long account_Number) throws SQLException {
		psmt=conn.prepareStatement("select * from Accounts where Account_Number=?");
		psmt.setLong(1, account_Number);
		rsAccounts=psmt.executeQuery();
		if(!rsAccounts.next()) {
			throw new AccountNotFoundException("Account with Number ["+account_Number+"] does not exist");
		}
		Accounts account=new Accounts();
		account.setAccount_Number(rsAccounts.getLong("Account_Number"));
		account.setInsured_Name(rsAccounts.getString("Insured_Name"));
		account.setInsured_Street(rsAccounts.getString("Insured_Street"));
		account.setInsured_City(rsAccounts.getString("Insured_City"));
		account.setInsured_State(rsAccounts.getString("Insured_State"));
		account.setInsured_Zip(rsAccounts.getLong("Insured_Zip"));
		account.setBusiness_Segment(rsAccounts.getString("Business_Segment"));
		return account;
	}
	
	@Override
	public Accounts updateAccount(Accounts account) throws SQLException{
		// TODO Auto-generated method stub
		Accounts oldStudent=getAccountByNumber(account.getAccount_Number());
		psmt=conn.prepareStatement("update Accounts set Insured_Name=?, Insured_Street=?, Insured_City=?,Insured_State=?, Insured_Zip=?, Business_Segment=? where Account_Number=?");
		psmt.setLong(1, account.getAccount_Number());
		psmt.setString(2, account.getInsured_Name());
		psmt.setString(3, account.getInsured_Street());
		psmt.setString(4, account.getInsured_City());
		psmt.setString(5, account.getInsured_State());
		psmt.setLong(6, account.getInsured_Zip());
		psmt.setString(7, account.getBusiness_Segment());
		
		psmt.executeUpdate();
		
		return account;
		
	}
	
	@Override
	public boolean deleteAccount(long account_Number) throws SQLException{
		// TODO Auto-generated method stub
		Accounts oldAccount=getAccountByNumber(account_Number);
		psmt=conn.prepareStatement("delete from Accounts where Account_Number=?");
		psmt.setLong(1, account_Number);
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
		account.setAccount_Number(rsAccounts.getLong("Account_Number"));
		account.setInsured_Name(rsAccounts.getString("Insured_Name"));
		account.setInsured_Street(rsAccounts.getString("Insured_Street"));
		account.setInsured_City(rsAccounts.getString("Insured_City"));
		account.setInsured_State(rsAccounts.getString("Insured_State"));
		account.setInsured_Zip(rsAccounts.getLong("Insured_Zip"));
		account.setBusiness_Segment(rsAccounts.getString("Business_Segment"));
		accounts.add(account);
	}
		return accounts;
	}
}
