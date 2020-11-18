package com.cg.oiqgsWebAppProj.service;
import java.sql.SQLException;
import java.util.List;

import com.cg.oiqgsWebAppProj.model.Accounts;
public interface AccountService {
public Accounts addAccount(Accounts account)throws SQLException;	
	public List<Accounts> getAllAccounts()throws SQLException;
}



