package com.cg.iqgs.service;
import java.sql.SQLException;
import java.util.List;
import com.cg.iqgs.model.Accounts;
public interface AccountService {
public Accounts addAccount(Accounts account) throws SQLException;
public Accounts getAccountByNumber(long accountNumber) throws SQLException;

public Accounts updateAccount(Accounts account) throws SQLException;

public boolean deleteAccount(long accountNumber) throws SQLException;
	public List<Accounts> getAllAccounts()throws SQLException;
}




