package com.cg.iqgs.dao;
import java.sql.SQLException;
import java.util.List;
import com.cg.iqgs.model.Accounts;
public interface AccountRepo {
	public Accounts addAccount(Accounts account)throws SQLException;
	public Accounts getAccountByNumber(long accountNumber)throws SQLException;
	public Accounts updateAccount(Accounts account)throws SQLException;
	public boolean deleteAccount(long accountNumber)throws SQLException;
	public List<Accounts> getAllAccounts()throws SQLException;
}

